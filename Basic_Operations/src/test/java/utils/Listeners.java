package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;

import basePackage.BaseTestParallel;



public class Listeners extends BaseTestParallel implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Listeners on start test "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Listeners on test failure "+result.getName());
		
	//	String testName = result.getTestName();
		Object currentClass = result.getInstance();
		WebDriver tdriver = (WebDriver)((BaseTestParallel)currentClass).getDriver();
		ExtentTest test = (ExtentTest)((BaseTestParallel)currentClass).test;
		
		try {
			String imgPath = ScreenCapture.captureScreenShot(tdriver);
			
			Media media = MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build();
			test.log(Status.FAIL, "Failed to proced",media );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
