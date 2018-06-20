package com.hrm.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.hrm.pages.LoginPage;
import com.hrm.pages.PIMPage;
import com.hrm.utility.PositiveHook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeStepDef {

	WebDriver driver;

	public AddEmployeeStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	PIMPage pf = new PIMPage(driver);

	@Given("^Admin navigate to Admin HomePage$") // Positive
	public void admin_navigate_to_Admin_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://opensource.demo.orangehrmlive.com/");

		LoginPage pf = new LoginPage(driver);
		pf.userid().sendKeys("Admin");
		pf.password().sendKeys("admin");
		pf.login().click();

	}

	@When("^Admin click on PIM link$")
	public void admin_click_on_PIM_link() throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.PIMbtn().click();
		Thread.sleep(1000);

		pf.AddEmployee().click();

	}

	@When("^Admin enter FirstName\"([^\"]*)\"$")
	public void admin_enter_FirstName(String arg1) throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.aefirstname().sendKeys("Sabbir");
	}

	@When("^Enter LastName\"([^\"]*)\"$")
	public void enter_LastName(String arg1) throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.aelastname().sendKeys("Saymon");
	}

	@When("^Enter EmployeeId \"<(\\d+)>$")
	public void enter_EmployeeId(int arg1) throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.aeID().clear();
		Thread.sleep(1000);
		pf.aeID().sendKeys("9090");
	}

	@When("^click on Save button$")
	public void click_on_Save_button() throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.aeSave().click();
	}

	@Then("^Admin will get confirmation$")
	public void admin_will_get_confirmation() throws Throwable {
		Assert.assertEquals("Sabbir Saymon", "Sabbir Saymon");
		System.out.print("Its Verified!");

	}

	@Then("^Browser Will close$")
	public void browser_Will_close() throws Throwable {
		driver.quit();

	} // Negative

	@When("^Admin enter FirstName \"([^\"]*)\"$")
	public void admin_enter_FirstName_(String arg1) throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.aelastname().sendKeys("");
	}

	@When("^Enter LastName \"([^\"]*)\"$")
	public void enter_LastName_(String arg1) throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.aelastname().sendKeys("Saymon");
	}

	@When("^Enter EmployeeID\"(\\d+)$")
	public void enter_EmployeeID(int arg1) throws Throwable {
		PIMPage pf = new PIMPage(driver);
		pf.aeID().clear();
		Thread.sleep(1000);
		pf.aeID().sendKeys("9090");
		
	}
	
	@Then("^Print Error Message$")
	public void print_Error_Message() throws Throwable {
		Assert.assertEquals("Required", "Required");
		  System.out.print("Unable to create new employee!");
		  driver.quit();
		  
	}
}
