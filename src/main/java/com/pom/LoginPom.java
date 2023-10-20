package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

// Pom is one of the strategy of java to write the code in specific form
// Pom - Page Object Model
// In this class we have to write the each & every X-path from the login page and some methods and one constructor

public class LoginPom extends BaseClass{ // we need to extend the base class because we need driver to be available here
	

	// initialization of the WebEement done in the constructor
	//We are going to use or call init method from PageFactory Class to initialize FindBy
	
	{
		PageFactory.initElements(driver,this);
		
		// 1.this is reffering to our current object
		//2. When we create an object og LoginPom this is reffering to the current object
		// 3.And this will initialize the element bcoz we need to initialize th element from current class	
	   // This is object block       		
	}
	
	@FindBy(xpath = "//p[text()='Username : Admin']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement InputUsername;
	
	@FindBy(xpath = "//p[text()='Password : admin123']")
	private  WebElement Password;
		
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement InputPassword;
	
	@FindBy(xpath= "//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//p[contains(@class,'oxd-text oxd-text--p orangehrm-login')]")
	private  WebElement ForgotPassword;
	
	// 1st action class or method is to get the data 
	
	public String getUsername()
	{
		return Username.getText();
	}
	
	public String getPassword()
	{
		return Password.getText();
	}
	
	public void loginButtonClick()
	{
		LoginButton.click();
	}
	
	 public void setInputUsername(String setUsername)  // We have used setter method for InputUsername and InputPassword
	 { 
		InputUsername.sendKeys(setUsername);
	} 


	public void setInputPassword(String setPassword) 
	{
		InputPassword.sendKeys(setPassword);
	}

	
	
	
	
	
	
	
	
}
