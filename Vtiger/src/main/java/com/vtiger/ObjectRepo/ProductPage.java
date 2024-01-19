package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="(//a[@href=\"index.php?module=Products&action=EditView&return_action=DetailView&parenttab=Inventory\"])[2]")
	private WebElement createproduct;


	public WebElement getCreateproduct() {
		return createproduct;
	}
	
	
	@FindBy(xpath ="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement newproduct;
	
	
	@FindBy(xpath ="//input[@name=\"productname\"]")
	private WebElement productName;
	
	public WebElement getProductName() {
		return productName;
	}


	@FindBy(xpath ="//input[@type='submit']")
	private WebElement save;
	public WebElement getSave() {
		return save;
	}


	
	
	public void ProductPage1() {
		createproduct.click();
		productName.click();
		save.click();
	}
	
}
