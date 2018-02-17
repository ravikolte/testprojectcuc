package framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.configreader.ObjectRepo;
import framework.configreader.PropertyFileReader;
import framework.helper.Logger.LoggerHelper;
import framework.helper.Wait.WaitHelper;


public class Login {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	

	@FindBy(name = "btnLogin")
	public WebElement loginbtn;

	
	 By user99GuruName = By.name("uid");

     By password99Guru = By.name("password");
     
     By loginbutton = By.name("btnLogin");
	
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
	
	public void ClickonLoginbtn()
	{
		log.info("Click on LoginBtn");
		driver.findElement(loginbutton).click();
	}
	
	
}
