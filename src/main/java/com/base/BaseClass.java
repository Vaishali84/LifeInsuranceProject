package com.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
       public void launchTheWeb() {    // Here main method is removed because we are using TestNG
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Properties property = new Properties();
		property.getProperty("weburl");
		
		driver.get(property.getProperty("weburl"));
		
	}
	
	

}
