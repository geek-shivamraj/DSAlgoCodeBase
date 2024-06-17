package com.springboot.concept.u_serviceLocator;

import com.springboot.concept.u_serviceLocator.services.Service;

/*
    Service locater pattern doesn't describe how to instantiate the services.
    It describes a way to register services & locate them.

    Service Locator abstracts the API lookup services, vendor dependencies,
    lookup complexities & business object creation & provides a simple interface to clients
    that can be reused.
 */

public class ServiceLocator {
    private static Cache cache;
    static {
        cache = new Cache();
    }

    public static Service getService(String name) {
        Service service = cache.getService(name);
        if(service != null)
            return service;

        InitialContext context = new InitialContext();
        Service serviceOne = (Service) context.lookup(name);
        cache.addService(serviceOne);
        return serviceOne;
    }
}
