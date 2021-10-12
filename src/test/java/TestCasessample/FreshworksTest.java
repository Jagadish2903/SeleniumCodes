package TestCasessample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreshworksTest extends BaseclassTest {

	@Test(priority = 2)
	public void titleTest() {

		String Title = driver.getTitle();
		Assert.assertEquals(Title, "Freshworks | Modern and Easy Customer and Employee Experience Software");
	}

	@Test(priority = 1)
	public void logoTest() {
		
		boolean logo = driver.findElement(By.cssSelector("body > header > nav > div > div > div > div > a > img"))
				.isDisplayed();
		Assert.assertTrue(logo); // method for boolean
	}

}
