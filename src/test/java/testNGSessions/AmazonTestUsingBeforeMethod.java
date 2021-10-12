package testNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestUsingBeforeMethod {
	//in the below example when we executed using testNG BeforeMethod and After method will be Executed Thrice 
	//it will open three times amazon and test one and close again open test and close.....

		WebDriver driver;
		
		
		@BeforeMethod
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.amazon.in/");
		}
		
		@Test
		public void titleTest() {
			String Title=driver.getTitle();
			Assert.assertEquals(Title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		}
		
		@Test
		public void searchTest() {
			boolean searchbox=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
			Assert.assertTrue(searchbox);   //method for boolean
		}
		
		@Test
		public void logoTest() {
			boolean logo=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
			Assert.assertTrue(logo);   //method for boolean
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
		//both AmaxontestBeforeTest and AmazontestBeforeMethod has its own importance both are good in terms of thier own like 
		//1.if no of cases is more its Best to use BeforeMethod(best for sanity/regression) ----Execution time is more but % of result pass will be more
		//2.If smoke testcases to be done its best to go for BeforeTest(Smoke) ----Execution time is less but  % of result pass will be less
		
		
		
	}
