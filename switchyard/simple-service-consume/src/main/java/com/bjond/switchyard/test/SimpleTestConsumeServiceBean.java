package com.bjond.switchyard.test;

import org.switchyard.component.bean.Service;

/**
 * This is the service implementation. Notice that it implements
 * the interface that we designate as the service contract.
 * 
 * @author benjamin.flynn@bjondinc.com
 */
@Service(SimpleTestConsumeService.class)
public class SimpleTestConsumeServiceBean implements SimpleTestConsumeService {
	
	@Override
	public void testLogService(String pLogInfo) {
		System.out.println(pLogInfo);
	}
}
