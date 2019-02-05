package com.selenium.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Windows_Handle {
	
	
	@Test
	public void Handling() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "D:\\seleniumrequriments\\chromedriver.exe");
		//WebDriver d=new ChromeDriver();
		
		d.get("https://www.online.citibank.co.in/");
		
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//div[@class='signOnGroupHldr visible-desktop rounded']//p//a[1]//img[1]")).click();
		
		String parents=d.getWindowHandle();
		
		for(String subwindow:d.getWindowHandles())
		{
			d.switchTo().window(subwindow);
		}
		System.out.println(d.findElement(By.xpath("//div[@class='bold']")).getText());
		
		Thread.sleep(3000);
		d.close();
		
		d.switchTo().window(parents);
	}

}
