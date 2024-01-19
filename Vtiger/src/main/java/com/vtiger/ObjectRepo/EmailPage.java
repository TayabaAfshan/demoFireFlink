package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {
	
	public EmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@href=\"index.php?module=Emails&action=index\"]")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	
	@FindBy(xpath ="//a[text()=\"Compose\"]")
	private WebElement compose;

	public WebElement getCompose() {
		return compose;
	}
	
	public void email() {
		email.click();
		compose.click();
	}
	
	
	
	

}
