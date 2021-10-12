package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoWebTableHandle {

	static WebDriver driver;
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/south-africa-in-sri-lanka-2021-1271624/sri-lanka-vs-south-africa-1st-t20i-1271630/full-scorecard");

		List<WebElement> batsman=driver.findElements(By.xpath("//td[@class='batsman-cell text-truncate out']/a"));
		
		for(int i=0;i<=batsman.size();i++) {
			String batsman_name=batsman.get(i).getText();
			System.out.println(batsman_name);
			break;
		}
		
		
		
		
	}

}
