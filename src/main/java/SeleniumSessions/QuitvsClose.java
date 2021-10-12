package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\new folder\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com"); //while debugging and scrolling in driver we will be getting the session id eg.123
		String title=driver.getTitle();
		System.out.println("The title of the page is " + ":"+ title);
		driver.getCurrentUrl();//while debugging and scrolling in driver we will be getting the session id same as before eg.123
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("The Current url is "+": "+CurrentUrl);
	
		//Using Quit 
		
		//To Quit the browser:
		//driver.quit();//while debugging and scrolling in driver we will be getting the session id same as before eg.123
		//driver.getTitle();//after writing anything after quit commands sesssion id is null and while executing this line it will throw NoSuch Exception
		    //throw using webdriver after quit?
		
		//Using Close 
		
		//To Close the browser:
		//driver.close();//while debugging and scrolling in driver we will be getting the session id same as before eg.123
		//driver.getTitle();//after writing anything after quit commands session id is same and while executing this line it will throw NoSuch Exception
		//throw invalid session id
		
		//final Quit vs Close
		//After Quit and Close anything using the driver methods will throw no such exceptions in both the cases 
		//in Quit it will use Null as session id 
		//in Close it will use same session id
		//in quit it will throw using webdriver after quit? along with exception
		//in close it will throw invalid session id along with exception
		
		
		
		//N:B To solve this problem initialize the driver once again after quit so that new session id will be created 
		//i.e see below
		
		driver.quit();
		driver=new ChromeDriver();//initialize the driver again 
		driver.get("http:\\www.amazon.com");
		driver.getTitle();
		
		
		

	}

}
