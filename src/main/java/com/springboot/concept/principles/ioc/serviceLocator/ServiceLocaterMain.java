package com.springboot.concept.principles.ioc.serviceLocator;

import com.springboot.concept.principles.ioc.serviceLocator.services.Service;

public class ServiceLocaterMain {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("ServiceOne");
        service.execute();
    }
}
