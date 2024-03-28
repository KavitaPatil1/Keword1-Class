package com_BrowserPropertiesReadCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadBrowserName {
	
	
	 public  String gereadPropetiesFile(String key) {
		 
		 
		 String value="";
		 String base =System.getProperty("user.dir");
		 FileInputStream file=null;
		try {
			file = new FileInputStream(base+"/src/main/resources/BrowserAndUrlSelectionFile.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Properties prp=new Properties();
		 try {
			prp.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 value=prp.getProperty(key);
		 
		 
		 
		 return value;
	
		

	}
	 
	 public  String getproperty(String file,String key) {
		 String value="";
		 String base =System.getProperty("user.dir");
		 FileInputStream file1=null;
		try {
			file1 = new FileInputStream(base+"/"+file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Properties prp=new Properties();
		 try {
			prp.load(file1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				file1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 value=prp.getProperty(key);
		 
		 
		 
		 return value;
	
		// TODO Auto-generated method stub

	}
	 
	

}
