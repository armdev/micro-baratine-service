package com.micro.resources;

import io.baratine.service.Service;
import io.baratine.web.Get;
import io.baratine.web.Path;
import io.baratine.web.Query;
import io.baratine.web.RequestWeb;

/**
 *
 * @author armdev
 */
@Service
public class CoreResource {

    // access http://127.0.0.1:8080/health
    @Get("/health")
    public void doHealth(RequestWeb request) {
        request.ok("Health is Ok!");
    }

    // http://127.0.0.1:8080/doPing
    @Get
    public void doPing(RequestWeb request) {
        request.ok("Ping? Pong!!!");
    }

    //http://127.0.0.1:8080/search?token=secretmessage
    @Get("/search")
    public void doQuery(@Query("token") String token, RequestWeb request) {
        request.ok("Is this secret token  " + token + " ?");
    }

    //http://127.0.0.1:8080/path/armdev
    @Get("/path/{name}")
    public void doPath(@Path("name") String name, RequestWeb request) {
        request.ok("Path name is " + name);
    }
    //http://127.0.0.1:8080/million
    @Get("/million")
    public void giveMeMillion(RequestWeb request) {        
        long startTime = System.currentTimeMillis();
        for(int i= 0; i < 1000000; i++){
         System.out.println("To million " +i);
        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        request.ok("You earn million US $ in  " + totalTime / 1000 + "  seconds");
    }

}
