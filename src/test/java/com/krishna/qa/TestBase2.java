package com.krishna.qa;

import org.testng.annotations.Test;

public class TestBase2 {
	@Test(groups= {"smoke","regression"})
	public static void main() {
		System.out.println("Hello Word1 TestBase21");
	}
	@Test(groups= {"smoke"})
	public static void main2() {
		System.out.println("Hello Word1 main2");
	}
}
