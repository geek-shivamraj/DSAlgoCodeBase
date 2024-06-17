package com.springboot.concept.principles.ioc.serviceLocator;

import com.springboot.concept.principles.ioc.serviceLocator.services.ServiceOne;

/*
    InitialContext Object acts start point in the lookup & creation process.
    Service Providers provide the context object, which varies depending on the
    type of business object provided by the Service Locator's lookup & creation service.
 */
public class InitialContext {
    public Object lookup(String name) {
        if(name.equalsIgnoreCase("ServiceOne")) {
            System.out.println("Creating a new ServiceOne Object");
            return new ServiceOne();
        } else if(name.equalsIgnoreCase("ServiceTwo")) {
            System.out.println("Creating a new ServiceTwo object");
        }
        return null;
    }
}
