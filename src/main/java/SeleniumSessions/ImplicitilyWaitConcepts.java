package SeleniumSessions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitilyWaitConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 //implicit wait is applied directly on all webdriver reference
	//its a global wait and its applied to all webelements by default
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //here the time given is 10 sec so selenium is going to wait for 10 sec to element to present 
	 //if element is not present after 10 sec it will throw exception called NoSunchElement Exception
	 //If element is present within 5 sec remaining 5 sec will be ignored
	 //implicit wait is used only for Webelements 
	 //for non-webelements it cannot be used --->Alerts/pop-ups/url/title
	 
	 driver.get("https://demoauto.xyz/leads");
	 driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
	 driver.findElement(By.id("password")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.findElement(By.xpath("//span[text()='Leads']")).click();
	 driver.findElement(By.xpath("//a[@title=\"Add lead\"]")).click();
	 driver.findElement(By.id("company_name")).sendKeys("Jaggulav");
	 
	 //if we didnt put implicit wait it wont enter Jaggulav in company name field and will throw implicit wait exceptions
	 //but since we used implicit wait selenium will apply wait for all the driver reference webelement 
	 //but its not necessary to apply implicit wait for password/signin/Add leads etc....since it is a global wait and will impact performance
	 
	 //even though its a dynmaic wait it will check whether element is found or not for all elements
	 //hence it is not recommended always since it also doesnt handle Non-Webelements(Alerts/Pop-ups/Title)
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
