package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
		
	//initialise
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//decleration
		@FindBy(name = "user_name")
		private WebElement UserNameEdt;
		

		public WebElement getUserNameEdt() {
			return UserNameEdt;
		}


		@FindBy(name = "user_password")
		private WebElement PasswordEdt;
		
		
		public WebElement getPasswordEdt() {
			return PasswordEdt;
		}

		

		@FindBy(id = "submitButton")
		private WebElement SubmitBtn;
		
		public WebElement getSubmitBtn() {
			return SubmitBtn;
		}

		
		//Business Libraries
		public void login(String UserName, String Password )
		{
			UserNameEdt.sendKeys(UserName);
			PasswordEdt.sendKeys(Password);
			SubmitBtn.click();	
		}
		


}
