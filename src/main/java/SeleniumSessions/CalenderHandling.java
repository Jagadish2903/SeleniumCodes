package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	 static WebDriver driver;
		public static void main(String[] args) {
			//has tag like shadow root
			
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			 driver.findElement(By.id("datepicker")).click();
			 
//			 String Actualmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			 
//			 System.out.println(Actualmonth);
//			 
//			 String expectedMonth="November 2022";
//			 
//			 
//			// By selectDate=By.xpath("//a[text()='21'");
//			 
//			 
//			while(!Actualmonth.equals(expectedMonth)) {
//				driver.findElement(By.xpath("//a//span[text()='Next']")).click();
//				Actualmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			}
//			selectparticularDate("10");
//			
			
			selectFutureDate("December 2022", "20");
			
	}
	
		//creating a general utility
		
		
		
		public static void selectFutureDate(String expectedMonth,String day) {
			if(Integer.parseInt(day)>31) {
				System.out.println("please enter correct date");
				return;
			}
			String Actualmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText(); 
			while(!Actualmonth.equalsIgnoreCase(expectedMonth)) {
				driver.findElement(By.xpath("//a//span[text()='Next']")).click();
				Actualmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			}
			selectparticularDate(day);
		}
		
		
		
		
		public static void selectparticularDate(String day) {
			driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		}
}
