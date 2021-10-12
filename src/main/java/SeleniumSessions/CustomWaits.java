package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaits {

	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver(); 
	 driver.get("https://demoauto.xyz/leads");
	 driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
	 driver.findElement(By.id("password")).sendKeys("123456"); 
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	By leads=By.xpath("//span[text()='Leads']");
	By addLeads=By.xpath("//a[@title=\"Add lead\"]");
	By compName=By.id("company_name");
	
	retryingElement(leads,2,1000).click();
	retryingElement(addLeads,10,1000).click();
	retryingElement(compName,10,1000).sendKeys("Jaggulav");
	 

	}

	
	public static WebElement retryingElement(By locator,int timeout,int pollingtime) {
		//at first lets keep the webelement and attempts as 0
		WebElement element=null;
		int attempts=0;
		while(attempts<timeout) {
			try {
				element=driver.findElement(locator);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found in"+ " :"+ attempts +locator);
				try {
					Thread.sleep(pollingtime);
				} catch(InterruptedException e1) {
					e1.printStackTrace();
				}
				
			}
			attempts++;
		}
		return element;
	}
}
