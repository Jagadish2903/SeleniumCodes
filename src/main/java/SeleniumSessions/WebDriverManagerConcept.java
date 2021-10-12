package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {
      static WebDriver driver;
	public static void main(String[] args) {
		//Chrome Driver using WebDriverManager
		WebDriverManager.chromedriver().setup(); //This will check the version of driver with browser /no need to write system.setproperty 
		 driver=new ChromeDriver();
		driver.get("http:\\www.amazon.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		//Firefox Driver using WebDriverManager
		WebDriverManager.firefoxdriver().setup();//This will check the version of driver with browser /no need to write system.setproperty
		 driver=new FirefoxDriver();
		driver.get("http:\\www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
