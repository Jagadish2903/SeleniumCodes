package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://classic.freecrm.com");
		 By headerlinks=By.xpath("//ul[@class='nav navbar-nav navbar-right']//a");
		 
		 List<WebElement>headerlinklist=driver.findElements(headerlinks);
		 System.out.println(headerlinklist.size());
		 for(WebElement e:headerlinklist) {
			 String linkName=e.getText();
			 System.out.println(linkName);
			 
//			 if(linkName.trim().equals("Pricing")) {
//				 e.click();
//				break;
//			 }
			 
		 }
	}

}
