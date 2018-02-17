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

public class AmountDepositForm {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath = "//a[text()='Deposit']")
	public WebElement Deposit;
	
	public AmountDepositForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, Deposit,ObjectRepo.reader.getExplicitWait());
		
	}
	
	By AccountNo = By.xpath("//input[@name='accountno']");
	By Amount = By.xpath("//input[@name='ammount']");
	By Description = By.xpath("//input[@name='desc']");
	By Submit =By.xpath("//input[@type='submit']");
    By Reset = By.xpath("//input[@type='reset']");
	
    public void EnterAmountDepositDetails(String accno, String amt, String desc)
    {
    	driver.findElement(AccountNo).sendKeys(accno);
    	driver.findElement(Amount).sendKeys(amt);
    	driver.findElement(Description).sendKeys(desc);
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
