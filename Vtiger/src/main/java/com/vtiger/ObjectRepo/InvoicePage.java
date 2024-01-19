package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='More']")
	private WebElement more;
	
	@FindBy(xpath="//a[text()='Invoice']")
	private WebElement invoice;
	
	
	@FindBy (xpath ="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement createinvoice;
	
	public WebElement getMore() {
		return more;
	}


	public WebElement getInvoice() {
		return invoice;
	}


	public WebElement getCreateinvoice() {
		return createinvoice;
	}


	public WebElement getSubject() {
		return subject;
	}


	@FindBy (xpath ="(//input[@onblur=\"this.className='detailedViewTextBox'\"])[1]")
	private WebElement subject;
	
	
	public void invoicePage(String sub) {
		
		invoice.click();
		createinvoice.click();
		subject.sendKeys(sub);
		
	}

}
