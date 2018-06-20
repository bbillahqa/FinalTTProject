package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

	WebDriver driver;

	public RecruitmentPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b") 
	WebElement Recruitmentbtn;
	
	public WebElement Recruitmentbtn() {
		return Recruitmentbtn;
	}
	
	@FindBy(xpath = "//*[@id=\"entitlements_employee_empName\"]") 
	WebElement Candidatebtn; 
	
	public WebElement Candidatebtn() {
		return Candidatebtn;
	}
	
	@FindBy(xpath = "//*[@id=\"addCandidate_firstName\"]") 
	WebElement rusername; 
	
	public WebElement rusername() {
		return rusername;
	}
	
	@FindBy(xpath = "//*[@id=\"addCandidate_lastName\"]") 
	WebElement rlastname;
	
	public WebElement rlastname() {
		return rlastname;
	}
	
	@FindBy(xpath = "//*[@id=\"addCandidate_email\"]") 
	WebElement remail;
	
	public WebElement remail() {
		return remail;
	}
	
	@FindBy(xpath = "//*[@id=\"addCandidate_contactNo\"]") 
	WebElement rcontactno;
	
	public WebElement rcontactno() {
		return rcontactno;
	}
	
	@FindBy(xpath = "//*[@id=\"btnAdd\"]") 
	WebElement raddbtn;
	
	public WebElement raddbtn() {
		return raddbtn;
	}
	
}
