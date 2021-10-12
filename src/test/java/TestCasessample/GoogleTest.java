package TestCasessample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseclassTest{

	//in this package there is 3 class with different cases but if one needs run all the testcases in 3 class
	//we need to use testrunner.xml
	// its not a java source so we need to create separately in source folder 
	//in source folder create a folder testrunner folder
	//under testrunner folder create a file and save as testNG.xml 
	//run the testcase by creating a testblock in xml file and run from there 
	//this will reproduce the result for all the 3 classes as a single runner file 
	
	
		
			@Test(priority=1)
			public void titleTest() {
				
				String Title=driver.getTitle();
				Assert.assertEquals(Title, "Google");
			}
			
			@Test(priority=2)
			public void searchTest() {
				boolean searchbox=driver.findElement(By.name("q")).isDisplayed();
				Assert.assertTrue(searchbox);   //method for boolean
			}
			
		
		
			
			
		}


