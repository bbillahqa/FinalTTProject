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

public class EmploymentStatusStepDef {

	WebDriver driver;

	public EmploymentStatusStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	AdminPage es= new AdminPage(driver);
	
	@Given("^User logged in to OrangeHRM demo account$")
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

	@When("^Clicks on Admin$")
	public void clicks_on_Admin() throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Adminbtn().click();
	}

	@When("^Admin MouseHover Admin, click job, select Employement Status$")
	public void admin_MouseHover_Admin_click_job_select_Employement_Status() throws Throwable {
		Actions action = new Actions(driver);
		WebElement jt = driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));
		action.moveToElement(jt).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_employmentStatus\"]"))).click().build().perform();
	}

	@When("^Click on Add Button$")
	public void click_on_Add_Button() throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Adminaddbtn().click();
	}

	@Then("^Entered Name \"([^\"]*)\"$")
	public void entered_Name(String arg1) throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.ESname().sendKeys("Freelancer");
	}

	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		AdminPage es= new AdminPage(driver);
		es.Adminsavebtn().click();
	}

	@Then("^Verify that Freelance is under Employment Status$")
	public void verify_that_Freelance_is_under_Employment_Status() throws Throwable {
		System.out.println("You have successfully added new Employement Status");
		driver.quit();
	}
	

@When("^Select the \"([^\"]*)\" option$")
public void select_the_option(String arg1) throws Throwable {
	AdminPage es= new AdminPage(driver);
	es.esfulltimebtn().click();
}

@When("^Click on delete button$")
public void click_on_delete_button() throws Throwable {
	AdminPage es= new AdminPage(driver);
	es.Admindeletebtn().click();
}

@Then("^Verify Full-Time Permanent option has been deleted from Employment Status$")
public void verify_Full_Time_Permanent_option_has_been_deleted_from_Employment_Status() throws Throwable {
	System.out.println("You have successfully deleted the Employement Status");
	driver.quit();
}
}
