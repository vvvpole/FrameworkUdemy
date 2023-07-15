package com.PageClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//extends BaseClass {

	private WebElement username;
	private WebElement password;
	private WebElement button;
	
	public LoginPage(WebDriver driver) {
		username =driver.findElement(By.xpath("//input[@id='userName']"));
		password =driver.findElement(By.xpath("//input[@id='password']"));
	//	button =driver.findElement(By.xpath("//button[@id='login']"));
	}
//	@FindBy(xpath="//input[@id='userName']")
//	private WebElement username;
//	@FindBy(xpath="//input[@id='password']")
//	private WebElement password;
//	@FindBy(xpath="//button[@id='login']")
//	private WebElement button;
//	
//	public LoginPage (WebDriver driver) throws IOException {
//		super();
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void credentials() {
//		username.sendKeys(properties.getProperty("email"));
//		password.sendKeys(properties.getProperty("pass"));
//		
//		//System.out.println(username);
//	//	username.sendKeys("Admin121");
//		//password.sendKeys("admin123");
//	}
	
	public void credentials () {
		username.sendKeys("Admin121");
		password.sendKeys("Admin@123");
		//button.click();
	}
	
//	public void clickLogin() {
//		button.click();
//	}
}