package com.selenium.pract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alerttext {
	
	@Test()
	public void ksrtc() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		
		d.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		
		Thread.sleep(3000);
		
		Alert alt=d.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		
	}

}
