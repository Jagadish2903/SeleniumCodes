package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitforAlerts {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		//explicit waits are used for non-webelements as well(Title/URL/Alerts)
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	  WebElement submit=driver.findElement(By.name("proceed"));
	  submit.click();
	  
	  //to handle the alert we will always need to switch to alert 
	  //but in explicit wait it will handle switchong to alert automatically
//	  WebDriverWait wait=new WebDriverWait(driver,10);
//	  Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	  
	  //to check whether driver is switched to alert 
//	  System.out.println(alert.getText());
//	  alert.accept();
	  
	  System.out.println(alertGetText(5));
	  
	}
	
	//Creating a general Utility
	
	public static Alert waitforJSAlert(int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,timeout);
		  return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void acceptAlert(int timeout) {
		waitforJSAlert(timeout).accept();
	}
	
	public static void dismissAlert(int timeout) {
		waitforJSAlert(timeout).dismiss();
	}
	
	public static String alertGetText(int timeout) {
		Alert alert= waitforJSAlert(timeout);
		String text=alert.getText();
		alert.accept();
		return text;
	}
	
	public static void doSendKeysAlert(int timeout,String value) {
		 waitforJSAlert(timeout).sendKeys(value);
	}
}
