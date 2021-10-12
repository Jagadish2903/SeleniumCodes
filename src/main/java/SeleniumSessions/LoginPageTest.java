package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtility br=new BrowserUtility();
		WebDriver driver=br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		//Using By Locators
		
		By email=By.id("input-email");
		By paswrd=By.id("input-password");
		
		
		
		ElementUtil ele=new ElementUtil(driver);
		ele.doSendKeys(email,"Jaggu");
		ele.doSendKeys(paswrd, "Jaggu123");
	
	}

}
