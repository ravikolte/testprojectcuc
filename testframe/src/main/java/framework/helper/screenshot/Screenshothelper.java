package framework.helper.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import framework.helper.Javascript.JavaScriptHelper;
import framework.helper.Logger.LoggerHelper;

public class Screenshothelper {
	
	private  WebDriver driver;
	
	private Logger Log = LoggerHelper.getLogger(JavaScriptHelper.class);

	public Screenshothelper(WebDriver driver) {
		this.driver = driver;
		Log.debug("Screenshothelper : " + driver.hashCode());
		
	}
	
	public void captureScreenshot() throws IOException {	
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//Ravi//testprojectcuc//git//testframe//src//main//resources//screenshotsarehere//t3.jpg"));
	}

}
