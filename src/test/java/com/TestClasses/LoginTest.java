package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.PageClasses.LoginPage;

public class LoginTest extends BaseTestClass {
	
	
	@Test
	public void login() throws IOException {
		LoginPage lp=new LoginPage(driver);
		lp.credentials();
		//lp.clickLogin();
		System.out.println("Hiiiiiiiiiiiii");
		
		
	}
	

}
