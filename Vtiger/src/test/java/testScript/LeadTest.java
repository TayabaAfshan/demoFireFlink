package testScript;

import com.vtiger.ObjectRepo.HomePage;
import com.vtiger.ObjectRepo.LeadsPage;

import genericUtility.BaseUtility;

public class LeadTest extends BaseUtility{

	public void Leadtest1() throws Throwable {
		 
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();

		LeadsPage lp= new LeadsPage(driver);
		String lead = eLib.readDataFromExcel("Contacts", 1, 0)+jLib.getRandomNo(); 
		lp.Leads("","");
		
}
	}
