package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitsforTitleandUrl {

static WebDriver driver;
//explicit waits are used for non-webelements as well(Title/URL/Alerts)
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/index.php?route=account/login");
	driver.findElement(By.linkText("Register")).click();
	
	//Waits for URL
	
	WebDriverWait wait=new WebDriverWait(driver, 5);
//	if(wait.until(ExpectedConditions.urlContains("account/register"))) {
//		System.out.println(driver.getCurrentUrl());
//	}
//	//return type of untill in above line is boolean 
//	
//	if(wait.until(ExpectedConditions.urlToBe("https://demo.opencart.com/index.php?route=account/register"))) {
//		System.out.println("You are in right page");
//	}
//	
	if(waitforURLContains(5, "account/register")) {
		System.out.println("crct");
	}
	if(waitUrlToBe(5, "https://demo.opencart.com/index.php?route=account/register")){
		System.out.println("ur expection is crct");
	}
	
	
	//Waits for Title
	
//	if(wait.until(ExpectedConditions.titleContains("Register"))) {
//		System.out.println("Title is crct");
//	}
//	if(wait.until(ExpectedConditions.titleIs("Register Account"))) {
//		System.out.println("Title is Exactly crct");
//	}
//	
	System.out.println(waitforTitleContains(10, "Register"));
	System.out.println(waitforTitleIs(5, "Register Account"));
	
	}
	
	

	
	//creating a general utility
	
	public static boolean waitforURLContains(int timeout,String Containsvalue) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(Containsvalue));
	}
	
	public static boolean waitUrlToBe(int timeout,String expectedURL) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlToBe(expectedURL));
	}
	
	public static String waitforTitleContains(int timeout,String titleFraction) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		return null;
	}
	public static String waitforTitleIs(int timeout,String ExpectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		if(wait.until(ExpectedConditions.titleIs(ExpectedTitle))) {
			return driver.getTitle();
		}
		return null;
}
	}
