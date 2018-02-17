package framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.helper.Logger.LoggerHelper;
import framework.helper.Wait.WaitHelper;

public class EditCustomer {

	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	

	@FindBy(xpath = "/html/body/div[2]/div/ul/li[2]/a")
	public WebElement NewCustomer;
	
	
	By Address = By.xpath("//textarea[@name='addr']");
	By City = By.xpath("//input[@name='city']");
	By State = By.xpath("//input[@name='state']");
	By PIN = By.xpath("//input[@name='pinno']");
	By MobileNumber = By.xpath("//input[@name='telephoneno']");
	By EmailAddress = By.xpath("//input[@name='emailid']");
	By Submit =By.xpath("//input[@value='Submit']");
	By Reset = By.xpath("//input[@value='Reset']");
	
	public void UpdateAddress(String address)
	{
		driver.findElement(Address).sendKeys(address);
	}
	
	public void UpdateCity(String city)
	{
		driver.findElement(City).sendKeys(city);
	}
	
	public void UpdateState(String state)
	{
		driver.findElement(State).sendKeys(state);
	}
	
	public void UpdatePin(String pin)
	{
		driver.findElement(PIN).sendKeys(pin);
	}
	
	public void UpdateMobile(String mobnum)
	{
		driver.findElement(MobileNumber).sendKeys(mobnum);
	}
	
	public void UpdateEmail(String email)
	{
		driver.findElement(EmailAddress).sendKeys(email);
	}
	
	public void Submit()
	{
		driver.findElement(Submit).click();
	}
	
	public void Reset()
	{
	  driver.findElement(Reset).click();
	}
}
