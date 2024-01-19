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

public class CreatingLeads {

	@Test(dataProvider= "creatingleads")
	public void demo(String name, String company) throws IOException {
		
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
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys(company);
		driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
		WebElement text = driver.findElement(By.xpath("//span[contains(text(),'[ LEA1 ] mehreen  -  Lead Information')]"));
		text.isDisplayed();
}


	@DataProvider(name ="creatingleads")
	public Object[][] getdata()throws IOException{
		String path="C:\\Users\\User\\eclipse-workspace\\Vtiger\\src\\test\\resources\\testdata\\contacts.xlsx";
		ExcelLibrary xlutil=new ExcelLibrary();
		Object[][] data = xlutil.readMultipleData("Sheet1", path);
		return data ;
	}
}
