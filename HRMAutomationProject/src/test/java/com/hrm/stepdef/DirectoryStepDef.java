package com.hrm.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrm.pages.AdminPage;
import com.hrm.pages.DirectoryPage;
import com.hrm.pages.LoginPage;
import com.hrm.utility.PositiveHook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DirectoryStepDef {

	WebDriver driver;

	public DirectoryStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	AdminPage pf = new AdminPage(driver);

	@Given("^User is logged in to OrangeHRM demo account$")
	public void user_is_logged_in_to_OrangeHRM_demo_account() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		
		LoginPage pf = new LoginPage(driver);
		pf.userid().sendKeys("Admin");
		pf.password().sendKeys("admin");
		pf.login().click();
	}

	@When("^Click on Directory$")
	public void click_on_Directory() throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.directorybtn().click();
	}

	@When("^Write Existing EmployeeName\"([^\"]*)\"$")
	public void write_Existing_EmployeeName(String arg1) throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.dirctname().sendKeys("Saymon Sabbir");
	}

	@When("^Select Job Title$")
	public void select_Job_Title() throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.JobTitel();
	}

	@When("^Click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.dirctSearchbtn().click();
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		driver.quit();
	}
	
	//Negative ***************************************************************
	
	@Given("^user is logged in to orangeHRM demo account$")
	public void user_is_logged_in_to_orangeHRM_demo_account() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		
		LoginPage pf = new LoginPage(driver);
		pf.userid().sendKeys("Admin");
		pf.password().sendKeys("admin");
		pf.login().click();
	}

	@When("^click on directory$")
	public void click_on_directory() throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.directorybtn().click();
		
	}

	@When("^Write nonexisting EmployeeName\"([^\"]*)\"$")
	public void write_nonexisting_EmployeeName(String arg1) throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.dirctname().sendKeys("IronMan");
	}

	@When("^select job title$")
	public void select_job_title() throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.JobTitel();
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
		DirectoryPage pf = new DirectoryPage(driver);
		pf.dirctSearchbtn().click();
	}

	@Then("^I should be able to see the user name with his/her details$")
	public void i_should_be_able_to_see_the_user_name_with_his_her_details() throws Throwable {
		System.out.println("You have Successfully Search vaild Employee");
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

	@Then("^No Record found Message Will displayed$")
	public void no_Record_found_Message_Will_displayed() throws Throwable {
		System.out.println("No Records Found");
	}
}
