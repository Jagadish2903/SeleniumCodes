package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementAction {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
				WebDriverManager.chromedriver().setup();
				
				driver=new ChromeDriver();
				
				driver.get("http://mrbool.com/");
//				
//				WebElement source=driver.findElement(By.className("menulink"));
//				
//				Actions act=new Actions(driver);
				
				//N:B when we write without build and perform it wont throw error in concole and also wont perform actions 
//				act.moveToElement(source).build().perform();
				//Its always good to write build and perform even if its a single action
				
				//adding throws .sleep to let driver to find the element 
//				Thread.sleep(2000);
				
				//clicking a courses menu
				
//				driver.findElement(By.linkText("COURSES")).click();
				//here even though the in DOM courses is in small case letter and in UI its in Capital letters ...we need to follow UI or else link text will throw error 
			
				
				By contents=By.className("menulink");
				By courses=By.linkText("COURSES");
				By articles=By.linkText("ARTICLES");
				By singlevideos=By.linkText("SINGLE VIDEOS");
		
				 
				parentChildMenuHandle(contents, courses);
				parentChildMenuHandle(contents, articles);
				parentChildMenuHandle(contents, singlevideos);
				
				
						}

		//creating a General utility 
		

	 	public  static WebElement getElement(By locator) {
	    	  return driver.findElement(locator);
	    }
		
		public static void parentChildMenuHandle(By parent,By child) {
			Actions act=new Actions(driver);
			act.moveToElement(getElement(parent)).build().perform();
			getElement(child).click();
			
		}
		
		
}
