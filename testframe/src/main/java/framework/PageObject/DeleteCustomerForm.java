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

public class DeleteCustomerForm {

	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath = "//a[text()='Delete Customer']")
	public WebElement DeleteCustomer;
	
	public DeleteCustomerForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, DeleteCustomer,ObjectRepo.reader.getExplicitWait());
		
	}
	
	By CustomerID = By.xpath("//input[@name='cusid']");
	By Reset = By.xpath("//input[@name='res']");
	By Submit = By.xpath("//input[@name='AccSubmit']");
	
	public void EnterCustomerId (String cusid)
	{
		driver.findElement(CustomerID).sendKeys(cusid);
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
