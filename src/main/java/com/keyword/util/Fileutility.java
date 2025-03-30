package com.keyword.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {

	public String readproprty(String filepath, String key) {
		FileInputStream file = null;
		String value = "";
		try {
			
			file = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties prop = new Properties();

		try {
			prop.load(file);
			value=prop.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;

	}

}
