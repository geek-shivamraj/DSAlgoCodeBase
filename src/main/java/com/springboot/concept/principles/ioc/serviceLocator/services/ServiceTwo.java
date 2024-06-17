package com.springboot.concept.principles.ioc.serviceLocator.services;

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
