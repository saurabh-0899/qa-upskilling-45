package com.reusableFunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Library;

public class SeleniumReusable extends Library{
	
	public SeleniumReusable(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void EnterValue(WebElement element, String Text) 
	{
		try 
		{
			element.sendKeys(Text);
		}
		catch (Exception e) 
		{
			System.out.println("No Such Element Exception");
		}
	}
	
	public void clickElement(WebElement ele) 
	{
		try 
		{
			ele.click();
		}
		catch(Exception e) 
		{
			System.out.println("No Such Element Exception");
		}
	}
	public void getTitle(WebDriver driver) 
	{
		try 
		{
			System.out.println(driver.getTitle());
		}
		catch(Exception e) 
		{
			System.out.println("No Title can be extracted");
		}
	}
	public void screenshot(String path) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	
		try 
		{
			FileUtils.copyFile(source, new File(path));
		}
		catch(Exception e) 
		{
			System.out.println("Screenhsot not found");
		}
   	
	}
}
