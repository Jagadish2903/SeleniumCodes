package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementwithFindElements {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		List<WebElement> links=driver.findElements(By.xpath("//footer//a"));
		
//		for(WebElement e:links) {
//			String text=e.getText();
//			e.click();
//			driver.navigate().back();
//			links=driver.findElements(By.xpath("//footer//a"));
//			
//			
//		}
		
		for(int i=0;i<links.size();i++) {
			links.get(i).click();
			driver.navigate().back();
			
			links=driver.findElements(By.xpath("//footer//a"));
			
		}
		
		//when the click action is performed on about us it will try to click delivery info but since it lands on new page it will throw stale element exception
		//the Dom version gets changed so it throws stale element exceptions
		//hence always use Bylocator strategy to avoid these 
		//to avoid these situations we can use fluent wait sometimes
		
		//When we wil get StaleElement exception?
			//1.while page refreshed 
			//2.navigated forward/backward
			//3.click on link ---page gets land on new webpage
		
		
		
	}

}
