package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestParallel {
	
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	protected ResourceBundle res = ResourceBundle.getBundle("Element");
	protected Properties properties;
	protected File fileReader;
	protected InputStream stream;
	private String fileLocation;
	
	
	@BeforeClass
	public void setDriver() throws IOException {
		System.out.println("Before Test");
		
		driver.set(new ChromeDriver());
		System.out.println("driver reference "+ getDriver());
		properties = new Properties();
		fileLocation = System.getProperty("user.dir") + "/src/test/resources/Element.properties";
		fileReader = new File(fileLocation);
		stream = new FileInputStream(fileReader);
		properties.load(stream);
		
	}
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
		driver.remove();
	}

}
