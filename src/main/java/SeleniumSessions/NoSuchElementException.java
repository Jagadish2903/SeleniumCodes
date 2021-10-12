package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementException {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://demo.opencart.com/index.php?route=account/login");
		 
		 By searchbox=By.name("search2");
		 //using findElement it will try to find the single element and if not found it will throw NosuchElementException since search2 path is incorrect
		 //driver.findElement(searchbox).sendKeys("iphone");
		 
		 //using findElements it will try to find the single element from the list and if not found it will throw blanklist(0) since search2 path is incorrect
		 List<WebElement> ele=driver.findElements(searchbox);
		System.out.println(ele.size());
		 
	}

}
