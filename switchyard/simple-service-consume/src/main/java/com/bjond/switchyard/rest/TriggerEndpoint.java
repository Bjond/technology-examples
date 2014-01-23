package com.bjond.switchyard.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.switchyard.component.bean.Reference;

import com.bjond.switchyard.test.SimpleTestConsumeService;

/**
 * This endpoint is meant to demonstrate consuming a switchyard service. Notice
 * the interface is simply injected through CDI and the method is called.
 * 
 * This will be triggered by http://localhost:8080/simple-test-consume-service/simpletest/trigger/switchyard .
 * Just hit that URL in a browser once deployed.
 * 
 * @author benjamin.flynn@bjondinc.com
 */
@Path("/trigger")
public class TriggerEndpoint 
{
	// Inject the annotated service to call it.
	@Inject
	@Reference
	SimpleTestConsumeService service;
	
	@GET
	@Path("/switchyard")
	public Response triggerService()
	{
		service.testLogService("This is a test call.");
		return Response.status(200).entity("Everything is good.").build();
	}
}
