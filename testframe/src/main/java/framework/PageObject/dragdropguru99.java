package framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.configreader.ObjectRepo;
import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.dragdrop.dragdrophelper;


public class dragdropguru99 {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(dragdropguru99.class);
	WaitHelper waitHelper;
	dragdrophelper dd;
	
	@FindBy(xpath = "//li/a[text()=' BANK ']")
	public WebElement bank;
	
	@FindBy(xpath = "//li/a[text()=' 5000']")
	public WebElement fivethousand;
	
	@FindBy(xpath = "//li/a[text()=' SALES ']")
	public WebElement SALES;
		
	@FindBy(xpath = "//*[@id='bank']/li")
	public WebElement DebitsideAccount;
	
	@FindBy(xpath = "//*[@id='amt7']/li")
	public WebElement DebitsideAmount;
	
	@FindBy(xpath = "//*[@id='loan']/li")
	public WebElement CreditsideAccount;
	
	@FindBy(xpath = "//*[@id='amt8']/li")
	public WebElement CreditsideAmount;
	
	public dragdropguru99(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, bank,ObjectRepo.reader.getExplicitWait());
		dd = new dragdrophelper(TestBase.driver);// very important to create an object else null value will be passed
	}
	
	public void AddDebitsideAccount()
	{   
		
		dd.dragfromdragto(bank, DebitsideAccount);
	}
	
	public void AddDebitsideAmount()
	{
		dd.dragfromdragto(fivethousand,DebitsideAmount);
	}
	
	public void AddCreditssideAccount()
	{   
		dd.dragfromdragto(SALES, CreditsideAccount);
	}
	
	public void AddCreditsideAmount()
	{
		dd.dragfromdragto(fivethousand,CreditsideAmount);
	}
}
