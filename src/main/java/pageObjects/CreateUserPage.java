package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateUserPage {

	
	public WebDriver driver;
	
	By text = By.xpath("//h3[contains(text(),'Create New User')]");
	By username =By.id("pendingUserName");
	By displayname= By.id("pendingDisplayName");
	By email= By.id("pendingEmail");
	By mobilenumber= By.id("pendingMobileNumber");
	By checkbox = By.id("qr");
	By submitt =By.id("createPendingUser");
	
	
	
	

	
	public CreateUserPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	public WebElement getdisplayname()
	{
		return driver.findElement(displayname);
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getmobilenumber()
	{
		return driver.findElement(mobilenumber);
	}
	public WebElement getcheckbox()
	{
		return driver.findElement(checkbox);
	}
	
	public WebElement getsubmitt()
	{
		return driver.findElement(submitt);
	}
	
	public WebElement get_text()
	{
		return driver.findElement(text);
	}
	
	

	
	
	
	
	
	
}
