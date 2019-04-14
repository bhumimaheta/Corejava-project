package com.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.utility.Constant;

public class BaseTestScript {

	public static WebDriver driver;
	private void loadConfiguration() throws IOException
	{
		Properties prop = new Properties();
		File f = new File("src/main/java/com/configuration/configuration.properties");
		System.out.println(f.getAbsolutePath());
		FileReader reader = new FileReader(f.getAbsolutePath());
		prop.load(reader);
		
		Constant.BROWSER_NAME=prop.getProperty("browser");
		Constant.URL = prop.getProperty("url");
		Constant.USERNAME=prop.getProperty("username");
		Constant.PASSWORD=prop.getProperty("password");
		Constant.REPORT=prop.getProperty("html.report");
	}

	
	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		loadConfiguration();
		if(Constant.BROWSER_NAME.equalsIgnoreCase("Chrome"))
		{
			File f = new File("src/main/resources/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
			driver = new ChromeDriver();
		}
		else if(Constant.BROWSER_NAME.equalsIgnoreCase("IE"))
		{
			
		}
		else if(Constant.BROWSER_NAME.equalsIgnoreCase("FF"))
		{
			File f = new File("resource/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", f.getAbsolutePath());
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Sorry you choose wrong browser...");
		}
	}
	
	@BeforeTest
	public void beforeTest()
	{
		driver.get(Constant.URL);
	}
	
	@AfterSuite()
	public void afterSuite()
	{
		driver.quit();
	}
}
