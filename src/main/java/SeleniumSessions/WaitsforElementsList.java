package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsforElementsList {

	static WebDriver driver;
	//here we need to get the list of webelements using waits
		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com");
		
		By linkslist=By.xpath("//ul[@class='footer-nav']//a");
		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		List<WebElement> elelist=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(linkslist));
//		for(WebElement e:elelist) {
//			System.out.println(e.getText());
//		}
		
		System.out.println(getListofElementsusingWaits(linkslist, 5));
		printListofElements(linkslist, 5);
	}

		//creating a general utility for list of elemenets presence
		
		public static  List<WebElement> waitforPresenceofElements(By locator,int timouts) {
			WebDriverWait wait=new WebDriverWait(driver, timouts);
			return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		}
		
		public static List<String> getListofElementsusingWaits(By locator,int timeouts) {
			List<WebElement>elelists=waitforPresenceofElements(locator,timeouts);
			List<String>eleVallist=new ArrayList<String>();
			for(WebElement e:elelists) {
				eleVallist.add(e.getText());
			}
			return eleVallist;
		}
		
		public static void printListofElements(By locator,int timeouts) {
			List<WebElement>elelist=waitforPresenceofElements(locator,timeouts);
			for(WebElement e:elelist) {
				System.out.println(e.getText());
			}
		}
		
		public static List<WebElement> waitforVisibilityofElements(By locator,int timouts) {
			WebDriverWait wait=new WebDriverWait(driver, timouts);
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}

		public static List<String> getVisibleListofElementsusingWaits(By locator,int timeouts) {
			List<WebElement>elelists=waitforVisibilityofElements(locator,timeouts);
			List<String>eleVallist=new ArrayList<String>();
			for(WebElement e:elelists) {
				eleVallist.add(e.getText());
			}
			return eleVallist;
		}
		
}
