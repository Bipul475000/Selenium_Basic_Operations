package allSeleniumOperations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import basePackage.BaseTestParallel;

public class DropDown extends BaseTestParallel {
	
	@Test
	public void dropDown() throws IOException {	
		test.pass("Launching website");
		getDriver().get("https://www.flipkart.com/");
		test.pass("Launched website and maximizing");
		getDriver().manage().window().maximize();
		test.addScreenCaptureFromPath(utils.ScreenCapture.captureScreenShot(getDriver()));
		getDriver().findElement(By.xpath(properties.getProperty("FashionDropDown"))).click();

		test.pass("Item clicked on website");
		
	}

}
