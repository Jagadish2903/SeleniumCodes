package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDoClickSendKeys {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.get("https://classic.crmpro.com/index.html");
	

//	WebElement username=driver.findElement(By.name("username"));
//	WebElement password=driver.findElement(By.name("password"));
//	WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
	
	Thread.sleep(2000);
	
	//Send keys and click method using Actions Class
//	Actions act=new Actions(driver);
//	act.sendKeys(username, "groupautomation").build().perform();
//	act.sendKeys(password, "Selenium12345").build().perform();
//	act.moveToElement(login).click();
	
	//difference bet normal send keys and actions send keys ?
		//In action Send keys when we use action method internally it will click on the webelement and pass the value and accurancy is more..
		//if we face element not intractable exceptions in some cases we will be using the Actions send keys 
		//normal sendkeys will just pass the value
		
	
	
	By name=By.name("username");
	By pwd=By.name("password");
	By login=By.xpath("//input[@type='submit']");
	
	doActionSendKeys(login, "Lav");
	doActionSendKeys(pwd, "Jaggulav");
	Thread.sleep(2000);
	doActionClick(login);
	

	}
	
	//Creating a Utility
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value ).build().perform();
	}
	
	public static void doActionClick(By locator) {
		Actions act=new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	
}
