package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {

	WebDriver driver;

	public PIMPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(id = "firstName") 
	WebElement aefirstname;
	
	public WebElement aefirstname() {
		return aefirstname;
	}
	
	@FindBy(id = "lastName") 
	WebElement aelastname;
	
	public WebElement aelastname() {
		return aelastname;
	}

	@FindBy(name = "employeeId") 
	WebElement aeID;
	
	public WebElement aeID() {
		return aeID;
	}
	@FindBy(xpath = "//*[@id=\"btnSave\"]") 
	WebElement aeSave;
	
	public WebElement aeSave() {
		return aeSave;
	}

	@FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/b") 
	WebElement PIMbtn;
	
	public WebElement PIMbtn() {
		return PIMbtn;
	}
	@FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]") 
	WebElement AddEmployee;
	
	public WebElement AddEmployee() {
		return AddEmployee;
	}
	
	
	
	
}


