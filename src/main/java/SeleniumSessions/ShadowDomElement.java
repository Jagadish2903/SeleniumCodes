package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomElement {

    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//has tag like shadow root
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://books-pwakit.appspot.com/");
		 
		 //driver.findElement(By.id("input")).sendKeys("Jaggu");
		 //the above line throws error cox its in shadowDom
		 //wen we inpect the search it will have shadow root tag
		 //inspect the search and go to DOM and copy the JS Path of Book(Parent) and go to console and enter 
		 //in Console  write  .shadowRoot.querySelector('#input')       ---here input is the css selector
		 
		 //this is the java script to convert it we need to use javascript executer
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")");
		 
		//its returning a Webelement so typecast WebElement
		 
		WebElement input=(WebElement) (js.executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")"));
		 input.sendKeys("Jaggu");
		 
		 //now this will pass the value to the search 
		 
	}

}
