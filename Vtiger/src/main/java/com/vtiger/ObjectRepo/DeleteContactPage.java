package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteContactPage {
	
	public DeleteContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=index']")
	private WebElement contacts;
	

	public WebElement getContacts() {
		return contacts;
	}

	
	public WebElement getCreateContact() {
		return createContact;
	}

	

	public WebElement getLastname() {
		return Lastname;
	}

	

	public WebElement getSave() {
		return save;
	}

	

	public WebElement getText0fcontactinfo() {
		return text0fcontactinfo;
	}

	

	public WebElement getcontacts() {
		return contacts;
	}

	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContact;
	
	public WebElement getcreatecontact() {
		return createContact;
	}

	
	@FindBy(name="lastname")
	private WebElement Lastname;
	
	public WebElement getlastname() {
		return Lastname;
	}
	

	@FindBy(xpath ="//input[@type='submit']")
	private WebElement save;
	
	
	


	@FindBy(xpath="//span[text()='[ CON16 ] Afshan  -  Contact Information']")
	private WebElement text0fcontactinfo;
	
	
	
	@FindBy(xpath= "//input[@id=\"selectCurrentPageRec\"]")
    private WebElement selectCheckbox;	
	
	
	@FindBy(xpath ="//input[@class=\"crmbutton small delete\"]")
	private WebElement Delete;
	
	
	public WebElement getDelete() {
		return Delete;
	}


	//bussiness logic
	public void contact(String lastname)
	{
		createContact.click();
		Lastname.sendKeys(lastname);
		save.click();
		text0fcontactinfo.click();
		selectCheckbox.click();
	}


	public WebElement getSelectCheckbox() {
		// TODO Auto-generated method stub
		return selectCheckbox;
	}
	
	
	

}
