package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcepts {

	static WebDriver driver;
	//Fluent Wait is a type of wait where the hierarchy is like 
	//WebDriver Wait-->FluentWait--->Wait
	//here Webdriver wait is a Class implementing from Parent Fluentwait
	//Flent wait is a Class inherits the property of the Interface Wait
	//Wait is the  interface which has Untill method in it
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By customers=By.linkText("Customers");
	
		//using fluent wait
		
//		Wait<WebDriver> waits=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				   .withMessage("Element is not found....")
//				   		.pollingEvery(Duration.ofMillis(2000))
//				   				.ignoring(NoSuchElementException.class);
//		waits.until(ExpectedConditions.presenceOfElementLocated(customers)).click();
		
		waitforElementPresentwithFluentwait(customers, 10, 1000);
		

	}
	
	//creating a general utility 
	//created a error class to type the error to be handled.
	//with webdriver waits also we can use fluent wait functions ..
	
	
	public static WebElement waitforElementPresentwithFluentwait(By locator, int timeout, int pollingtime) {

		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
					.withMessage(Error.Timeout_WebElement_msg)// error is a class and its imported from error class using builder pattern
						.pollingEvery(Duration.ofMillis(pollingtime))
							.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		return waits.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static Alert waitforAlertPresentwithFluentwait(int timeout, int pollingtime) {

		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
					.withMessage(Error.Timeout_Alrt_msg)
						.pollingEvery(Duration.ofMillis(pollingtime))
							.ignoring(NoAlertPresentException.class);
		return waits.until(ExpectedConditions.alertIsPresent());
	}
	
	public static WebDriver waitforFramePresentwithFluentwait(By framelocator, int timeout, int pollingtime) {

		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
					.withMessage(Error.Timeout_Frame_msg)
						.pollingEvery(Duration.ofMillis(pollingtime))
							.ignoring(NoSuchFrameException.class);
		return waits.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
	

}
