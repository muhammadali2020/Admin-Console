package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;

	By text =By.xpath("//div[@class='lead']");
	By dropdown =By.xpath("//body/nav[1]/div[1]/ul[1]/li[1]");
    By createuser = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	
	
	

	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public WebElement getDropdown()
	{
		return driver.findElement(dropdown);
	}
	
	public WebElement getCreateUSer()
	{
		return driver.findElement(createuser);
	}

	public WebElement gettext()
	{
		return driver.findElement(text);
	}
	

	
	
	
	
	
	
}
