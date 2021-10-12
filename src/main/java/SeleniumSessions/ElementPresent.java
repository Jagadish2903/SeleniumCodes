package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPresent {

	//to Check whetehr element is present or not (another type of not using isDisplayed()) --Using find elements
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://demo.opencart.com/index.php?route=account/login");
		 
		 List<WebElement> isPresent=driver.findElements(By.name("search"));
		 System.out.println(isPresent.size());
		 
		 if(isPresent.size()== 1) {
			 System.out.println("Element is Present");
		 }else
		 {
			 System.out.println("Element is not present");
		 }
		 
		 //Creating a general utilty to check element occurance
		 
		
	}

}
