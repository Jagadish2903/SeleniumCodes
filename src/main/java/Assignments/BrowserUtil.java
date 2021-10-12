package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

		public WebDriver driver;
		
		public WebDriver initDriver(String browserName) {
			if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}else {
				System.out.println("please enter correct browser name");
			}
			return driver;
		}
		
		/**
		 * This method is used to validate URL
		 * @param url
		 */
		public void launchUrl(String url) {
			if(url.isEmpty() ||url==null) {
				System.out.println("Please pass correct URL");
				return;
			}else 
			{
				driver.get(url);
			}
		}
		
		/**
		 * This method is used to get Title
		 * @param title
		 * @return
		 */
		public String getTitle() {
			return driver.getTitle();
		}
		
		/**
		 * This method is used to get the url
		 * @return
		 */
		public String getUrl() {
			return driver.getCurrentUrl();
		}
		
		/**
		 * This is used to close the browser
		 */
		public void closeBrowser() {
			driver.quit();
		}
		
		public void quitBrowser() {
			driver.quit();
		}
	}


	


