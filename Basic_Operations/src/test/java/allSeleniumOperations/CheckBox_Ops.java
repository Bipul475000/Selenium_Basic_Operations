package allSeleniumOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basePackage.BaseTest;

public class CheckBox_Ops extends BaseTest {

	@Test(invocationCount = 2)
	public void selectAndDeselect() throws InterruptedException {

		driver.findElement(By.xpath(properties.getProperty("FashionDropDown"))).click();
		WebElement fashionBag = driver.findElement(By.xpath(properties.getProperty("FashionDropDown_Bags")));	
		fashionBag.click();
		
		WebElement checkBox = driver.findElement(By.xpath(properties.getProperty("fAssured_CheckBox")));
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//		
//		wait.until(ExpectedConditions.elementToBeSelected(checkBox));
	
		checkBox.click();
		
		//Testing
		
		System.out.println("testing");
		
		
	}
}
