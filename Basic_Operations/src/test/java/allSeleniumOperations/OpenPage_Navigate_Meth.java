package allSeleniumOperations;

import org.testng.annotations.Test;

import basePackage.BaseTest;

public class OpenPage_Navigate_Meth extends BaseTest {

	@Test
	public void launchPage() {
		driver.navigate().to("https://www.flipkart.com/");
		
	}
}
