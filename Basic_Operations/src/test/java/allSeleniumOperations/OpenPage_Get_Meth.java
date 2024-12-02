package allSeleniumOperations;

import org.testng.annotations.Test;

import basePackage.BaseTest;

public class OpenPage_Get_Meth extends BaseTest {
	
	@Test
	public void launch() {
		
		driver.get("https://www.flipkart.com/");
	}

}
