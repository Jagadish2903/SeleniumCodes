package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
	
	static WebDriver driver;//declaring it in class level and creating a static to avoid creation of unnecessary objects

	public static void main(String[] args) {
	  //if one needs to test in multiple browser at a time
		
		String browser="safari";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\new folder\\driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\new folder\\driver\\geckodriver-v0.29.1-win64.\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("please enter correct browser name");
		}
		
		driver.get("http:\\www.amazon.com");//when browser doesnt satisfies it will throw null pointer exception
		String url=driver.getCurrentUrl();
		System.out.println("The Current Url is "+":"+url);
		String title =driver.getTitle();
		System.out.println("The Title of the page is "+":"+title);
		driver.close();
		

	}

}
