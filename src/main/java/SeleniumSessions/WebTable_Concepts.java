package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Concepts {
		static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 driver.get("https://classic.freecrm.com/index.html?e=1");
		 
		 driver.findElement(By.name("username")).sendKeys("groupautomation");
		 driver.findElement(By.name("password")).sendKeys("Test@12345");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.switchTo().frame("mainpanel");
		 
		 driver.findElement(By.xpath("//ul//li/a[@title='Contacts']")).click();
		 
		 //to click the checkbox
		 
		 //first we need to go to the name xpath ...ie  //td/a[text()='Anand D']
		 //then follow the parent child sibling concepts
		 //since checkbox is left to the name do precedding sibling
		 
//		 driver.findElement(By.xpath("//a[text()='Anand D']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		 
		//to get the company name 
//		 String companyname=driver.findElement(By.xpath("//a[text()='Anand D']/parent::td/following-sibling::td/a[@context='company']")).getText();
//		 System.out.println(companyname);
		 
		 //to get the contact details 
		 
//		List<WebElement> contactlist= driver.findElements(By.xpath("//a[text()='Adam Jampa']/parent::td/following-sibling::td"));
		
		//start i=1 since company name we already got 
//		for(int i=1;i<contactlist.size();i++) {
//			String contactdetails=contactlist.get(i).getText();
//			System.out.println(contactdetails);
//		}
//		
//		selectContact("Adam Jampa");
		
		//to check all the checkboxes
		
//		List<WebElement> allCheckboxes=driver.findElements(By.xpath("//input[@name='contact_id']"));
//		for(int i=1;i<=allCheckboxes.size();i++) {
//			allCheckboxes.get(i).click();
//		}
//		
		clickContactcheckbox("Adam Jampa");
		System.out.println(getCompName("Adam Jampa"));
		System.out.println(getContactdetails("Adam Jampa"));

	}
	
	//creating a Utility for clicking checkbox
	public static void clickContactcheckbox(String contactname) {
		String checkBoxXpath="//a[text()='"+contactname+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkBoxXpath)).click();
	}
	
	public static String getCompName(String contactname) {
		String companyname=driver.findElement(By.xpath("//a[text()='"+contactname+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
		return companyname;
	}
	
	
	public static List<String> getContactdetails(String contactname) {
		String contactdetailsxPath="//a[text()='"+contactname+"']/parent::td/following-sibling::td";
		List<WebElement> contactdetail=driver.findElements(By.xpath(contactdetailsxPath));
		List<String> details=new ArrayList<String>();
		for(int i=1;i<contactdetail.size()-1;i++) {
			String contactdetVal=contactdetail.get(i).getText();
			details.add(contactdetVal);
			
		}
		return details;
	}
	
	

	
}
