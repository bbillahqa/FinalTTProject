package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	WebDriver driver;

	public AdminPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}
	
	public void MouseHoverToAdmin () {
		WebElement Admin= driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement Job= driver.findElement(By.linkText("Job"));
		WebElement JobTitel= driver.findElement(By.xpath("//*[@id='menu_admin_viewJobTitleList']"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(Admin).perform();
	
		act.moveToElement(Job).perform();
		act.moveToElement(JobTitel).perform();
		act.click().build().perform();
		
	}
	
	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]") 
	WebElement Adminbtn;
	
	public WebElement Adminbtn() {
		return Adminbtn;
	}
	
	@FindBy(xpath = "//*[@id=\"menu_admin_viewJobTitleList\"]") 
	WebElement jobtitlebtn;
	
	public WebElement jobtitlebtn() {
		return jobtitlebtn;
	}


	@FindBy(xpath = "//*[@id=\"jobTitle_jobDescription\"]") 
	WebElement jobdescrp;
	
	public WebElement jobdescrp() {
		return jobdescrp;
	}

	
	@FindBy(xpath = "//*[@id=\"btnAdd\"]") 
	WebElement Adminaddbtn;
	
	public WebElement Adminaddbtn() {
		return Adminaddbtn;
	}

	@FindBy(xpath = "//*[@id=\"jobTitle_jobTitle\"]")
	WebElement Adminenterjob;
	
	public WebElement Adminenterjob() {
		return Adminenterjob;
	}

	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	WebElement Adminsavebtn;
	
	public WebElement Adminsavebtn() {
		return Adminsavebtn;
}

	@FindBy(xpath = "//*[@id=\"empStatus_name\"]") 
	WebElement ESname;
	
	public WebElement ESname() {
		return ESname;
	}
	@FindBy(xpath = "//*[@id=\"welcome\"]") 
	WebElement Welcomeadmin;
	
	public WebElement Welcomeadmin() {
		return Welcomeadmin;
	}
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")  
	WebElement logoutbtn;
	
	public WebElement logoutbtn() {
		return logoutbtn;
	}
	
	@FindBy(xpath = "//*[@id=\"btnSaveGenInfo\"]")  
	WebElement GenInfoEditSave;
	
	public WebElement GenInfoEditSave() {
		return GenInfoEditSave;
	}
	
	@FindBy(xpath = "//*[@id=\"organization_taxId\"]") 
	WebElement GenInfoTaxId;
	
	public WebElement GenInfoTaxId() {
		return GenInfoTaxId;
	}
	
	@FindBy(xpath = "//*[@id=\"ohrmList_chkSelectRecord_3\"]") 
	WebElement esfulltimebtn;
	
	public WebElement esfulltimebtn() {
		return esfulltimebtn;
	}
	
	@FindBy(xpath = "//*[@id=\"btnDelete\"]") 
	WebElement Admindeletebtn;
	
	public WebElement Admindeletebtn() {
		return Admindeletebtn;
	}
	
	@FindBy(xpath = "//*[@id=\"nationality_name\"]") 
	WebElement Nationalityname;
	
	public WebElement Nationalityname() {
		return Nationalityname;
	}

	@FindBy(xpath = "//*[@id=\"menu_admin_nationality\"]") 
	WebElement Nationalitybtn;
	
	public WebElement Nationalitybtn() {
		return Nationalitybtn;
	}
	
	@FindBy(xpath = "//*[@id=\"ohrmList_chkSelectRecord_15\"]") 
	WebElement Bengladeshibtn;
	
	public WebElement Bengladeshibtn() {
		return Bengladeshibtn;
	}
	@FindBy(xpath = "//*[@id=\"btnDelete\"]") 
	WebElement Admindelete;
	
	public WebElement Admindelete() {
		return Admindelete;
	}
	
	@FindBy(xpath = "//*[@id=\"welcome\"]") 
	WebElement AdminWelcomebtn;
	
	public WebElement AdminWelcomebtn() {
		return AdminWelcomebtn;
	}
	
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a") 
	WebElement AdminLogoutbtn;
	
	public WebElement AdminLogoutbtn() {
		return AdminLogoutbtn;
	}
}
