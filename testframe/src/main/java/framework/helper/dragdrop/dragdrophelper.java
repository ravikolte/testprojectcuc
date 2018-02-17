package framework.helper.dragdrop;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import framework.helper.DropDown.DropDownHelper;
import framework.helper.Logger.LoggerHelper;



public class dragdrophelper {

	
	private WebDriver driver;
	private Logger Log = LoggerHelper.getLogger(DropDownHelper.class);

	public dragdrophelper(WebDriver driver) {
		this.driver = driver;
		Log.debug("DropDownHelper : " + this.driver.hashCode());
	}
	
	public void dragfromdragto(WebElement sourcelocator, WebElement destinationlocator)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(sourcelocator, destinationlocator).build().perform();
	
	}
	
    public void draganddropby(WebElement source, int xaxis, int yaxis)
    {
    	Actions action = new Actions(driver);
    	action.dragAndDropBy(source, xaxis, yaxis).build().perform();
    }
	
    public void rightclick(WebElement element)
    {
    	Actions action = new Actions(driver);
    	action.contextClick(element).perform();
    }
	
    

}
