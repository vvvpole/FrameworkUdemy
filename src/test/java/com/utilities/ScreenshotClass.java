package com.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.TestClasses.BaseTestClass;

public class ScreenshotClass extends BaseTestClass {
public static void takeScreenshot (WebDriver driver, String name) throws IOException {
	
	TakesScreenshot	 sc 	=(TakesScreenshot) driver;
	File source 			=sc.getScreenshotAs(OutputType.FILE);
	File destination 		=new File ("C:/Users/my pc/eclipse-workspace/FrameworkUdemy/src/Screenshots.png");
	FileHandler.copy(source, destination);
}
}
