package testScript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepo.ContactPage;
import com.vtiger.ObjectRepo.HomePage;

import genericUtility.BaseUtility;

public class ContactTest extends BaseUtility {
	
	@Test
	public void Hometest() throws Throwable{
		
		 
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
		ContactPage cp= new ContactPage(driver);
		cp.getcontacts().click();
		String context = cp.getcontacttext().getText();
		assertEquals(context, "Contacts");

		cp.getcreatecontact().click();
		
		//data fetching from excel String lastName 
		String contact = eLib.readDataFromExcel("Contacts", 1, 0)+jLib.getRandomNo(); 
		cp.getlastname().sendKeys(contact);
		cp.getSave();
		
		
	}

}
