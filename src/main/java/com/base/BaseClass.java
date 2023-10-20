package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	 public static WebDriver driver; // keeping driver static so that it will be avialable evrywhere
	 
//	 We have to tell the program that which property file to load and we have to give the path of that file using FileInputStrem
	 FileInputStream fileInputStream; 
	 
	 // To calculate the current directory or path of project
	 public static String projectPath = System.getProperty("user.dir");
	 
       public void launchTheWeb() throws IOException {    // Here main method is removed because we are using TestNG
		
    	   fileInputStream = new FileInputStream(projectPath +"\\src\\main\\resources\\Properties\\Config.properties");
    	   //                                 current directory                pth of the properties file
    	   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Properties properties = new Properties();
		
		// To load the path which is given in fileInputStrem
		properties.load(fileInputStream);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		properties.getProperty("weburl");
		
		driver.get(properties.getProperty("weburl")); // 
		
		
		
	}
	
	

}
