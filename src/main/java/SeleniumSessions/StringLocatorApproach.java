package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringLocatorApproach{

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		String email = "input-email";
		String pwd = "input-password";
		String login="//input[@type='submit']";
		
		doSendKeys("id",email, "Jaggu@123");
		doSendKeys("id",pwd, "Jaggulavtest");
		doClick("xpath", login);
			

	}
	public static By getBy(String locatorType,String locatorValue) {
		System.out.println("Locator Type :"+locatorType +"and "+"Locator Value :"+locatorValue);
		By locator=null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator=By.id(locatorValue);
			break;
		case "className":
			locator=By.className(locatorValue);
			break;
		case "name":
			locator=By.name(locatorValue);
			break;
		case "xpath":
			locator=By.xpath(locatorValue);
			break;
		case "tagName":
			locator=By.tagName(locatorValue);
			break;
		case "linkText":
			locator=By.linkText(locatorValue);
			break;
		case "partialLinkText":
			locator=By.partialLinkText(locatorValue);
			break;
		case "cssSelector":
			locator=By.cssSelector(locatorValue);
			break;
		default:
			System.out.println("please enter correct locator type");
			break;
		}
		return locator;
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	public static void doClick(String locatorType,String locatorValue) {
		getElement(getBy(locatorType, locatorValue)).click();
	}
	
	public static void doSendKeys(String locatorType,String locatorValue,String value) {
		getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}
	
	
	
	

}
