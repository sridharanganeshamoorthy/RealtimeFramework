package org.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Runner2Test {
	
	@Test
	public void loginTestCases() {
		Result r = JUnitCore.runClasses(Login1.class,Login2.class,Login3.class);
		
		System.out.println(r.getFailureCount());
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getRunCount());
		System.out.println(r.getRunTime());
		

	}

}
