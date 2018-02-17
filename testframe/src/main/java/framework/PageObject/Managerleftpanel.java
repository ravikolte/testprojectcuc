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

public class Managerleftpanel {
	
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	
	
	@FindBy(xpath = "/html/body/div[2]/div/ul/li[2]/a")
	public WebElement NewCustomer;

	By NewCustomerlink = By.xpath("/html/body/div[2]/div/ul/li[2]/a");
	By EditCustomerlink = By.xpath("/html/body/div[2]/div/ul/li[3]/a");
	By DeleteCustomerlink = By.xpath("/html/body/div[2]/div/ul/li[4]");
	By NewAccountlink = By.xpath("/html/body/div[2]/div/ul/li[5]/a");
	By EditAccountlink = By.xpath("/html/body/div[2]/div/ul/li[6]/a");
	By DeleteAccountlink = By.xpath("/html/body/div[2]/div/ul/li[7]/a");
	By Depositlink = By.xpath("/html/body/div[2]/div/ul/li[8]/a");
	By Withdrawallink = By.xpath("/html/body/div[2]/div/ul/li[9]/a");
	By Fundtransferlink = By.xpath("/html/body/div[2]/div/ul/li[10]/a");
	By ChangePasswordlink = By.xpath("/html/body/div[2]/div/ul/li[11]/a");
	By BalanceEnquirylink = By.xpath("/html/body/div[2]/div/ul/li[12]/a");
	By MiniStatementlink = By.xpath("/html/body/div[2]/div/ul/li[13]/a");
	By CustomizedStatementlink = By.xpath("/html/body/div[2]/div/ul/li[14]/a");
	By Logoutlink = By.xpath("//a[text()='Log out']");
	
	public Managerleftpanel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, NewCustomer,ObjectRepo.reader.getExplicitWait());
		}
			
	public void NewCustomer()
	{
		driver.findElement(NewCustomerlink).click();
	}
	
	public void EditCustomer()
	{
		driver.findElement(NewCustomerlink).click();
	}
	
	public void DeleteCustomer()
	{
		driver.findElement(DeleteCustomerlink).click();
	}
	
	public void NewAccount()
	{
		driver.findElement(NewAccountlink).click();
	}
	
	public void EditAccount()
	{
		driver.findElement(EditAccountlink).click();
	}
	
	public void DeleteAccount()
	{
		driver.findElement(DeleteAccountlink).click();
	}
	
	public void Deposit()
	{
		driver.findElement(Depositlink).click();
	}
	
	public void Withdrawal()
	{
		driver.findElement(Withdrawallink).click();
	}
	
	public void FundTransfer()
	{
		driver.findElement(Fundtransferlink).click();
	}
	
	public void ChangePassword()
	{
		driver.findElement(ChangePasswordlink).click();
	}
	
	public void BalanceEnquiry()
	{
		driver.findElement(BalanceEnquirylink).click();
	}
	
	public void MiniStatement()
	{
		driver.findElement(MiniStatementlink).click();
	}
	
	public void CustomisedStatement()
	{
		driver.findElement(CustomizedStatementlink).click();
	}
	
	public void Logout()
	{
		driver.findElement(Logoutlink).click();
	}
}
