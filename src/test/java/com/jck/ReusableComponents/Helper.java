package com.jck.ReusableComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.jck.Utilities.CommonUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	public static WebDriver driver;
	static String browser ;
	static String url;
	static CommonUtils util = new CommonUtils();
	
	public static void launchBrowser()
	{
		try {
			url=util.getURL();
			System.out.println(url);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			browser=util.getBrowser();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(driver==null)
		{
		try {
			switch (browser) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(url);
				break;
			case "Opera":
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
