package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//WebDriver is an Interface 
		//Parent of WebDriver Interface is SearchContext Interface (find element and find elements method are already available)
		//In WebDriver lot of methods are already available (like getTitle(),geturl()...)
		//WebDriver has a Child class called remote Web Driver 
		//Chrome Driver/firefox driver/Safari driver are childs of remote Web Driver
		
		
		//in the above cases Top Casting can be done between //1.WebDriver to ChromeDriver
		//2.RemodeWebDriver to ChromeDriver
		//3.SearchContext to ChromeDriver
		//4.WebDriver to RemodeWebDriver
		//5.SearchContext to RemodeWebDriver
		
		
		//above 5 cases always 1st and 4th is the best cox wen we try some thing else we will get object reference check 
		
		//eg.WebDriver driver=new WebDriver();
		//we cannot create like above case so we need to create a TopCasting
		
		
		//To set path for ChromeDriver 
		System.setProperty("webdriver.chrome.driver","E:\\new folder\\driver\\chromedriver_win32\\chromedriver.exe");
		
		//line to launch the browser
		WebDriver driver=new ChromeDriver();
		//the above line helps to access all the properties of Webdriver 
		
		//to launch URL(removing http will throw error)(but we can remove www.)
		driver.get("http:\\www.amazon.com");
		
		//to print Title in console
		String title=driver.getTitle();//return type of gettitle is string 
		System.out.println("The Page Title is "+":" +title);
		
		
		//selenium will not tell whether title is crct or not so we need to validate 
		//so using if else 
		if(title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is wrong");
		}
		
		
		//to get pagesource()
		//String pageSource=driver.getPageSource();
		//System.out.println("The Page Source is "+ ":"+pageSource);
		
		//to get the CurrentURL
		
	      String CurrentURl=driver.getCurrentUrl();
	      System.out.println("The Current Url is " +" :" + CurrentURl);
		
	      if (CurrentURl.contains("com")){
	    	  System.out.println("The Current URL has com in the link");
	      }
	      else{
	    	  System.out.println("The Current URl doesnt have com in the link");
	      }
		
		
	      //to Close the browser
	      driver.quit();
		

	}

}
