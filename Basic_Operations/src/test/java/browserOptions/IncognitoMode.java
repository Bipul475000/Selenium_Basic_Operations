package browserOptions;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class IncognitoMode {
	ResourceBundle rs = ResourceBundle.getBundle("Element");
	WebDriver driver;
	ChromeOptions chromeOpts = new ChromeOptions();
	
	@Test
	public void launchBrowserIncognito() {
	
		chromeOpts.addArguments("--incognito");
	
		driver = new ChromeDriver(chromeOpts);
		
		String url =  rs.getString("Url");
		driver.get(url);
		
		System.out.println("Browser is opened incognito mode");
	}

}
