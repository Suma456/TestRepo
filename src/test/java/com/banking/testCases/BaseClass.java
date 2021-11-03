package com.banking.testCases;




import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		logger=Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChroPath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirePath());
			driver=new FirefoxDriver();
			
		}
		driver.get(baseURL);
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
	
	public void CaptureScreen(WebDriver driver, String tname)throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+timeStamp+".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
		
	}
	
	public String randomestring2() {
		String generateString2=RandomStringUtils.randomNumeric(4);
		return(generateString2);
	}

	public String randomestring() {
		
			String generatedstring=RandomStringUtils.randomAlphabetic(8);
			return(generatedstring);
	

}}
