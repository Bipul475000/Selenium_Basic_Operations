package allSeleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import basePackage.BaseTestParallel;

public class DropDown extends BaseTestParallel {
	
	@Test
	public void dropDown() {	
		getDriver().get("https://www.flipkart.com/");
		getDriver().manage().window().maximize();
		getDriver().findElement(By.xpath(properties.getProperty("FashionDropDown"))).click();
		
	}

}
