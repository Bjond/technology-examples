package com.bjond.switchyard.test;

/**
 * This interface defines the service contract. Consuming service that
 * has a reference to the service (configured in switchyard.xml) whill
 * be able to CDI inject an instance to this interface and execute methods
 * accordingly.
 * 
 * @author benjamin.flynn@bjondinc.com
 */
public interface SimpleTestConsumeService {
	public void testLogService(String pLogInfo);
}
