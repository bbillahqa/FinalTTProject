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

@When("^Welcome Admin MouseHover Welcome Admin, click logout$")
public void welcome_Admin_MouseHover_Welcome_Admin_click_logout() throws Throwable {
	Actions action = new Actions(driver);
	WebElement jt = driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
	action.moveToElement(jt).moveToElement(driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"))).click().build().perform();
}

@Then("^Admin Logout Successful$")
public void admin_Logout_Successful() throws Throwable {
	System.out.println("You have successfully logged out of OrangeHRM");
	
}

@Then("^Browser close$")
public void browser_close() throws Throwable {
	driver.quit();
}
}
