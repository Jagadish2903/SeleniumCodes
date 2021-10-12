package Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoWebTable {

	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 driver.get("https://www.espncricinfo.com/series/south-africa-in-sri-lanka-2021-1271624/sri-lanka-vs-south-africa-1st-t20i-1271630/full-scorecard");
		 
		 //to get the wickettaker name 
		 System.out.println(getWicketTakerName("Aiden Markram"));
	
		 System.out.println(getbatsmanscoredetail("Aiden Markram"));
		 
	
	
	
	}

	public static String getWicketTakerName(String batsman) {
		String wickettakerxpath="//a[@title='View full profile of "+batsman+"']/parent::td/following-sibling::td/span";
		String wickettaker=driver.findElement(By.xpath(wickettakerxpath)).getText();
		return wickettaker;
	}
	
	public static List<String> getbatsmanscoredetail(String batsman) {
		List<WebElement>scorecar=driver.findElements(By.xpath("//a[@title='View full profile of "+batsman+"']/parent::td/following-sibling::td"));
		List<String>scoredetails=new ArrayList<String>();
		for(int i=1;i<scorecar.size();i++) {
		String details=scorecar.get(i).getText();
		scoredetails.add(details);
	}
		return scoredetails;
	}
}
