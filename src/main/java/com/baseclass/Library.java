package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	
	public static Properties prop;
	public static WebDriver driver;
	

	public void launchApplication() throws IOException 
	{
		FileInputStream file = new FileInputStream("/EMR_Project/src/test/resources/Properties/config.properties");
		prop = new Properties();
		prop.load(file);
		
		try {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
			{
				driver = new ChromeDriver();
			}
			else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) 
			{
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		catch(Exception e) 
		{
			System.out.println("Browser didn't launch");
		}
		
	}
	public void teardown()
	{
		driver.close();
	}
}
