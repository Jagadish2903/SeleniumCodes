package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
	
		//isDisplayed---It is used to check whether the element is displayed or not and the return type of it is boolean
		//isEnabled ---It is used to check whether the box is enabled or not (eg.search or submit button) and return type is boolean
		//isSelected --It is used to check whether the element is selected or not (Eg.Checkbox) and return type is boolean
		
		BrowserUtility br=new BrowserUtility();
		WebDriver driver=br.initDriver("chrome");
		br.launchUrl("https://classic.freecrm.com/register/");
		
		boolean header=driver.findElement(By.id("submitButton")).isDisplayed();		
		System.out.println(header);//since the element is displayed it will result as true
		
		boolean submitbtn=driver.findElement(By.id("submitButton")).isEnabled(); 
		System.out.println(submitbtn);//since the button is not enabled it will result as false
		
		boolean checkbx=driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).isSelected();
		System.out.println(checkbx);//since the checkbox is not checked it will result as false
		
		//getAttribute --It gives the attribute value of the webelement locator and return type is String
		
		String placehldr=driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[3]/input")).getAttribute("placeholder");
		System.out.println(placehldr);//this will give the value of placeholder
		
		if(placehldr.equals("First Name")) {
			System.out.println("The element is First Name");
		}
		
		
	}

}
