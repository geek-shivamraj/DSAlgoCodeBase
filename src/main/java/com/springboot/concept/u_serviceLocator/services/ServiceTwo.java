package com.springboot.concept.u_serviceLocator.services;

import com.springboot.concept.u_serviceLocator.Cache;

public class ServiceTwo implements Service {
    @Override
    public String getName() {
        return "ServiceTwo";
    }

    @Override
    public void execute() {
        System.out.println("Executing ServiceTwo");
    }
}
