package com.vtiger.ObjectRepo;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.BaseUtility;

public class CreatingModulePage {
	
	
	public CreatingModulePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement Addbutton;
	
	
	
	@FindBy(xpath ="//a[@id=\"addmodule\"]")
	private WebElement addmodule;
	
	@FindBy(xpath ="//td[normalize-space(text()) = 'Window Title']/..//input")
	private WebElement WindowTitle;

	public WebElement getAddbutton() {
		return Addbutton;
	}

	public WebElement getAddmodule() {
		return addmodule;
	}

	public WebElement getWindowTitle() {
		return WindowTitle;
	}
	
	public void creatingModule(String Title){
		Addbutton.click();
		
		addmodule.click();
		
		WindowTitle.sendKeys(Title);
		
	}
	
	

}
