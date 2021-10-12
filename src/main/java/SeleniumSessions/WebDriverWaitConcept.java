package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 //explicitly wait is a Custom Wait 
	 //can be used for specific webelement.
	 //not a global wait
	 //can be used for Non-WebElement URL/Alerts/pop-ups ...
	 
	 driver.get("https://demoauto.xyz/leads");
	 driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
	 driver.findElement(By.id("password")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.findElement(By.xpath("//span[text()='Leads']")).click();
	 driver.findElement(By.xpath("//a[@title=\"Add lead\"]")).click();
	 
	 //Syntax
//	 WebDriverWait wait=new WebDriverWait(driver,10);
//	 WebElement companyname=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_name")));
//	 companyname.sendKeys("Jaggulav");
	 
	 //we can apply the explicit wait to any specific element
//	 WebElement Vatnum=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("vat_number")));
//	 Vatnum.sendKeys("JaggulavVat123456");
//	
	 //verify utility
	 By comp=(By.id("company_name"));
	 By vat=(By.id("vat_number"));
	 
	waitForElementPresent(comp, 10,2000).sendKeys("Jaggu");
	waitForElementPresent(vat, 20,1000).sendKeys("5689");
	}

	//if xpath is kept wrong after wait time it will throw exception
	//in exception we can see there a line called 10 sec wait with interval of 500milli sec
	//hence by default it will check for every 0.5 sec interval
	//we can change the interval time
	
	//creating a general utility 
	
	
	// Presence of Element ---An expectation for checking that an element is present on the DOM of a page. 
			//This does notnecessarily mean that the element is visible.
	
	//which means element is present in DOM but not always not possible present in page 
	
	
	public static WebElement waitForElementPresent(By locator, long timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,timeout);
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	 
	}
	//in exception we can see there a line called 10 sec wait with interval of 500milli sec
		//hence by default it will check for every 0.5 sec interval for both implicit and explicit waits 
		//we can change the interval time
		
	public static WebElement waitForElementPresent(By locator, long timeout,long IntervalTime) {
		 WebDriverWait wait=new WebDriverWait(driver, timeout, IntervalTime);
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	 
	}
	
}
