package testScript;



import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.vtiger.ObjectRepo.HomePage;
import com.vtiger.ObjectRepo.Organizationtohomepage;

import genericUtility.BaseUtility;

public class Organizationtohometest extends BaseUtility {
	@Test
	public void Organizationtest() throws Throwable{
	
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
		
		Organizationtohomepage org1 = new Organizationtohomepage(driver);
		//data fetching from excel String lastName 
		String org = eLib.readDataFromExcel("organization", 1, 0)+jLib.getRandomNo(); 
		
		org1.getOrganization().click();
		String text=org1.getOrgText().getText();
		Assert.assertEquals(text, "Organizations");
		org1.getCreateOrganization().click();
		org1.getOrganizationName().sendKeys(org);
		org1.getSave().click();
		org1.getHomeicon().click();
	
		
		
	}

}
