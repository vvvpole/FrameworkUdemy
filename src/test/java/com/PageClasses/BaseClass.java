package com.PageClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {
	Properties properties;
	FileInputStream fis;
	String propertiesfilepath = System.getProperty("user.dir")+"/src/config.properties";
	
	public  BaseClass () throws IOException {
		properties=new Properties();
		fis= new FileInputStream(propertiesfilepath);
		properties.load(fis);
	}
	
	
}
