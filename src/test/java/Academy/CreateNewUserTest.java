package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CreateUserPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PrivacyPage;
import resources.HttpResponseCode;
import resources.base;

public class CreateNewUserTest extends base{
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("driver is initialized");

	}
	@Test(dataProvider="getData")
	
	public void PositiveLogin(String Username,String Password) throws IOException, InterruptedException
	{

		driver.get(prop.getProperty("url"));
		
		PrivacyPage pg= new PrivacyPage(driver);
		pg.getAdvanced().click();
		pg.getLink().click();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.getEmail().sendKeys(Username);
		Thread.sleep(3000);
		lp.getPassword().sendKeys(Password);
		Thread.sleep(3000);
		
		lp.getLogin().click();
		
		LandingPage lap= new LandingPage(driver);
		
		Thread.sleep(3000);
		lap.getDropdown().click();
		Thread.sleep(3000);
		lap.getCreateUSer().click();
		Thread.sleep(3000);
		
		CreateUserPage cp= new CreateUserPage(driver);
		Thread.sleep(2000);
		System.out.println("User is Navigated to::" + cp.get_text().getText());
		log.info("User is on create user page.");
		cp.getusername().sendKeys("ali003");
		Thread.sleep(2000);
		cp.getdisplayname().sendKeys("ALI");
		Thread.sleep(2000);
		cp.getemail().sendKeys("ali@gmail.com");
		Thread.sleep(2000);
		cp.getmobilenumber().sendKeys("07858574763");
		Thread.sleep(2000);
		cp.getcheckbox().click();
		Thread.sleep(2000);
		cp.getsubmitt().click();
		
		
		}

	@AfterTest
	public void teardown()
	{
		
		//driver.close();
		//driver=null;
		
	}

	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][2];
		//0th row
		
		data[0][0]="admin";
		data[0][1]="58b21c0f55f5134cf5c2f0dd29268d6e56757b21";
		
		return data;
		
		
		
	}
	
}
