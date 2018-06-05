package com.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import com.pageObject.PageObjectModel;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import login.utility.LoginHook;



public class StepDefination {
	WebDriver driver;
	
	
	 @Given("^Admin Navigate to HRM Login page$")
	 public void admin_Navigate_to_HRM_Login_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver" );
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://opensource.demo.orangehrmlive.com/");
	 }

	 @When("^Admin Enter valid userName and password$")
	 public void admin_Enter_valid_userName_and_password() throws Throwable {
			PageObjectModel pf = new PageObjectModel(driver);
			pf.userid().sendKeys("Admin");
			pf.password().sendKeys("admin");
	 }

	 @When("^click on LOGIN Button$")
	 public void click_on_LOGIN_Button() throws Throwable {
			PageObjectModel pf = new PageObjectModel(driver);
			pf.login().click();
	 }

	 @Then("^Admin will Land in Admin HomePage$")
	 public void admin_will_Land_in_Admin_HomePage() throws Throwable {
		 Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");

	 }

	 @Then("^Close The Browser$")
	 public void close_The_Browser() throws Throwable {
		 driver.close();
	 }

	 @When("^Admin Enter invalid userName and Invalidpassword$")
	 public void admin_Enter_invalid_userName_and_Invalidpassword() throws Throwable {
		 PageObjectModel pf = new PageObjectModel(driver);
			pf.userid().sendKeys("BakiB");
			pf.password().sendKeys("BakiB");
	 }

	 @When("^click Login$")
	 public void click_Login() throws Throwable {
		 PageObjectModel pf = new PageObjectModel(driver);
			pf.login().click();
	 }

	 @Then("^Error message Dispaly$")
	 public void error_message_Dispaly() throws Throwable {
			PageObjectModel pf = new PageObjectModel(driver);
			
			Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/auth/validateCredentials");
			String actualURL= driver.getCurrentUrl();
			System.out.println("Actual URL for This page is :" +actualURL);
	 }
	 
}
