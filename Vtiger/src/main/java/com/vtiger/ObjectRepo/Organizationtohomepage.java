package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationtohomepage {
	
	public Organizationtohomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[@href=\"index.php?module=Accounts&action=index\"]")
	private WebElement organization;
	
	
	public WebElement getOrganization() {
		return organization;
	}
	
	
	@FindBy(xpath="(//a[text()='Organizations'])[2]")
	private WebElement OrgText;
	


	@FindBy(xpath ="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement createOrganization;
	
	public WebElement getCreateOrganization() {
		return createOrganization;
	}


	@FindBy(xpath ="//input[@name=\"accountname\"]")
	private WebElement organizationName;


	public WebElement getOrganizationName() {
		return organizationName;
	}
	
	@FindBy(xpath ="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement save;


	public WebElement getSave() {
		return save;
	}

	

	public WebElement getOrgText() {
		return OrgText;
	}



	@FindBy(xpath ="//img[@src=\"themes/softed/images/Home.PNG\"]")
	private WebElement homeicon;
	
	


	public WebElement getHomeicon() {
		return homeicon;
	}
	
	
	public void organization(String orgname)
	{
		organization.click();
		
		createOrganization.click();
		organizationName.sendKeys(orgname);
		save.click();
		homeicon.click();
		
		
	}
	

}
