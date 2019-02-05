package com.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Fb_script {

	
	@Test()
	public void list() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("http://www.freecrm.com");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("venke444");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("venkat444");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	}
	
}
