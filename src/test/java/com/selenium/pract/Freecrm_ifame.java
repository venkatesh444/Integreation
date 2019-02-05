package com.selenium.pract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Freecrm_ifame {

	@Test
	public void frame() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("http://www.freecrm.com");
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("venke444");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("venkat444");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		d.switchTo().frame(1);
		
		d.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		Actions act=new Actions(d);
		
		act.moveToElement(d.findElement(By.xpath("//a[contains(text(),'New Contact')]"))).click().build().perform();
		
		
	}
	
	
	
}
