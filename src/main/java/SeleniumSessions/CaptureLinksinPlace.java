package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureLinksinPlace {
	//Google offered in: हिन्दी বাংলা తెలుగు मराठी தமிழ் ગુજરાતી ಕನ್ನಡ മലയാളം ਪੰਜਾਬੀ  capture links in the google.com for the particular languages
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		driver.get("https://www.google.com/");
		
		//getting all the links so using findElements
		List<WebElement> langlist=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		//to get the size of the links
		System.out.println(langlist.size());
		
		//to get all the list of links we need to use the loop so using for loop 
		for(WebElement e:langlist) {
			String langtext=e.getText();
			System.out.println(langtext);
			
			if(langtext.trim().equals("தமிழ்")) {
				e.click();
				break;
				
			}
		}
		

		//creating a general utility for a specific link to be click 
//		By langlist=By.xpath("//div[@id='SIvCob']/a");
	}
//		public static void doLinkClick(By locator,String linkvalue ) {
//			List<WebElement> langlist=driver.findElements(locator);
//			
//			for(WebElement e:langlist) {
//				String langtext=e.getText();
//				System.out.println(langtext);
//				
//				if(langtext.trim().equals(linkvalue)) {
//					e.click();
//					break;
//		}
//				
//			}
//		}
		}