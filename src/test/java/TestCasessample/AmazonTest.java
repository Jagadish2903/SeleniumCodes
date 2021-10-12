package TestCasessample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseclassTest {


		
		
		@Test(priority=2)
		public void titleTest() {
			String Title=driver.getTitle();
			Assert.assertEquals(Title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		}
		
		@Test(priority=3)
		public void searchTest() {
			boolean searchbox=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
			Assert.assertTrue(searchbox);   //method for boolean
		}
		
		@Test(priority=1)
		public void logoTest() {
			
			boolean logo=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
			Assert.assertTrue(logo);   //method for boolean
		}
		
	
		
		
		
	}
