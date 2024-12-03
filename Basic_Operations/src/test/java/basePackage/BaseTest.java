package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {
	
	protected static WebDriver driver;
	protected Properties properties;
	protected File fileReader;
	protected InputStream stream;
	private String fileLocation;
	
	@BeforeClass
	public void init() throws IOException {
		properties = new Properties();
		fileLocation = System.getProperty("user.dir") + "/src/test/resources/Element.properties";
		fileReader = new File(fileLocation);
		stream = new FileInputStream(fileReader);
		properties.load(stream);
		
	}
	
	@BeforeMethod
	public void launchBrowser() {
	
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/"); 
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}

}
