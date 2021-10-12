package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

		//How will u get total images in the page
		//and print all the values of the attribute

public class FindElements {
			static   WebDriver driver;
	public static void main(String[] args) {
	    WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   
	   driver.get("https://www.amazon.in/");
	  List<WebElement> ele=driver.findElements(By.tagName("img"));//return type of findElements is List<WebElement>
	  //List is the parent of Arraylist
	  System.out.println(ele.size());//to get the total images .size method
	  
	  //to get the values of the attribute we can use the for loop or enhanced for loop
	  	//for loop
//	   for(int i=0;i<ele.size();i++) {
//		  String attr =ele.get(i).getAttribute("alt"); 
//		  String Val=ele.get(i).getAttribute("src");
//		  System.out.println(attr+":"+Val);
//	   }
	   
	   
	   //enhanced for loop
	  for(WebElement e:ele) {
		String attr=  e.getAttribute("alt");
		String Val=e.getAttribute("src");
		System.out.println(attr + ":"+Val );
	  }
	}

}
