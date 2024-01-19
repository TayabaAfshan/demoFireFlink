package testScript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepo.ContactPage;
import com.vtiger.ObjectRepo.DeleteContactPage;
import com.vtiger.ObjectRepo.HomePage;

import genericUtility.BaseUtility;

public class DeleteContactTest extends BaseUtility {
	
	@Test()
	public void DeleteContactTest1() throws Throwable {
	 
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
		DeleteContactPage cp= new DeleteContactPage(driver);
		cp.getcontacts().click();
		String context = cp.getContacts().getText();
		System.out.println(context);
		assertEquals(context, "CONTACTS");

		cp.getcreatecontact().click();
		
		//data fetching from excel String lastName 
		String contact = eLib.readDataFromExcel("Contacts", 1, 0)+jLib.getRandomNo(); 
		cp.getlastname().sendKeys(contact);
		cp.getSave().click();
		cp.getcontacts().click();
		cp.getSelectCheckbox().click();
		cp.getDelete();
}
}