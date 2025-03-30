package com.keyword.util;

public class Environment {
	
	private static final String filepath=System.getProperty("user.dir")+"/src/main/resources/environment.properties";
	
	public static  String getbrowsername() {
		Fileutility util=new Fileutility();
		String browserName=util.readproprty(filepath,"browser.name");
		return browserName;
		

	}
	/*
	public static void getappurl() {
		Fileutility util=new Fileutility();
		String baseurl=System.getProperty("user.dir");
		//util.readproprty(baseurl+"src/main/java/env", baseurl);

	}
*/
}
