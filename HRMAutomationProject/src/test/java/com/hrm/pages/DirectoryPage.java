package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {

	WebDriver driver;

	public DirectoryPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"menu_directory_viewDirectory\"]/b") 
	WebElement directorybtn;
	
	public WebElement directorybtn() {
		return directorybtn;
	}
	
	@FindBy(xpath = "//*[@id=\"searchDirectory_emp_name_empName\"]") 
	WebElement dirctname;
	
	public WebElement dirctname() {
		return dirctname;

	}
	
	@FindBy(xpath = "//*[@id=\"searchBtn\"]") 
	WebElement dirctSearchbtn;
	
	public WebElement dirctSearchbtn() {
		return dirctSearchbtn;
		
	}
/*	@FindBy(xpath = "//*[@id='content']/div[2]/div[2]") 
	WebElement ErrorMsg;
	
public WebElement ErrorMsg() {
		
		String ActualError=ErrorMgs();
		String ExpectedError="No Records Found";
}*/
	
	@FindBy(xpath = "//*[@id=\"searchDirectory_job_title\"]") 
	WebElement dirctjobtitle;
	
	//selec jobtitel
	public void JobTitel() {
		Select v=new Select(driver.findElement(By.xpath("//*[@id='searchDirectory_job_title']")));
		v.selectByVisibleText("Sales Manager");
		}
	//select location
	public void SelectLocation() {
		Select v=new Select(driver.findElement(By.xpath("//*[@id='searchDirectory_location']")));
		v.selectByVisibleText("    New York Sales Office");
		}
}
