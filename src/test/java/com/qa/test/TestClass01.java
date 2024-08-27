package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass01 {

	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver()
	{
		
		System.setProperty("webdrivr.chrome.driver","D:\\\\RAHUL_SHETTY_JAVA\\\\Invoke Browsrs\\\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Test
	public void Test01()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("TITLE IS:"+driver.getTitle());
	}
	
	@Test
	public void Test02()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("URL IS:"+driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void quit()
	{
		
		driver.quit();
	}
	
	
}
