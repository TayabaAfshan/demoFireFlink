package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.BaseUtility;

public class CreateDocPage extends BaseUtility {

	
	public CreateDocPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//a[@href=\"index.php?module=Documents&action=index\"]")
	private WebElement document;
	
	
	@FindBy (xpath ="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement createdoc;
	
	
	@FindBy (xpath ="//input[@name=\"notes_title\"]")
	private WebElement title;
	
	
	@FindBy(xpath ="//input[@title=\"Save [Alt+S]\"]")
	private WebElement save;
	
	
	public WebElement getDocument() {
		return document;
	}


	public WebElement getCreatedoc() {
		return createdoc;
	}


	public WebElement getTitle() {
		return title;
	}


	public WebElement getSave() {
		return save;
	}


	public void CreateDoc (String title1) {
		document.click();
		createdoc.click();
		title.sendKeys(title1);
		save.click();
	}
}
