package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverSetup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\new folder\\driver\\geckodriver-v0.29.1-win64.\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.amazon.com");
		String title=driver.getTitle();
		System.out.println("The Title of the page is "+":"+title);
		
		if(title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is wrong");
		}
	
		

	}

}
