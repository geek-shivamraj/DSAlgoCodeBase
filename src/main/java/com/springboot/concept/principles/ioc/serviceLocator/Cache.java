package com.springboot.concept.principles.ioc.serviceLocator;

import com.springboot.concept.principles.ioc.serviceLocator.services.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services;
    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for(Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName))  {
                System.out.println("Returned Cached " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for(Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName()))
                exists = true;
            if(!exists)
                services.add(newService);
        }
    }

}
