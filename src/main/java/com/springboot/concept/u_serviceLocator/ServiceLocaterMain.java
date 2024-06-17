package com.springboot.concept.u_serviceLocator;

import com.springboot.concept.u_serviceLocator.services.Service;

public class ServiceLocaterMain {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("ServiceOne");
        service.execute();
    }
}
