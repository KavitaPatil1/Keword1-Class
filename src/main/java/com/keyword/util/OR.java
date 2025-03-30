package com.keyword.util;

public class OR {
	
	
	public static String getlocator(String key) {
		Fileutility util=new Fileutility();
		String basedir=System.getProperty("user.dir");
		return util.readproprty(basedir+"/src/main/resources/Objectrepositories.properties", key);
		

	}

}
