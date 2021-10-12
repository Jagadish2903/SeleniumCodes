package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHtmltagDropdown {
	static WebDriver driver;
	public static void main(String[] args) {
	 //It is not necessary that the dropdown should always have a Select tag 
	//Handling HTML tag Select ----Use Select class in selenium
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement countrydd=driver.findElement(By.id("Form_submitForm_Country"));
		
		//Select Class can be used only if the dropdown has Select HTML tag 
		//Select select=new Select();
		//The above line throws error in compile type since parameter is undefined 
		Select select=new Select(countrydd);
		
		//Select methods in Java
//		   select.selectByIndex(0);
//		   select.selectByValue("India");
//		   select.selectByVisibleText("India");
		
		
		//to select  based on Index(always used on static dropdown)
			//select.selectByIndex(3);

		//to select based on the value(Can be used for dynamic dropdown)
			//select.selectByValue("India");
		
		//to select based on the Visible text 
		select.selectByVisibleText("Albania");
		
		
		//Diff between Slect by Value and Visible text
		
			//Select by value is used to select the value based on the Attribute value and Select by Visible Text is selected based on the text on the option
		
		
		//using utility func
		By country=By.id("Form_submitForm_Country");
		doSelectByIndex(country,100);
		
		
		
	}
	
	//To Create a General Utility 
	
	public static WebElement getElement(By locator) {
  	  return driver.findElement(locator);
  }
	
	public static void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
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
	
	//to get the visible text is selected or not ...
	
}
