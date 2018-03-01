package framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.configreader.ObjectRepo;
import framework.helper.DropDown.DropDownHelper;
import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.assertionHelper.VerificationHelper;
import framework.helper.screenshot.Screenshothelper;

public class NewAccountForm {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	DropDownHelper ddh ;
	Screenshothelper sh;
	
	@FindBy(xpath = "//a[text()='New Account']")
	public WebElement NewAccount;
	
	@FindBy(id = "message")
	public WebElement Message;
	
	public NewAccountForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, NewAccount,ObjectRepo.reader.getExplicitWait());
		
	}
	
	@FindBy(xpath = "//select[@name='selaccount']")
	public WebElement AccountType;
	
	By CustomerId = By.xpath("//input[@name='cusid']");
	By Accounttype = By.xpath("//select[@name='selaccount']");
	By Initialdeposit = By.xpath("//input[@name='inideposit']");
	By Submit =By.xpath("//input[@type='submit']");
    By Reset = By.xpath("//input[@type='reset']");
	
    
    public void EnterCustomerId(String custid)
    {
    	driver.findElement(CustomerId).sendKeys(custid);
    }
    
    public void EnterAccountType(String acctype)
    {
    	// write code for drop-down with help of drop-down helper.
    	ddh = new DropDownHelper(TestBase.driver);
    	ddh.SelectUsingVisibleValue(AccountType, acctype);
    }
    
    public void EnterInitialDeposit(String indeposit)
    {
    	driver.findElement(Initialdeposit).sendKeys(indeposit);
    }
    
    public void Submit()
    {
    	driver.findElement(Submit).click();
    }
    
    public void Reset()
    {
    	driver.findElement(Reset).click();
    }
    
    public void CheckAccounttype()
    {
    	ddh = new DropDownHelper(TestBase.driver);
    	String actual = ddh.getSelectedValue(AccountType);
      	Assert.assertEquals(actual, "Savings");
    }
    
    public boolean AssertField(String expectedresult, String field) throws Exception
	{
		Boolean bool = VerificationHelper.verifyTextEquals(Message,expectedresult);
		if(bool = true)
			{ sh = new Screenshothelper(TestBase.driver);
	          sh.captureScreenshot(field+expectedresult);
			 log.info(expectedresult);
			}
		else
		{
			log.info("Test case failed");
		}
		return bool;
	}
    
    public void EnterCustomerIdAndValidatetheResult(String custid, String expected) throws Exception
	{
		driver.findElement(CustomerId).sendKeys(custid);
		AssertField(expected,"CustomerId");
	}
    
    public void EnterInitialAndValidatetheResult(String deposit, String expected) throws Exception
	{
		driver.findElement(Initialdeposit).sendKeys(deposit);
		AssertField(expected,"Initialdeposit");
	}
    
    
	

}
