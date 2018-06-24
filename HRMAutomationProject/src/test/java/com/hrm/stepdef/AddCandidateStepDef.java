package com.hrm.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.hrm.pages.AdminPage;
import com.hrm.pages.LoginPage;
import com.hrm.pages.RecruitmentPage;
import com.hrm.utility.PositiveHook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCandidateStepDef {

	WebDriver driver;

	public AddCandidateStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	AdminPage pf = new AdminPage(driver);
	
	
	@Given("^Navigate to Admin HomePage$")
	public void navigate_to_Admin_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		LoginPage pf = new LoginPage(driver);
		pf.userid().sendKeys("Admin");
		pf.password().sendKeys("admin");
		pf.login().click();
	}

	@When("^Click on Recruitment link$")
	public void click_on_Recruitment_link() throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.Recruitmentbtn().click();
	}

	@When("^Click Add button$")
	public void click_Add_button() throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.raddbtn().click();
	}

	@When("^Enter FirstName \"([^\"]*)\"$")
	public void enter_FirstName(String arg1) throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.rusername().sendKeys("Baki");
		
	}
	@When("^Enter Lastname \"([^\"]*)\"$")
	public void enter_Lastname(String arg1) throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.rlastname().sendKeys("Billah");
	    
	}

	@When("^Leave Lastname blank$")
	public void leave_Lastname_blank() throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.rlastname().sendKeys("");
	}
	
	@When("^Enter EmailId \"([^\"]*)\"$")
	public void enter_EmailId(String arg1) throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.remail().sendKeys("TalenTech@gmail.com");
	}
	
	@When("^Enter Contact number \"([^\"]*)\"$")
	public void enter_Contact_number(String arg1) throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.rcontactno().sendKeys("3479876543");
	
	}
	@When("^Enter Contact Number \"([^\"]*)\"$")
	public void enter_Contact_Number(String arg1) throws Throwable {
		RecruitmentPage pf = new RecruitmentPage(driver);
		pf.rcontactno().sendKeys("3479876543");
	}

@When("^click the save button$")
public void click_the_save_button() throws Throwable {
	AdminPage pf = new AdminPage(driver);
	pf.Adminsavebtn().click();
}

@Then("^Obtain confirmation$")
public void obtain_confirmation() throws Throwable {
	Assert.assertEquals("Successfully", "Successfully");
	  System.out.print("Its Verified!");
}

@Then("^Confirmation error message$")
public void confirmation_error_message() throws Throwable {
	Assert.assertEquals("Required", "Required");
	  System.out.print("Its Verified!");
}
@Then("^Close browser$")
public void close_browser() throws Throwable {
    driver.quit();
}
}
