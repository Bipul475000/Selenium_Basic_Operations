package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenCapture {
	
	public String captureScreenShot(WebDriver driver) throws IOException {
		
		File takeScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String imgPath = System.getProperty("user.dir")+"target/screenshot/"+"image_"+LocalDateTime.now()+".img";
		
		File outPut = new File(imgPath);
		
		FileUtils.copyFile(takeScreenShot, outPut);
		
		return imgPath;
	}

}
