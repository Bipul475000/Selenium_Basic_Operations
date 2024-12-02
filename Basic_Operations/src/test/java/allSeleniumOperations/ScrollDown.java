package allSeleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePackage.BaseTest;

public class ScrollDown extends BaseTest {
	
	@Test
	public void scrollDown() {
		
		driver.findElement(By.xpath(properties.getProperty("FashionDropDown"))).click();
		WebElement fashionBag = driver.findElement(By.xpath(properties.getProperty("FashionDropDown_Bags")));	
		fashionBag.click();
		WebElement footerAddress_State = driver.findElement(By.xpath(properties.getProperty("FooterAddress_State")));
		
		JavascriptExecutor exec = (JavascriptExecutor)driver;
		
		exec.executeScript("arguments[0].scrollIntoView()", footerAddress_State);
	}
}
