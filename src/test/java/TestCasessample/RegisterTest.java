package TestCasessample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest extends BaseclassTest {

	@DataProvider
	public Object[][] registerData() {
		return new Object[][] {
			{"kumar","luis","kumarlouispas123@gmail.com","9850632940","Test789456"},
			{"Muthu","mani","manimuthu123@gmail.com","9952519861","Test12345026"},
			{"joy","cf","joyjai123@gmail.com","7358546612","Test12345poi6"},
//			{"dinesh","art","art123@gmail.com","123457866","Test12345g6"}
			
			
		};
	}
	
	
	
	
	@Test(dataProvider = "registerData")
	public void register(String firstName,String lastName,String email,String telno,String password) {
	
		Assert.assertTrue(doregister(firstName, lastName, email, telno, password));
	}
	
	
	
	
	
	
	public boolean doregister(String firstName,String lastName,String email,String telno,String password) {
		   driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		   driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		   driver.findElement(By.id("input-email")).sendKeys(email);
		   driver.findElement(By.id("input-telephone")).sendKeys(telno);
		   driver.findElement(By.id("input-password")).sendKeys(password);
		   driver.findElement(By.id("input-confirm")).sendKeys(password);
		   driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
		   
		   String mSg=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		   
		   
		   if(mSg.contains("Your Account Has Been Created!")) {
			   return true;
			   
		   }
		   driver.findElement(By.linkText("Logout")).click();
			return false;
		}
	
	
}
