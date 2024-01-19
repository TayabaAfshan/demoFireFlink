package testScript;

import com.vtiger.ObjectRepo.HomePage;
import com.vtiger.ObjectRepo.OrganizationInfoPage;

import genericUtility.BaseUtility;

public class OrginfoTest extends BaseUtility {
	
	public void Organizationtest() throws Throwable{
		
		 
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
		OrganizationInfoPage org = new OrganizationInfoPage(driver);
		wLib.implicitWait(driver);
		String organization = eLib.readDataFromExcel("organization", 1, 0)+jLib.getRandomNo(); 
		org.orgInfo(organization);
		
}}
