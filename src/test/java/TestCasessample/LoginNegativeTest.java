package TestCasessample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseclassTest {

	@DataProvider
	public Object[][] dologinData(){
	   
		return new Object[][] {
			{"Jaggu","Test123"},
			{"",""},
			{" "," "},
			{"groupautomation","Test123"},
			{"242763","298729"},
			{"groupautomation","Test@12345"},
			{"jack.yuvan@gmail.com","Jaggu123"}
		};
	}
	
	
	@Test(dataProvider = "dologinData")
	public void loginTest(String username,String password){
	Assert.assertTrue(dologin(username,password));
	}
	
	//creating a Utility
	
	public boolean dologin(String username,String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String errorMsg=driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		if(errorMsg.contains("No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
	}
	
}
