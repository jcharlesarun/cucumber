package com.jck.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {

	static Properties property=null;
	public CommonUtils()
	{
		File file = new File("./Properties/config.properties");
		FileReader fileReader = null;
		try {
			 fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 property = new Properties();
		try {
			property.load(fileReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String getURL()
	{
		String url=property.getProperty("App_URL");
				return url;
	}

	public String getBrowser() {
		String browser=property.getProperty("Browser");
		return browser;
	}
}
