package com.TestClasses;

import org.bouncycastle.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
public static WebDriver driver;

	@BeforeSuite
	public void initializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		}
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	

}
