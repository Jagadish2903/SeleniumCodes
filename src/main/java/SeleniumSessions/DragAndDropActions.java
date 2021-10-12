package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropActions {

	static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
			
			
			
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement target=driver.findElement(By.id("droppable"));
			
			//To perform drag and drop we need to use Actions class
			//Actions class has a parameter by default (Driver)
			//Select class has a parameter by default (WebElement)
			
			 Actions act=new Actions(driver);
			
			 //To perform this first we need to click and hold and then drag and then drop 
			 //Note:Always wen we use Actions class we need to use build and Perform 
			 //Build can sometimes can be ignored if we use only one action
			 //we can perform these 3 actions by 3 ways 
			 
			 //1.Using ClickAndHold.movetoElement.release(here there are three actions so we need to use build and perform)
			 
//			 act.
//			 	clickAndHold(source).	
//			 		moveToElement(target).
//			 			release().
//			 				build().
//			 					perform();
			
			 
			 //2.we have a direct method to perform drag and drop
			 
//			 act.dragAndDrop(source, target).build().perform();
			 
			 //3.Since drag and drop is a single action in the above method we can omit build method
			 act.dragAndDrop(source, target).perform();
			 
			 
			
	}

}
