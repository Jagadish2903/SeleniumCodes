package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
			static WebDriver driver;
	public static void main(String[] args) {
		//DOM -Document Object Model
		//while doing inspect two categories is there one is Tag (eg.<input  ) and another is attributes with values (eg.id="adsad")
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		//Two things to be done always in automation
		//1.Create a WebElement(eg.	driver.findElement(By.id("input-email")).
		//2.Perform Actions(eg. sendKeys("Jaggu");
		
		
		//1.Type
//		driver.findElement(By.id("input-email")).sendKeys("Jaggu");//By is a class in Selenium and id is a Static 
//		driver.findElement(By.id("input-password")).sendKeys("Jaggu123");
		
		//2.Type(Using variables)
//		WebElement emailid=driver.findElement(By.id("input-email"));
//		WebElement pwd=driver.findElement(By.id("input-password"));
//		
//		emailid.sendKeys("Jaggu");
//		pwd.sendKeys("Jaggu123");
		
		//3.Type(By locator)
//		By email=By.id("input-email");
//		By paswrd=By.id("input-password");
//		
//		driver.findElement(email).sendKeys("Jaggu");
//		driver.findElement(paswrd).sendKeys("Jaggu123");
		
		
		//4.Type
//		By email=By.id("input-email");
//		By paswrd=By.id("input-password");
//		
//		WebElement eid=driver.findElement(email);
//		WebElement pd=driver.findElement(paswrd);
//
//		eid.sendKeys("Jaggu");
//		pd.sendKeys("Jaggu123");
		
		
		//5.Type(Using Generic Function getElement()
//		By email=By.id("input-email");
//		By paswrd=By.id("input-password");
//		
//		getElement(email).sendKeys("Jaggu");
//		getElement(paswrd).sendKeys("Jaggu123");
	
		//6.Type(Using Generic Function getElement() and doSendKeys()
//		By email=By.id("input-email");
//		By paswrd=By.id("input-password");
//		
//		doSendKeys(email,"Jaggu");
//		doSendKeys(paswrd,"Jaggu123");
		
		
		//7.Type(Using Generic Function getElement() and doSendKeys() in diff class(Element Util)
		By email=By.id("input-email");
		By paswrd=By.id("input-password");
		
		ElementUtil ele=new ElementUtil(driver);//created a object with help of constructor
		ele.doSendKeys(email, "Jaggu");
		ele.doSendKeys(paswrd, "Jaggu123");
		
		
		
		
		
		
	}
       public static WebElement getElement(By locator) {
    	  return driver.findElement(locator);
       }
       
       public static void doSendKeys(By locator,String paswrd) {
     	   getElement(locator).sendKeys(paswrd);
        }
	
	
}
