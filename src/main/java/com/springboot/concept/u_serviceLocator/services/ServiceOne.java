package com.springboot.concept.u_serviceLocator.services;

import com.springboot.concept.u_serviceLocator.Cache;

public class ServiceOne implements Service {
    @Override
    public String getName() {
        return "ServiceOne";
    }

    @Override
    public void execute() {
        System.out.println("Executing ServiceOne");
    }
}
