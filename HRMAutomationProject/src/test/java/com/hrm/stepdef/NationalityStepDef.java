package com.hrm.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.hrm.pages.AdminPage;
import com.hrm.pages.LoginPage;
import com.hrm.utility.PositiveHook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NationalityStepDef {

	WebDriver driver;

	public NationalityStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	AdminPage es= new AdminPage(driver);
	
	@Given("^User logged in to orangeHRM demo account$")
	public void user_logged_in_to_orangeHRM_demo_account() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		LoginPage pf = new LoginPage(driver);
		pf.userid().sendKeys("Admin");
		pf.password().sendKeys("admin");
		pf.login().click();

	}

	@When("^Click on Admin$")
	public void click_on_Admin() throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Adminbtn().click();
	}

	@When("^Select Nationalities$")
	public void select_Nationalities() throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Nationalitybtn().click();
	}

	@When("^Click on add Button$")
	public void click_on_add_Button() throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Adminaddbtn().click();
	}

	@Then("^Enters Name \"([^\"]*)\"$")
	public void enters_Name(String arg1) throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Nationalityname().sendKeys("Bengali");
	}

	@Then("^Clicks Save$")
	public void clicks_Save() throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Adminsavebtn().click();
	}

	@Then("^Verify that Bengali is under Nationalities$")
	public void verify_that_Bengali_is_under_Nationalities() throws Throwable {
		System.out.println("You have successfully added new Nationality");
		driver.quit();
	}
	
	//Negative Scenario

@Given("^user logged in to OrangeHRM demo account$")
public void user_logged_in_to_OrangeHRM_demo_account() throws Throwable {
    
	System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	LoginPage pf = new LoginPage(driver);
	pf.userid().sendKeys("Admin");
	pf.password().sendKeys("admin");
	pf.login().click();
	
}

@When("^clicks on Admin$")
public void clicks_on_Admin() throws Throwable {
	AdminPage es= new AdminPage(driver);
	es.Adminbtn().click();
}

@When("^Select Nationality$")
public void select_Nationality() throws Throwable {
	AdminPage es= new AdminPage(driver);
	es.Nationalitybtn().click();
}

@When("^select the \"([^\"]*)\" option\\.$")
public void select_the_option(String arg1) throws Throwable {
	AdminPage es= new AdminPage(driver);
	es.Bengladeshibtn().click();
    
}

@When("^click the delete button$")
public void click_the_delete_button() throws Throwable {
	AdminPage es= new AdminPage(driver);
	es.Admindelete().click();
	
}

@Then("^Verify Bangladeshi option has been deleted from Nationality$")
public void verify_Bangladeshi_option_has_been_deleted_from_Nationality() throws Throwable {
	System.out.println("You have successfully deleted the Nationality");
	driver.quit();
}
}
