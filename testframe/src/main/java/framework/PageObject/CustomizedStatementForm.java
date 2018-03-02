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

public class CustomizedStatementForm {
	
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	Screenshothelper sh;

	@FindBy(id = "message")
	public WebElement Message;
	
	@FindBy(xpath = "//a[text()='Customised Statement']")
	public WebElement CustomisedStatement;
	
	public CustomizedStatementForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, CustomisedStatement,ObjectRepo.reader.getExplicitWait());
		
	}
	
	By AccountNo = By.xpath("//input[@name='accountno']");
	By Fromdate = By.xpath("//input[@name='fdate']");
	By ToDate = By.xpath("//input[@name='tdate']");
	By MinimumTransactionvalue = By.xpath("//input[@name='amountlowerlimit']");
	By NumberofTransactions = By.xpath("//input[@name='numtransaction']");	
	By Submit =By.xpath("//input[@type='submit']");
    By Reset = By.xpath("//input[@type='reset']");
	
    public void EnterDetailsforStatement(String accno,String fromdate,String todate,String mintrasac,String nooftrasac)
    {
    	driver.findElement(AccountNo).sendKeys(accno);
    	driver.findElement(Fromdate).sendKeys(fromdate);
    	driver.findElement(ToDate).sendKeys(todate);
    	driver.findElement(MinimumTransactionvalue).sendKeys(mintrasac);
    	driver.findElement(NumberofTransactions).sendKeys(nooftrasac);
    	
    }
    
    public void Submit()
    {
    	driver.findElement(Submit).click();
    }
    
    public void Reset()
    {
    	driver.findElement(Reset).click();
    }
	    
       public void EnterMinimumTransactionvalueAndValidatetheResult(String mintransacvalue, String expected) throws Exception
   	{
   		driver.findElement(MinimumTransactionvalue).sendKeys(mintransacvalue);
   		VerificationHelper.AssertField(expected,"MinimumTransactionvalue",Message);
   	}
       
       public void EnterNumberofTransactionsAndValidatetheResult(String nooftransactions, String expected) throws Exception
   	{
   		driver.findElement(NumberofTransactions).sendKeys(nooftransactions);
   		VerificationHelper.AssertField(expected,"NumberofTransactions",Message);
   	}
}
