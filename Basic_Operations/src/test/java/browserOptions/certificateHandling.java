package browserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class certificateHandling {

	@Test
	public void cert() {
		
		
		ChromeOptions opts = new ChromeOptions();
		
		opts.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(opts);
		
		driver.get("https://www.youtube.com/");
	}
}
