package testScript;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepo.ContactPage;
import com.vtiger.ObjectRepo.HomePage;

import genericUtility.BaseUtility;
import genericUtility.FileUtility;

public class HomeTest extends BaseUtility{
	@Test

public void Hometest() throws Throwable{
		
		 
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
		
	}

}
