package com.Parameters.qa;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param {

	@Test
	@Parameters("myName")
	public void base_2(String myName1) {
		System.out.println("Hello Word testmail2 "+myName1);
		//DesiredCapabilities cap=new DesiredCapabilities();
	}
}

