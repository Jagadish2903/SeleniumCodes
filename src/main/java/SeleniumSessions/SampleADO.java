package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SampleADO {

	public static void main(String[] args) {
		BrowserUtility brw=new BrowserUtility();
		WebDriver driver=brw.initDriver("chrome");
		brw.launchUrl("https://dev.azure.com/msc-dev/OVA");
		ElementUtil ele=new ElementUtil(driver);
		
		By loginId=By.name("loginfmt");
		
	ele.doSendKeys(loginId, "jagadishkumar.ramachandran@msc.com");
		

	}

}
