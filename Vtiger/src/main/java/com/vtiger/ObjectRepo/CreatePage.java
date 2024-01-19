package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {
	
	public CreatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//a[@href=\"index.php?module=Documents&action=index\"]")
	private WebElement createDoc;
	
	
	public WebElement getCreateDoc() {
		return createDoc;
	}


	public WebElement getTitle() {
		return Title;
	}


	@FindBy(xpath="//input[@name=\"notes_title\"]")
	private WebElement Title;
	
	

	@FindBy(xpath ="//input[@type='submit']")
	private WebElement save;
	
	public WebElement getSave() {
		return save;
	}

	
	public void CreatePage1() 
	{
		createDoc.click();
		
	}

}
