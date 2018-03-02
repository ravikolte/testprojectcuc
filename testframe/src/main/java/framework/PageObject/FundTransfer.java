package framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.configreader.ObjectRepo;
import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.assertionHelper.VerificationHelper;
import framework.helper.screenshot.Screenshothelper;

public class FundTransfer {
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	Screenshothelper sh;

	@FindBy(id = "message")
	public WebElement Message;
	
	@FindBy(xpath = "//a[text()='Fund Transfer']")
	public WebElement FundTransfer;
	
	public FundTransfer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, FundTransfer,ObjectRepo.reader.getExplicitWait());
		
	}
	
	By PayersAccountNo = By.xpath("//input[@name='payersaccount']");
	By PayeesAccountNo = By.xpath("//input[@name='payeeaccount']");
	By Amount = By.xpath("//input[@name='ammount']");
	By Description = By.xpath("//input[@name='desc']");
	By Submit =By.xpath("//input[@type='submit']");
    By Reset = By.xpath("//input[@type='reset']");
    
    public void EnterPayersAccount(String payer)
    {
    	driver.findElement(PayersAccountNo).sendKeys(payer);
    }
    
    public void EnterPayeesAccount(String payee)
    {
    	driver.findElement(PayeesAccountNo).sendKeys(payee);
    }
        
    public void EnterAmount(String amt)
    {
    	driver.findElement(Amount);
    }
	
    public void EnterDescription(String des)
    {
    	driver.findElement(Description).sendKeys(des);
    }
    
    public void Submit()
    {
    	driver.findElement(Submit).click();
    }
    
    public void Reset()
    {
    	driver.findElement(Reset).click();
    }
       
       public void EnterPayeesAccountNoAndValidatetheResult(String payeeaccountno, String expected) throws Exception
   	{
   		driver.findElement(PayeesAccountNo).sendKeys(payeeaccountno);
   		VerificationHelper.AssertField(expected,"PayeesAccountNo",Message);
   	}
       
       public void EnterPayersAccountNoAndValidatetheResult(String payersaccountno, String expected) throws Exception
   	{
   		driver.findElement(PayersAccountNo).sendKeys(payersaccountno);
   		VerificationHelper.AssertField(expected,"PayersAccountNo",Message);
   	}

}
