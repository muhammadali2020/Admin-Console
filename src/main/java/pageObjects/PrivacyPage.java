package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class PrivacyPage {

	
	public WebDriver driver;
	
	By Advanced =By.id("details-button");
	By link=By.id("proceed-link");
	
	
	
	
	
	public PrivacyPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getAdvanced()
	{
		return driver.findElement(Advanced);
	}
	

	public WebElement getLink()
	{
		return driver.findElement(link);
	}
	
	
	
	
	
}
