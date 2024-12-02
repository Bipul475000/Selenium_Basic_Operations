package allSeleniumOperations;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePackage.BaseTest;

public class MouseHover extends BaseTest {
	
	@Test
	public void mouseHover() {
		
		driver.findElement(By.xpath(properties.getProperty("FashionDropDown"))).click();
		
		Actions action = new Actions(driver);
		WebElement fashionBag = driver.findElement(By.xpath(properties.getProperty("FashionDropDown_Bags")));	
		action.moveToElement(fashionBag).build().perform();
		
		WebElement fashionBag_Messenger = driver.findElement(By.xpath(properties.getProperty("FashionDropDown_Bags_Messenger")));
		action.click(fashionBag_Messenger).build().perform();

		WebElement messengerPage = driver.findElement(By.xpath(properties.getProperty("MessengerBag_Page")));
		assertEquals(true, messengerPage.isDisplayed() );
	}

}
