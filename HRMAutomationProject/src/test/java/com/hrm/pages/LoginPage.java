package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"txtUsername\"]") 
	WebElement userid;
	
	public WebElement userid() {
		return userid;
	}


	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	WebElement password;
	
	public WebElement password() {
		return password;
	}

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	WebElement login;
	
	public WebElement login() {
		return login;
	}
	
	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	WebElement errormsg;
	
	  public WebElement ErrorMessage() {
			
		  String ActualError=errormsg.getText();
		  String ExpectedError= "Invalid credentials";
			
		Assert.assertEquals(ActualError, ExpectedError);
		return errormsg;
		}
}
