package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//a[@href=\"index.php?module=Leads&action=index\"]")
	private WebElement leads;
	
	
	@FindBy(xpath ="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement createleads;
	
	@FindBy (name="lastname")
	private WebElement  lastname;
	
	@FindBy(name="company")
	private WebElement company;
	
	@FindBy (xpath ="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement save;
	
	@FindBy(xpath ="//span[text()='[ LEA2 ] vbn  -  Lead Information']")
	private WebElement textVerification;

	public WebElement getLeads() {
		return leads;
	}

	
	public WebElement getCreateleads() {
		return createleads;
	}

	
	public WebElement getLastname() {
		return lastname;
	}



	public WebElement getCompany() {
		return company;
	}

	

	public WebElement getSave() {
		return save;
	}

	

	public WebElement getTextVerification() {
		return textVerification;
	}

	
	//bussiness logic
	
	
	
		public void Leads(String lstname, String cmpname)
		{
			leads.click();
			createleads.click();
			lastname.sendKeys(lstname);
			company.sendKeys(cmpname);
			save.click();
			
		}
	
}
