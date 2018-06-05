package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageObjectModel {

	WebDriver driver;

	public PageObjectModel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"txtUsername\"]") 
	WebElement userid;

	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"spanMessage\"]")
	WebElement errormsg;

	public WebElement userid() {
		return userid;
	}

	public WebElement password() {
		return password;
	}

	public WebElement login() {
		return login;
	}

      public WebElement ErrorMessage() {
		
	  String ActualError=errormsg.getText();
	  String ExpectedError= "Invalid credentials";
		
	Assert.assertEquals(ActualError, ExpectedError);
	return errormsg;
	}
	
}
