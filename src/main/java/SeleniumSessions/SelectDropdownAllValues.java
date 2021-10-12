package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownAllValues {
	static WebDriver driver;
	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement countrydd=driver.findElement(By.id("Form_submitForm_Country"));
		
		Select select=new Select(countrydd);
		//to get all the dropdownoptions
		List<WebElement> Alloptions=select.getOptions();
		System.out.println("Total options available is " +Alloptions.size());

		//for loop for getting all options available
//		for(WebElement e:Alloptions) {
//			String opt=e.getText();
//			System.out.println(opt);
//		}

		//for loop for getting all options available and select particular value wihout using select 
		for(WebElement e:Alloptions) {
			String opt=e.getText();
			System.out.println(opt);
				if(opt.equals("India")) {
					e.click();
					break;
				}
		}
		
		}
	
	public  static WebElement getElement(By locator) {
  	  return driver.findElement(locator);
  }
	
	public static void doSelectDropDown(By locator,String value) {
		Select select=new Select(getElement(locator));
		List<WebElement> Alloptions=select.getOptions();
		for(WebElement e:Alloptions) {
			String opt=e.getText();
			System.out.println(opt);
				if(opt.equals(value)) {
					e.click();
					break;
				}
		}
		
		
}
}

