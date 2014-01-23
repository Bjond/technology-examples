package com.bjond.switchyard.test;

import org.switchyard.component.bean.Service;

/**
 * This class implements our service definition and uses
 * the Service annotation to let the SwitchYard container
 * know it exists.
 * 
 * @author benjamin.flynn@bjondinc.com
 */
@Service(SimpleTestService.class)
public class SimpleTestServiceBean implements SimpleTestService {
	
	@Override
	public void testLogService(String pLogInfo) {
		System.out.println(pLogInfo);
	}
}
