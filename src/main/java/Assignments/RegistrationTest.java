package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import SeleniumSessions.ElementUtil;

public class RegistrationTest {

	public static void main(String[] args) {
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By emailid=By.id("input-email");
		By telePhone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPwd=By.id("input-confirm");
		
		
		ElementUtil ele=new ElementUtil(driver);
		ele.doSendKeys(firstName, "Jagadish");
		ele.doSendKeys(lastName, "Kumar");
		ele.doSendKeys(emailid, "jack.yuvan@gmail.com");
		ele.doSendKeys(telePhone, "9789888888");
		ele.doSendKeys(password, "Jaggulav9292");
		ele.doSendKeys(confirmPwd, "Jaggulav9292");
			
	}




	}


