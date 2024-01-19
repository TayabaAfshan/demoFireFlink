package testScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.ObjectRepo.HomePage;
import com.vtiger.ObjectRepo.InvoicePage;

import genericUtility.BaseUtility;



	public class InvoiceTest extends BaseUtility {
		
		@Test()
		public void InvoiceTest1() throws Throwable {
		 
			HomePage hm= new HomePage(driver);
			hm.getHomeicon().isDisplayed();
			
			InvoicePage it = new InvoicePage(driver);
			String invoice = eLib.readDataFromExcel("contacts", 1, 0)+jLib.getRandomNo(); 
			WebElement more = it.getMore();
			wLib.mousehover(driver, more);
			it.invoicePage(invoice);
			
		
		}
		}
