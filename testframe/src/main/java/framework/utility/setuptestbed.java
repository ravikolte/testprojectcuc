package framework.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

import framework.configreader.ObjectRepo;
import framework.configreader.PropertyFileReader;
import framework.helper.Logger.LoggerHelper;
import framework.helper.TestBase.TestBase;

public class setuptestbed {
	
	private final Logger log = LoggerHelper.getLogger(setuptestbed.class);
	
	public void WriteContent(String mycontent)
	{
		 BufferedWriter bw = null;
	     try {
		
	        //Specify the file name and path here
		 File file = new File("C:/Users/Ravi/testprojectcuc/git/testframe/src/main/resources/CustomerIDandAccountNo/Custidandaccountno.feature");

		 /* This logic will make sure that the file 
		  * gets created if it is not present at the
		  * specified location*/
		  if (!file.exists()) {
		     file.createNewFile();
		  }

		  FileWriter fw = new FileWriter(file);
		  bw = new BufferedWriter(fw);
		  bw.write(mycontent);
		  bw.newLine();
	         System.out.println("File written Successfully");

	     } catch (IOException ioe) {
		   ioe.printStackTrace();
		}
		finally
		{ 
		   try{
		      if(bw!=null)
			 bw.close();
		   }catch(Exception ex){
		       System.out.println("Error in closing the BufferedWriter"+ex);
		    }
		}
		
	}
	
	public void LoginandSetup() throws Exception
	{
		ObjectRepo.reader = new PropertyFileReader();
		TestBase tb = new TestBase();
		tb.setUpDriver(ObjectRepo.reader.getBrowser());
		log.info("Trying to open browser");
		
	}
}
