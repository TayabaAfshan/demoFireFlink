package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//decleration
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement Admin;
		
		
		public void adm()
		{
			
			Admin.click();	
		}
		
		@FindBy(xpath="//a[@href=\"index.php?module=Users&action=Logout\"]")
		private WebElement signout;
		
		
		public void signout()
		{
			
			signout.click();	
		}
		
		
		@FindBy(xpath ="//img[@src=\"themes/softed/images/Home.PNG\"]")
		private WebElement homeicon;
		
		
	

		public WebElement getHomeicon() {
			return homeicon;
		}

		



		public void logout()

		{
			Admin.click();	
			signout.click();
		}
}