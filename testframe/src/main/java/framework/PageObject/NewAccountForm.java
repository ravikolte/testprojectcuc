package framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.configreader.ObjectRepo;
import framework.helper.DropDown.DropDownHelper;
import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;

public class NewAccountForm {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath = "//a[text()='New Account']")
	public WebElement NewAccount;
	
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
    	DropDownHelper ddh = new DropDownHelper(TestBase.driver);
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

}
