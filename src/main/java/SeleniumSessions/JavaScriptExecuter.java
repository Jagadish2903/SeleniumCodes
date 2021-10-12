package SeleniumSessions;

import javax.swing.text.Document;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuter {
 static WebDriver driver;
     

	public static void main(String[] args) throws InterruptedException {
		
		//JavaScriptExecutor is an interface that provides a mechanism to execute Javascript through selenium driver
		
		//JavaScript Executer is the Parent of remote WebDriver
		//remote WebDriver is the Child of WebDriver and JavaScript Executer
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		
		 //in JavaScript executor various methods are used to function same as like java
		 //1.	To get Title 
		 		//in selenium driver.getTitle()
		 		//in javascript executer document.title
		 
		 //2.	to get the all the text in page 
		 		//in javascript executer document.documentElement.innerText
		 
		 //3.	to get the alert
		 		//in javascript executer Alert(' ')
		 		
		 //4.	to refresh the page 
		 		//in javascript exe  history.go[0] 
		 		//in selenium driver.navigate.refresh()
		 
		 //5.	to draw a border
		 		//in javascript executer  argument[0].style.border='3px solid red',element
		 
		 //6.	to highlight the element
		  		//in javascript executer  argument[0].style.backgroundColor='color',element
		  
		 //7.	to scrolldown the page
		  		//in javascript executer window.scrollto(0,document.body.scrollHeight)
		  
		 //8. 	to scrollup the page
	  			//in javascript executer window.scrollto(document.body.scrollHeight,0)
		  
		 //9.	to scrolldown the page to specific height
	  			//in javascript executer window.scrollto(0,Height)
	  
		 //10. 	to scrollup the page to specific height
				//in javascript executer window.scrollto(Height,0)
		  
		 //11. 	to scroll the page upto the specific element
		  		//in javascript executer "argument[0].scrollIntoView(true)";,element
		  
		 //12. 	to click the element 
		  		//in javascript executer argument[0].click,element
		  		//in selenium .click()
		  
		 //13.	to send values  
		  		//in javascript executer document.getElementById("id").value="value"
		  		//in selenium driver.findelementBy.id().sendkeys("value")
		  
		  driver.get("https://www.amazon.com/");
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  Thread.sleep(2000);
//		  js.executeScript("window.scrollBy(0,500)");
//		  
		  
		 
		
		  
		 
	}

}
