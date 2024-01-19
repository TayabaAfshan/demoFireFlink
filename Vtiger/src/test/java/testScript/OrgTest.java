package testScript;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepo.HomePage;
import com.vtiger.ObjectRepo.OrganizationPage;

import genericUtility.BaseUtility;
import genericUtility.XLUtility;

public class OrgTest extends BaseUtility {
	
	@Test
	public void OrganizationTest() throws Throwable {
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
		OrganizationPage org = new OrganizationPage(driver);
		XLUtility xl = new XLUtility();
		//data fetching from excel String lastName 
		String orgname = eLib.readDataFromExcel("organization", 1, 0)+jLib.getRandomNo(); 
		org.organization(orgname);
		
		
	}
	
	

}
