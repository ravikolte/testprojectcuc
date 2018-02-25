package framework.PageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.configreader.ObjectRepo;
import framework.helper.Alert.AlertHelper;
import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.assertionHelper.VerificationHelper;
import framework.helper.screenshot.Screenshothelper;

public class NewCustomerpage {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	AlertHelper ah;
	Screenshothelper sh;
	

	@FindBy(xpath = "/html/body/div[2]/div/ul/li[2]/a")
	public WebElement NewCustomer;
	
	@FindBy(id = "message")
	public WebElement Message;
	
	
	By NewCustomerlink = By.xpath("/html/body/div[2]/div/ul/li[2]/a");
	By CustomerName = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
	By GenderMale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
	By GenderFemale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
	By DateofBirth = By.id("dob");
	By Address = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");
	By City = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
	By State = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input");
	By PIN = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
	By MobileNumber = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
	By EmailAddress = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
	By Password = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
	By Submit =By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]");
	By Reset = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[2]");
	
	
	public NewCustomerpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, NewCustomer,ObjectRepo.reader.getExplicitWait());
		}
	
	public void NewCustomer()
	{
		driver.findElement(NewCustomerlink).click();
	}
	
	public void AddNewCustomerDetails(String custname, String Gender, String dob, String address, String city, String state, String pin, String mobile, String email, String pass)
	{
		driver.findElement(CustomerName).sendKeys(custname);
		
		if(Gender.equals(GenderFemale))
		{
			driver.findElement(GenderFemale).click();
		}
		else if(Gender.equals(GenderMale))
		{
			driver.findElement(GenderMale).click();
		}
		
		driver.findElement(DateofBirth).sendKeys(dob);
		driver.findElement(Address).sendKeys(address);
		driver.findElement(City).sendKeys(city);
		driver.findElement(State).sendKeys(state);
		driver.findElement(PIN).sendKeys(pin);
		driver.findElement(MobileNumber).sendKeys(mobile);
		driver.findElement(EmailAddress).sendKeys(email);
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void Submit()
	{
		driver.findElement(Submit).click();
	}
	public void Reset()
	{
		driver.findElement(Reset).click();
	}
	
	public void EnterCustomerNameAndValidatetheResult(String custname, String expected) throws Exception
	{
		driver.findElement(CustomerName).sendKeys(custname);
		AssertCustomerNameField(expected);
	}
	
	public boolean AssertCustomerNameField(String expectedresult) throws Exception
	{
		Boolean bool = VerificationHelper.verifyTextEquals(Message,expectedresult);
		if(bool = true)
			{ sh = new Screenshothelper(TestBase.driver);
	          sh.captureScreenshot(expectedresult);
			 log.info(expectedresult);
			}
		else
		{
			log.info("Test case failed");
		}
		return bool;
	}
}