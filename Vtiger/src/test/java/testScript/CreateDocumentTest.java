package testScript;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.vtiger.ObjectRepo.CreateDocPage;
import com.vtiger.ObjectRepo.HomePage;

import genericUtility.BaseUtility;

public class CreateDocumentTest extends BaseUtility {
	
	@Test()
	public void DeleteContactTest1() throws Throwable {
	 
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
	    CreateDocPage doc = new CreateDocPage(driver);
	    String doc1 = eLib.readDataFromExcel("document", 1, 0)+jLib.getRandomNo(); 
	    doc.CreateDoc(doc1);
	    
}
	}
