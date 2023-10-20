package com.testclasses;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.*;

import com.base.BaseClass;
import com.pom.LoginPom;

public class LoginTest extends BaseClass { // Extends because we need driver to be available here
	
	LoginPom loginPom = new LoginPom();  // We need POM classes methods for every test that's why we are creating the object of POM class globally
	
	@BeforeMethod  // Bcoz first we want to exeute this method and it will execute before each test method 
   public void setUp()
   {
	   
		try {
			launchTheWeb();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	   // First of all we have to launch the url so we call the methods of Base Class
   }
   
	@AfterMethod
   public void tearDown() 
   {
	   driver.quit();  // At last it should pause or all windows should close
   }
   
	@Test
   public void loginTest()
   {
	   loginPom.setInputUsername(loginPom.getUsername());
	   loginPom.setInputPassword(loginPom.getPassword());
	   loginPom.loginButtonClick();
   }
}
