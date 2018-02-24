package framework.PageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.configreader.ObjectRepo;
import framework.configreader.PropertyFileReader;
import framework.helper.Alert.AlertHelper;
import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.assertionHelper.VerificationHelper;
import framework.helper.screenshot.Screenshothelper;


public class Login {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	AlertHelper ah;
	Screenshothelper sh;

	@FindBy(name = "btnLogin")
	public WebElement loginbtn;
	

	@FindBy(tagName = "marquee")
	public WebElement marquetext;

	
	 By user99GuruName = By.name("uid");

     By password99Guru = By.name("password");
     
     By loginbutton = By.name("btnLogin");
     
     
     
     String expectedmsgonlogin = "Welcome To Manager's Page of Guru99 Bank";
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, loginbtn,ObjectRepo.reader.getExplicitWait());
		
	}
	public void EnterUserId()
	{ 
		ObjectRepo.reader = new PropertyFileReader();
		log.info("Entered username");
		driver.findElement(user99GuruName).sendKeys(ObjectRepo.reader.getUserName());
	}
	public void EnterPassword()
	{
		log.info("Entered Password");
		driver.findElement(password99Guru).sendKeys(ObjectRepo.reader.getPassword());
	}
	
	public void ClickonLoginbtn() throws Exception 
	{
		log.info("Click on LoginBtn");
		driver.findElement(loginbutton).click();
		handleunsuccessfulloginlert();
	}
	
	public void handleunsuccessfulloginlert() throws Exception
	{
		ah = new AlertHelper(TestBase.driver);
		//Verify is alert is present..this case will arise if login fails
		ah.getAlert();
		//User or Password is not valid
		if(ah.isAlertPresent())
		{
			log.info("Login UnSuccessful");
			ah.AcceptAlert();
			sh = new Screenshothelper(TestBase.driver);
			sh.captureScreenshot();
			
		}
		else
		{
			Assertlogin();
		}
		
	}
	

	public boolean Assertlogin() throws Exception
	{

		Boolean bool = false;
		if(marquetext.isDisplayed())
		{
			 bool = VerificationHelper.verifyTextEquals(marquetext, expectedmsgonlogin);
			if(bool = true)
			log.info("Login Successful");
			else	
				log.info("Login UnSuccessful");
		}	
		
		return bool;
		
	}
	
	
}
