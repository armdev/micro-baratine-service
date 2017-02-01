package com.micro.application;

import com.micro.resources.CoreResource;
import io.baratine.web.Web;

/**
 *
 * @author Admin
 */
public class Application {

    public static void main(String[] args) throws Exception {
        Web.include(CoreResource.class);
        Web.go(args);
    }
}
