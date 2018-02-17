package framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.configreader.ObjectRepo;
import framework.helper.Logger.LoggerHelper;
import framework.helper.Wait.WaitHelper;

public class Editcustomerformpage {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath = "/html/body/div[2]/div/ul/li[2]/a")
	public WebElement EditCustomer;
	
	public Editcustomerformpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, EditCustomer,ObjectRepo.reader.getExplicitWait());
		
	}
	
	
	By EditCustomerlink = By.xpath("/html/body/div[2]/div/ul/li[3]/a");
	By CustomerId = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input");
	By Submit =By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]");
    By Reset = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[2]");
    
    
	public void EditCustomer()
	{
		driver.findElement(EditCustomerlink).click();
	}
	
	
	public void entercustomerid(String id)
	{
      		driver.findElement(CustomerId).sendKeys(id);
	}
	
	public void Submit()
	{
		driver.findElement(Submit).click();
	}
	
	
	
}
