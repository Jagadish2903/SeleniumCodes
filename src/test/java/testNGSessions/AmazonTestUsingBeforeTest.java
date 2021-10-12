package testNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestUsingBeforeTest {
	WebDriver driver;
	
	//in before test these are the pre conditions(Always use setUp as method)
	//in after test these are my post steps (Always use tearDown as method)
	//in Test annotation always use method name ending with test(Eg.titleTest())
	//in the below example when we exeutec using testNG Before Test and After Test will be Executed only once since its not written as @before/After Method
	@BeforeTest
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
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
