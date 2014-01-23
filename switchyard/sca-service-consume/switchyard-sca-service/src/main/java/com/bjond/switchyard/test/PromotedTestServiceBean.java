package com.bjond.switchyard.test;

import org.switchyard.component.bean.Service;

/**
 * Define our service endpoint and implement the methods as we did in the
 * simpler examples.
 * 
 * @author benjamin.flynn@bjondinc.com
 */
@Service(PromotedTestService.class)
public class PromotedTestServiceBean implements PromotedTestService {
	
	@Override
	public void testLogService(String pLogInfo) {
		System.out.println(pLogInfo);
	}
}

