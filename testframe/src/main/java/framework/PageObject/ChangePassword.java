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

public class ChangePassword {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Login.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath = "//a[text()='Change Password']")
	public WebElement ChangePassword;
	
	public ChangePassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, ChangePassword,ObjectRepo.reader.getExplicitWait());
		
	}
	
	By OldPassword = By.xpath("//input[@name='oldpassword']");
	By NewPassword = By.xpath("//input[@name='newpassword']");
	By ConfirmPassword = By.xpath("//input[@name='confirmpassword']");
	By Submit =By.xpath("//input[@type='submit']");
    By Reset = By.xpath("//input[@type='reset']");
	
    
    public void Changemypassword(String oldpass,String newpass,String confirmpass)
    {
    	driver.findElement(OldPassword).sendKeys(oldpass);
    	driver.findElement(NewPassword).sendKeys(newpass);
    	driver.findElement(ConfirmPassword).sendKeys(confirmpass);
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
