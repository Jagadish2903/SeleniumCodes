package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintOnlyHeaders {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://classic.freecrm.com");
		 
		 By headers=By.xpath("//section[@id='details']//h3");
		 
		 List<WebElement> headerslist=driver.findElements(headers);
		 System.out.println(headerslist.size());
		 
		 for(WebElement e:headerslist) {
			 String headerName=e.getText();
			 System.out.println(headerName);
		 }
	}

}
