package com.testclasses;

import com.base.BaseClass;
import com.pom.LoginPom;

public class LoginTest extends BaseClass { // Extends because we need driver to be available here
	
	LoginPom loginPom = new LoginPom();  // We need POM classes methods for every test that's why we are creating the object of POM class globally
	
	
   public void setUp()
   {
	   launchTheWeb();    // First of all we have to launch the url so we call the methods of Base Class
   }
   
   public void tearDown() 
   {
	   driver.quit();  // At last it should pause or all windows should close
   }
   
   public void loginTest()
   {
	   loginPom.getUsername();
	   loginPom.getPassword();
	   loginPom.loginButtonClick();
	   loginPom.setInputUsername(loginPom.getUsername());
   }
}
