package com.bjond.switchyard.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/consume")
public class TriggerOtherApplication extends Application
{
	@SuppressWarnings("unchecked")
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(TriggerOtherEndpoint.class));
    }
}
