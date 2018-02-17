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

public class EditAccountForm {

	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath = "//a[text()='Edit Account']")
	public WebElement EditAccount;
	
	@FindBy(xpath = "//select[@name='selaccount']")
	public WebElement Accounttype;
	
	public EditAccountForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, EditAccount,ObjectRepo.reader.getExplicitWait());
		
	}
	
	By Accounttypee = By.xpath("//select[@name='selaccount']");
	By AccountNo = By.xpath("//input[@name='accountno']");
	By Submit =By.xpath("//input[@type='submit']");
    By Reset = By.xpath("//input[@type='reset']");
	
    public void EnterAccountNumber(String accno)
    {
    	driver.findElement(AccountNo).sendKeys(accno);
    }
    
    public void Submit()
    {
    	driver.findElement(Submit).click();
    }
    
    public void Reset()
    {
    	driver.findElement(Reset).click();
    }
	public void changeaccountype(String accountype)
	{
		// write code for drop-down with help of drop-down helper.
    	DropDownHelper ddh = new DropDownHelper(TestBase.driver);
    	ddh.SelectUsingVisibleValue(Accounttype, accountype);
	}
	
	
}
