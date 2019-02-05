package com.selenium.pract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmail_window {

	
	@Test
	public void gmailwindow() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumrequriments\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		d.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		
		String parent_window=d.getWindowHandle();
		
		Set <String> s1=d.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			String child_window=i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				d.switchTo().window(child_window);
				
				Thread.sleep(3000);
				
				System.out.println(d.getTitle());
				d.close();
			}
		}
		
		d.switchTo().window(parent_window);

		d.quit();
		
	}
	
	
}
