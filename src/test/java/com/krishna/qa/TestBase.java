package com.krishna.qa;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestBase {
	Properties prop=new Properties();
@Test(groups= {"smoke","regression"})
public void base() throws IOException {
	System.out.println("Hello Word1");
	//System.out.println(System.getenv("${project.artifactId}"));

	//System.out.println(prop.getProperty("${project.artifactId}"));
	//java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
	//prop.load(inputStream);
	//System.out.println(prop.getProperty("app.port"));
}
}
