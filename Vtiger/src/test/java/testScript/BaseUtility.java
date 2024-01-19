package testScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.ObjectRepo.HomePage;
import com.vtiger.ObjectRepo.LoginPage;

import genericUtility.DataBaseUtility;
import genericUtility.FileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import genericUtility.XLUtility;



public class BaseUtility {
	
	
	public DataBaseUtility dLib = new DataBaseUtility();
	public XLUtility eLib = new XLUtility();
	public FileUtility fLib = new FileUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public WebDriver driver;
	public static WebDriver sdriver;
	
	
			
	@BeforeSuite(alwaysRun = true)
	
	public void configBS() throws Throwable{
	
		try {
		{
			dLib.connectToDB();
			System.out.println("-- connect to DB --");
		}
		
	}
		catch (Exception e) {
		// TODO: handle exception
	}
		System.out.println("its executing");}
	
	
	//@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void configBC() throws Throwable
	{
		String BROWSER = fLib.readDataFromPropetyFile("Browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("-- invalid browser --");
		}
		System.out.println("-- launch the browser");
		
		sdriver = driver;
		wLib.maximizeWindow(driver);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void configBM() throws Throwable
	{
		String URL = fLib.readDataFromPropetyFile("URL");
		String USERNAME = fLib.readDataFromPropetyFile("UserName");
		String PASSWORD = fLib.readDataFromPropetyFile("Password");
		
		driver.get(URL);
		wLib.waitForPageLoad(driver);
		
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		System.out.println("-- login to appl --");
	}
	
	@AfterMethod(alwaysRun = true)
	public void configAM()
	{
		HomePage hp = new HomePage(driver);
		hp.adm();
		hp.logout();
		System.out.println("-- signout from appl --");		
	}
	

	
	@AfterClass(alwaysRun = true)
	public void configAC()
	{
		driver.quit();
		System.out.println("-- close the browser --");
	}
	
	@AfterSuite(alwaysRun = true)
	public void configAS() throws Throwable
	{
		dLib.closeDB();
		System.out.println("-- close DB connection --");
	}
	
	
	
	
	
	
	
	
	

		}



