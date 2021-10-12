package AssignmentsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestAssignment {

	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}
	
	
	  @Test
	  public void loginwithInvalidUserName() {
		 driver.findElement(By.id("input-email")).sendKeys("Jaggu");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		String ActualMsg= driver.findElement(By.xpath("//div[contains(@class,'alert-danger')]")).getText();
		  Assert.assertEquals(ActualMsg,"Warning: No match for E-Mail Address and/or Password.");
	  }
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
