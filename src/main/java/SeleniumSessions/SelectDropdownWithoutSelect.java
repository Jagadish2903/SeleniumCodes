package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownWithoutSelect {

		static WebDriver driver;
		public static void main(String[] args) {
		 
			
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
			driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
			By option=By.xpath("//select[@id='Form_submitForm_Country']/option");
			
			List<WebElement> optionslist=driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
			System.out.println(optionslist.size());
			for(WebElement e:optionslist) {
				String text=e.getText();
				System.out.println(text);
				 if(text.equals("Nepal")) {
					 e.click();
					 
				 }
			}
		}
		
	
		
		public static List<WebElement> getElements(By locator){
	 		return driver.findElements(locator);
	 	}
				
				public static void doSelectDropDown(By locator,String value) {
					List<WebElement> optionslist=getElements(locator);
						for(WebElement e:optionslist) {
						String text=e.getText();
						System.out.println(text);
						 if(text.equals(value)) {
							 e.click();
							 
						 }
					}
				}
	}


