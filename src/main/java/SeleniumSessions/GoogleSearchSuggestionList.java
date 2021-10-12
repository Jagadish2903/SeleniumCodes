package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestionList {

	static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		driver.findElement(By.id("yschsp")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> suggestionlist=driver.findElements(By.xpath("//ul[@role='listbox']//span[@style='display: block;']"));
		
		for(WebElement e:suggestionlist) {
			String text=e.getText().trim();
			System.out.println(text);
			  if(text.equals("selenium webdriver"))	{
				  e.click();
				  break;
			  }
		
			  
			  
			  
		By sugg=By.xpath("//ul[@role='listbox']//span[@style='display: block;']");
		By search=By.id("yschsp");
		
		 googleSearchSelect(search,sugg,"Selenium","Selenium Webdriver");
		
		}
}
		public static WebElement getElement(By locator) {
	    	  return driver.findElement(locator);
	    }
	 	
	 	public static List<WebElement> getElements(By locator){
	 		return driver.findElements(locator);
	 	}
		
		public static void googleSearchSelect(By search,By suggestion,String searchKey,String value) throws InterruptedException {
			getElement(search).sendKeys(searchKey);
			Thread.sleep(2000);
			List<WebElement> suggestionlist=getElements(suggestion);
			
			for(WebElement e:suggestionlist) {
				String text=e.getText().trim();
				System.out.println(text);
				  if(text.equals(value))	{
					  e.click();
					  break;
				  }
			}
		}

}
