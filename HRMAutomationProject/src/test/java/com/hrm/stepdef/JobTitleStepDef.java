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

public class JobTitleStepDef {

	WebDriver driver;

	public JobTitleStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	AdminPage pf = new AdminPage(driver);
	LoginPage loginpf = new LoginPage(driver);

@Given("^User is already in HRM Admin page$")
public void user_is_already_in_HRM_Admin_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	LoginPage pf = new LoginPage(driver);
	pf.userid().sendKeys("Admin");
	pf.password().sendKeys("admin");
	pf.login().click();

}

@When("^User clicks on Admin$")
public void user_clicks_on_Admin() throws Throwable {
	AdminPage jt= new AdminPage(driver);
	jt.Adminbtn().click();
}

@When("^Admin MouseHover Admin, click job, select Jobtitle$")
public void admin_MouseHover_Admin_click_job_select_Jobtitle() throws Throwable {
	Actions action = new Actions(driver);
	WebElement jt = driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));
	action.moveToElement(jt).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]"))).click().build().perform();
}

@When("^click onAdd Button$")
public void click_onAdd_Button() throws Throwable {
	AdminPage jt= new AdminPage(driver);
	jt.Adminaddbtn().click();
}

@When("^Write jobTitel \"([^\"]*)\"$")
public void write_jobTitel(String arg1) throws Throwable {
	AdminPage jt= new AdminPage(driver);
	jt.Adminenterjob().sendKeys("Automation Tester");
}

@When("^Write JobDescription \"([^\"]*)\"$")
public void write_JobDescription(String arg1) throws Throwable {
	AdminPage jt= new AdminPage(driver);
	jt.jobdescrp().sendKeys("Test Using Selenium Java");
}

@When("^click Save$")
public void click_Save() throws Throwable {
	AdminPage jt= new AdminPage(driver);
	jt.Adminsavebtn().click();
}

@Then("^Confirmation Message will display$")
public void confirmation_Message_will_display() throws Throwable {
	System.out.println("You have successfully Add Job Titl");
	driver.quit();
}
}
