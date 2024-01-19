package testScript;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepo.CreatingModulePage;
import com.vtiger.ObjectRepo.HomePage;

import genericUtility.BaseUtility;

public class CreateModuleTest extends BaseUtility {

	@Test
	public void createModule() throws Throwable {
		
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
	    CreatingModulePage doc = new  CreatingModulePage(driver);
	    String doc1 = eLib.readDataFromExcel("document", 1, 0)+jLib.getRandomNo(); 
	    System.out.println(doc1);
	    doc.creatingModule(doc1);
	    wLib.wait(2000);	
	}
}
