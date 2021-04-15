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
import resources.base;

public class NegativeLoginTest extends base{
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("driver is initialized");

	}
	@Test(dataProvider="getData")
	
	public void NegativeLogin(String Username,String Password) throws IOException, InterruptedException
	{

		driver.get(prop.getProperty("url"));
		
		PrivacyPage pg= new PrivacyPage(driver);
		pg.getAdvanced().click();
		pg.getLink().click();
	
		LoginPage lp=new LoginPage(driver);
		
        System.out.println("Login Page URL::" + driver.getCurrentUrl());
		
		log.info("User is navigated to Login Page");
		
		lp.getEmail().sendKeys(Username);
		Thread.sleep(3000);
		lp.getPassword().sendKeys(Password);
		Thread.sleep(3000);
		
		lp.getLogin().click();
		Thread.sleep(3000);
		
		
		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
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
		data[0][1]="5f5134cf5c2f0dd29268d6e56757b21";
		
		
		return data;
		
		
		
	}
	
}
