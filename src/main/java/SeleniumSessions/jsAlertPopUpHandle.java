package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsAlertPopUpHandle {
	
	//Types of alert
			//1.JsPopUp(Also Called Modal Dialoug popup
			//2.Authentication Pop-up
			//3.file upload Pop-up
			//browser based Pop-up/Advertisement pop-Up
	
	//what are the methods in alert?
			//1.getText();
			//2.accept();
			//3.dismiss();
			//4.sendKeys()
			
			
	
	
	//we can inspect only the webelement in the webpage but we cannot inspect the javascript alert pop-ups so we need to use Alert Class
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	  WebElement submit=driver.findElement(By.name("proceed"));
	  submit.click();
	  //to switch the driver from the webpage to alert we need to switch it
	  Alert alt=driver.switchTo().alert();
	  //to get the text that is present in alert .getText
	  String text= alt.getText();
	  
	  System.out.println(text);
	  
	  //to accept the alert or dismiss 
	 alt.accept();//used to accept the alert(click ok/Yes)
	// alt.dismiss();//use to dismiss ....(esc)
	 
	 //in this cases driver now will be in alert box ..to return the driver to the webpage we need to use default content
	 
	 driver.switchTo().defaultContent();
	 
	  
	 
	
	
	
	
	
		
		
		
		
		

	}

}
