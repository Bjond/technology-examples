package com.bjond.switchyard.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.switchyard.component.bean.Reference;

import com.bjond.switchyard.test.PromotedTestService;

/**
 * This will consume a simple service that is packaged in another war file. This
 * uses sca binding for simple in-jvm communication.
 * 
 * @author benjamin.flynn@bjondinc.com
 */
@Path("/trigger")
public class TriggerOtherEndpoint
{	
	@Inject
	@Reference
	PromotedTestService testService;
	
	/**
	 * Injects the interface (ths project has a copy of the interface for simplicity;
	 * we'll want to have a shared jar file in our production project) through CDI.
	 * Even though the service is implemented in a separate war, and thus is not 
	 * available on the classpath, the call works.
	 * 
	 * Here;s the URL to trigger the call:
	 * http://localhost:8080/switchyard-sca-consumer/consume/trigger/switchyard
	 * 
	 * @return The http response.
	 */
	@GET
	@Path("/switchyard")
	public Response triggerService()
	{
		testService.testLogService("This is a log message.");
		return Response.status(200).entity("Everything is good.").build();
	}
}
