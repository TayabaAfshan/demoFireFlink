package com.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketPage {
	public TroubleTicketPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//a[@href=\"index.php?module=HelpDesk&action=index\"]")
	private WebElement Troubleticket;


	public WebElement getTroubleticket() {
		return Troubleticket;
	}

	
	@FindBy(xpath ="(//a[@href=\"index.php?module=HelpDesk&action=EditView&return_action=DetailView&parenttab=Support\"])[2]")
	private WebElement CreateTicket;


	public WebElement getCreateTicket() {
		return CreateTicket;
	}
	

	@FindBy (xpath ="//textarea[@name=\"ticket_title\"]")
	private WebElement Title;


	public WebElement getTitle() {
		return Title;
	}
	
	
	@FindBy(xpath ="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement save;


	public WebElement getSave() {
		return save;
	}
	
	
	public void TroubleTicket1(String data)
	{
		Troubleticket.click();
		CreateTicket.click();
		Title.sendKeys(data);
		save.click();
		
		
	}
	
}
