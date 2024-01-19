package organization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletingcontact {
	@Test (dataProvider= "Deletingcontact")
	public void demo(String contacts) throws IOException {
		
		
		FileInputStream fis= new FileInputStream("./src/test/resources/VtigerCommonData.properties");
			Properties pobj= new Properties();
			pobj.load(fis);
			String URL	=pobj.getProperty("URL");
			String UserName = pobj.getProperty("USERNAME");
			String Password = pobj.getProperty("PASSWORD");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//enter the url
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys( UserName);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		WebElement contact=driver.findElement(By.xpath("//input[@name='lastname']"));
		contact.sendKeys(contacts);
		driver.findElement(By.xpath("//input[contains(@class,'crmButton small save')]")).click();
		driver.findElement(By.xpath("//A[contains(@class,'hdrLink')]")).click();
		WebElement bodyText = driver.findElement(By.xpath("//TBODY[TR[TD[A[.='Contact Id']]]]/descendant::TR[4]/TD[2]"));
		System.out.println(bodyText);
		bodyText.isDisplayed();
		driver.findElement(By.xpath("//input[@id=\"selectCurrentPageRec\"]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Delete\"])[1]")).click();
	}
	
	@DataProvider(name ="Deletingcontact")
	public Object[][] getdata()throws IOException{
		String path="C:\\Users\\User\\eclipse-workspace\\Vtiger\\src\\test\\resources\\testdata\\contacts.xlsx";
		ExcelLibrary xlutil=new ExcelLibrary();
		Object[][] data = xlutil.readMultipleData("Sheet1", path);
		return data ;
	}

}
