package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptions {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("jaggulav");
		
		driver.navigate().refresh();
		
		
		
		//email.sendKeys("jaggu123");//this will throw stale element exceptions
		
		//first dom gets loaded and browser reads those api and display those element in webpage 
		//wen we refresh the page DOM gets updated so the version of the DoM differs
		//even if we use waits this will not stop 
		//to stop the stale elemeent exception we need to reinitialize the WebElement.
		
		
		WebElement email2=driver.findElement(By.id("input-email"));
		email2.sendKeys("jaggu12345");
		
		
		
		
		
		
		
	}

}
