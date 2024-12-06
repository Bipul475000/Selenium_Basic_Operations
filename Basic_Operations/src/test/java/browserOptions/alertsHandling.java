package browserOptions;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class alertsHandling {
	
	@Test
	public void alerts() {
		ChromeOptions opts = new ChromeOptions();
		
		opts.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
		opts.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		
		
	}

}
