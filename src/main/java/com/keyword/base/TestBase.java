package com.keyword.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.keyword.UIKeywords;
import com.keyword.util.Environment;

public class TestBase {
	
	@BeforeMethod
	public void setup() {
		UIKeywords.openBrowser(Environment.getbrowsername());
		
		
		
		
		
		System.out.println("open chrome");
		String env=System.getProperty("env");
		if(env==null) {
			env="qa";
			System.out.println("launching on qa environment by default");
		}
		System.out.println(env);
		//right click on the class,pom.xml,testng,xml-Run Configuration-Arguments=-Denv=qa
		UIKeywords.launchAppUrl(env);

	}
	
	
	
	

}
