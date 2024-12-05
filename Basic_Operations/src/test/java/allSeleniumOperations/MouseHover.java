package allSeleniumOperations;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import basePackage.BaseTestParallel;

public class MouseHover extends BaseTestParallel {
	
	@Test
	public void mouseHover() {
		
		
		getDriver().get("https://www.flipkart.com/"); 
		getDriver().manage().window().maximize();
		getDriver().findElement(By.xpath(properties.getProperty("FashionDropDown"))).click();
		
		Actions action = new Actions(getDriver());
		WebElement fashionBag = getDriver().findElement(By.xpath(properties.getProperty("FashionDropDown_Bags")));	
		action.moveToElement(fashionBag).build().perform();
		
		WebElement fashionBag_Messenger = getDriver().findElement(By.xpath(properties.getProperty("FashionDropDown_Bags_Messenger")));
		action.click(fashionBag_Messenger).build().perform();

		WebElement messengerPage = getDriver().findElement(By.xpath(properties.getProperty("MessengerBag_Page")));
		assertEquals(true, messengerPage.isDisplayed() );
	}

}
