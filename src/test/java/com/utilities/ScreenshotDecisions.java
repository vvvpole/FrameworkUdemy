package com.utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TestClasses.BaseTestClass;

public class ScreenshotDecisions  extends BaseTestClass implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			ScreenshotClass.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	

}
