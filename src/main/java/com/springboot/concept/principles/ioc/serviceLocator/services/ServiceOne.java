package com.springboot.concept.principles.ioc.serviceLocator.services;

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
