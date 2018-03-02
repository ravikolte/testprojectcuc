package framework.helper.assertionHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;
import framework.helper.screenshot.Screenshothelper;





public class VerificationHelper{
	
	static Screenshothelper sh;

	private static final  Logger log = LoggerHelper.getLogger(VerificationHelper.class);

	public static synchronized boolean verifyElementPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 isDispalyed= element.isDisplayed();
			 log.info(element.getText()+" is dispalyed");
		}
		catch(Exception ex) {
			log.error("Element not found " + ex);
		}
		
		return isDispalyed;
	}
	
	public static synchronized boolean verifyElementNotPresent( WebElement element) {
		boolean isDispalyed = false;
		try {
			 element.isDisplayed();
			 log.info(element.getText()+" is dispalyed");
		}
		catch(Exception ex) {
			log.error("Element not found " + ex);
			isDispalyed = true;
		}
		
		return isDispalyed;
	}
	
	public static synchronized boolean verifyTextEquals( WebElement element,String expectedText) {
		boolean flag = false;
		try {
			String actualText=element.getText();
			if(actualText.equals(expectedText)) {
				log.info("actualText is :"+actualText+" expected text is: "+expectedText);
				return flag=true;
			}
			else {
				log.error("actualText is :"+actualText+" expected text is: "+expectedText);
				return flag;
			}
		}
		catch(Exception ex) {
			log.error("actualText is :"+element.getText()+" expected text is: "+expectedText);
			log.info("text not matching" + ex);
			return flag;
		}
	}
	
	public static synchronized boolean verifyElementisSelected(WebElement radio, String text)
	{
		boolean flag = false;
		if(radio.isSelected() && radio.getText().equals(text))
		{
			log.info(text+" is selected");
			flag=true;
		}
		else
		{
			return flag;
		}
		
		return flag;
		
	}
	
	public static synchronized boolean AssertField(String expectedresult, String field, WebElement Message) throws Exception
	{
		Boolean bool = VerificationHelper.verifyTextEquals(Message,expectedresult);
		if(bool = true)
			{ sh = new Screenshothelper(TestBase.driver);
	          sh.captureScreenshot(field+expectedresult);
			 log.info(expectedresult);
			}
		else
		{
			log.info("Test case failed");
		}
		return bool;
	}
	
}