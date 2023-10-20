package com.testclasses;

import java.io.IOException;

import org.testng.annotations.*;

import com.base.BaseClass;
import com.pom.Login_Page1;

public class Login_Test1 extends BaseClass {
	
	
		Login_Page1 login;
			
			@BeforeMethod
			public void SetUp() throws IOException 
			{
				launchTheWeb();
			
				
			}
			
			@AfterMethod
			public void tearDown()
			
			{
				driver.quit();
			}
			
			@Test
			public void loginTest()
			{
				login= new Login_Page1();
				login.setUsername(login.getUsername());
				login.setPassword(login.getPassword());
				login.ClickOnLoginButton();
				
				
				
			}



			}


