package com.listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.listener.TestngListener.class)
public class My_Firsttest {

	
	@Test()
	public void google()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("http://www.freecrm.com");
		System.out.println(d.getTitle());
		d.quit();
		
		
	}
	
	
	@Test()
	public void test2()
	{
		String str="venkatesh";
		String str1="anjani";
		Assert.assertEquals(str1, str);
		
	}
}
