package SeleniumSessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByVisibleText {

    static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();  
		 driver=new ChromeDriver();
		 driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		 WebElement countrydd=driver.findElement(By.id("Form_submitForm_Country"));
		 
		 Select select=new Select(countrydd);
		 select.selectByVisibleText("Iraq");
		 //to know whether the visible text is selected or not
		 String text=select.getFirstSelectedOption().getText(); 
		 if(text.equalsIgnoreCase("iraq")) {
			 System.out.println("Element is selected");
		 }else {
			 {
				 System.out.println("Element is not selected");
			 }
		}			 
	}
	 //creating a utility for visible text is selected or not
	
	 public  static WebElement getElement(By locator) {
	  	  return driver.findElement(locator);
	  }
	 
	 public static boolean doSelectByValue(By locator,String value) {
			Select select=new Select(getElement(locator));
			select.selectByValue(value);
			return isDropDownValueSelected(select, value);
		}
	 
	 public static boolean doSelectByVisibleText(By locator,String Text) {
			Select select=new Select(getElement(locator));
			select.selectByVisibleText(Text);
			return isDropDownValueSelected(select, Text);
		}
	 
	 public static boolean isDropDownValueSelected(Select select,String expValue) {
		 if(select.getFirstSelectedOption().getText().contains(expValue)) {
			 return true;
		 }return false;
	 }
	
}
