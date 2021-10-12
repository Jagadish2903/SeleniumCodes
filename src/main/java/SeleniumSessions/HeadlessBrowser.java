package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		//3 Types
		//1.headless browser ---using browser options---It will not launch the browser,but it will block the visibility(display)
		//2.Ghost Driver+PhantomJS-->head less --intract with HTML Page source of the Application --and its depricated now
		//3.HTML unit driver--->headless---intract with HTML Page source of the Application---its a separate library need to add 
		
		//recomended one is head less browser using browser options
		
		//pros and cons
		//1.Faster than UI Mode
		//2.headless is not recommended for complex applications(eg.pop ups/mouse movement..etc)
		//3.recommended for Sanity testcases (15-25 tcs)
		//4.multitasking can be done using head less
		
		WebDriverManager.chromedriver().setup(); //This will check the version of driver with browser /no need to write system.setproperty 
		
		//To run the headless browser 
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");//It should be like this only predefined 
		
		//To run the incognito mode
		co.addArguments("--incognito");//this is used to not to save the history 
		
		
		//when we hover in chromedriver in RHS we can find ChromeDriver(ChromeOptions options) which says that it is a constructor
		WebDriver driver=new ChromeDriver(co);//it is compulsory to pass co if we dont it wont run in headless
		
		
		driver.get("http:\\www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		

	}

}
