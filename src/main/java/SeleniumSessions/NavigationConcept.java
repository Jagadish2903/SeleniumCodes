package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		System.out.println("The title of the page is "+":"+(driver.getTitle()));
		
		//TO Navigate to diff site 
		driver.navigate().to("http:\\www.amazon.com");//This will naviagte from google to amazon
		System.out.println("The title of the page is "+":"+(driver.getTitle()));
		
		//to Naviagte back 
		driver.navigate().back();//this will navigate back 
		System.out.println("The title of the page is "+":"+(driver.getTitle()));
		
		//to naviagte forward
		driver.navigate().forward();//this will navigate forward
		System.out.println("The title of the page is "+":"+(driver.getTitle()));
		
		//to refresh the current page
		driver.navigate().refresh();
	}

}
