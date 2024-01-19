package organization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriven {
	
	@Test (dataProvider= "creatingcontact")
	
	public void LoginTest(String contacts){
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		WebElement contact=driver.findElement(By.xpath("//input[@name='lastname']"));
		contact.sendKeys(contacts);
		
		driver.findElement(By.xpath("//input[contains(@class,'crmButton small save')]")).click();
		driver.findElement(By.xpath("//A[contains(@class,'hdrLink')]")).click();
}
	
	@DataProvider(name ="creatingcontact")
	public Object[][] getdata()throws IOException{
		String path="C:\\Users\\User\\eclipse-workspace\\Vtiger\\src\\test\\resources\\testdata\\contacts.xlsx";
		ExcelLibrary xlutil=new ExcelLibrary();
		Object[][] data = xlutil.readMultipleData("Sheet1", path);
		return data ;
		
		
	}

}
