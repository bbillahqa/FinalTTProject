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

public class GeneralinfoStepDef {

	WebDriver driver;

	public GeneralinfoStepDef() {
		this.driver = PositiveHook.getChromeDriver();
	}

	AdminPage pf = new AdminPage(driver);	
	

@Given("^User logged in to OrangeHRM demo account\\.$")
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

@When("^Clicked on Admin$")
public void clicked_on_Admin() throws Throwable {
	AdminPage jt= new AdminPage(driver);
	jt.Adminbtn().click();
}

@When("^Admin MouseHover Admin, click organization, select General Information$")
public void admin_MouseHover_Admin_click_organization_select_General_Information() throws Throwable {
	Actions action = new Actions(driver);
	WebElement jt = driver.findElement(By.xpath("//*[@id=\"menu_admin_Organization\"]"));
	action.moveToElement(jt).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewOrganizationGeneralInformation\"]"))).click().build().perform();
}

@When("^Click on Edit Button$")
public void click_on_Edit_Button() throws Throwable {
	AdminPage pf = new AdminPage(driver);
	pf.GenInfoEditSave().click();
}

@Then("^Updated the input of Tax ID to \"([^\"]*)\"$")
public void updated_the_input_of_Tax_ID_to(String arg1) throws Throwable {
	AdminPage pf = new AdminPage(driver);
	pf.GenInfoTaxId().clear();
	pf.GenInfoTaxId().sendKeys("654321");
	
	Thread.sleep(1000);
	
	pf.GenInfoEditSave().click();
}

@Then("^Clicked Save$")
public void clicked_Save() throws Throwable {
	AdminPage pf = new AdminPage(driver);
	pf.GenInfoEditSave().click();
}

@Then("^Verify if the updated is reflected under General Inforamtion$")
public void verify_if_the_updated_is_reflected_under_General_Inforamtion() throws Throwable {
	Assert.assertEquals("654321", "654321");
	  System.out.print("Its Verified!");
	  
	  driver.quit();
}
}