package testScript;

import com.vtiger.ObjectRepo.HomePage;
import com.vtiger.ObjectRepo.ProductPage;

import genericUtility.BaseUtility;

public class ProductTest extends BaseUtility {

	public void product() throws Throwable{
		
		 
		HomePage hm= new HomePage(driver);
		hm.getHomeicon().isDisplayed();
		
		ProductPage pp = new ProductPage(driver);
		
}
}