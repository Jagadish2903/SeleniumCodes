package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	//To create a documentation like /** we need to press / then ** and then enter 
	//To know the total methods in the class use ctrl+o
	
	public WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of browser 
	 * @param browserName
	 * @return
	 */
	public WebDriver initDriver(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver","E:\\new folder\\driver\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver","E:\\new folder\\driver\\geckodriver-v0.29.1-win64.\\geckodriver.exe");
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
