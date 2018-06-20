package com.hrm.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.hrm.pages.AdminPage;
import com.hrm.pages.LoginPage;
import com.hrm.utility.PositiveHook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDef {

	WebDriver driver;

	public LogoutStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	AdminPage pf = new AdminPage(driver);

@Given("^Admin in Admin home page$")
public void admin_in_Admin_home_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	LoginPage pf = new LoginPage(driver);
	pf.userid().sendKeys("Admin");
	pf.password().sendKeys("admin");
	pf.login().click();
	
}

@When("^Admin click on Welcom Admin link$")
public void admin_click_on_Welcom_Admin_link() throws Throwable {
	AdminPage lo= new AdminPage(driver);
	lo.Welcomeadmin().click();
	
}

@When("^Click on LOgout link$")
public void click_on_LOgout_link() throws Throwable {
	AdminPage lo= new AdminPage(driver);
	lo.AdminWelcomebtn().click();	
	Thread.sleep(100);
	lo.AdminLogoutbtn().click();
}

@Then("^Admin Logout Success full$")
public void admin_Logout_Success_full() throws Throwable {
	Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	String actualURL= driver.getCurrentUrl();
	System.out.println("Actual URL for This page is :" +actualURL);
}

@Then("^Browser close$")
public void browser_close() throws Throwable {
	driver.quit();
}
}
