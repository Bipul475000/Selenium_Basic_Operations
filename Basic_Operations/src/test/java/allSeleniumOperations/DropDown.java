package allSeleniumOperations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePackage.BaseTest;

public class DropDown extends BaseTest {
	
	@Test
	public void dropDown() {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(properties.getProperty("FashionDropDown"))).click();
	}

}
