package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUps {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	
	//we cannot the inspect the authentication Pop-up 
	//since this is a Browser generated Pop-up
	//to handle this 
	

	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	//here admin is the username 
	//and admin is password ....like username:password and then @
	
	
	//we can write above cases like these also 
	
	String username="admin";
	String password="admin";
	driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	
	
	//Limitation for these scenario is 
		//1.Cross Platform
		//2.if username and password itself as @ it wont work 
	
	//to handle these limitations we can use CDP---(CDP-Chrome Dev Protocols)
	
	

	}

}
