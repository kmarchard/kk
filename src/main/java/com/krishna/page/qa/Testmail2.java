package com.krishna.page.qa;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Testmail2 {
	@Test
	@Parameters("myname")
	public void base_2(String myName1) {
		System.out.println("Hello Word testmail2 "+myName1);
	}
}
