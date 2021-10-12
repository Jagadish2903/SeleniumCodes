package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConcepts {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		// here there is a 19 pages in the list
		// to create a generic xpath which is used to click next pages using loop
		// String pageXpath="(//div[@class='pagination'])[1]/a";
		// collecting all the links
		// List<WebElement>links= driver.findElements(By.xpath(pageXpath));

//		int i=0;
//		//since the number of pages not known we can use while loop
//		while(true){
//	     if(driver.findElements(By.linkText("Tim Simmsonss")).size() > 0){//if the element is need to be found from the list we need to use this kind 
//	    	clickContactcheckbox("Tim Simmson");
//	    	 break;
//	     }else {
//	    	 //pagenation logic
//	    	 //if element is not found in the first page we need to iterate all pages so we use instead of for loop we use int i=0 in top level and then 
//	    	 try{
//	    		 links.get(i).click();//we need to click next page 
//	    	 }catch(Exception e) {
//	    		 System.out.println("total pages is over ...please enter crct name ");
//	    		 break;
//	    	 }
//	    	 links=	driver.findElements(By.xpath(pageXpath));	 
//	     }
//	     i++;
//		}
		// there is a chance of user trying to enter the name which is not present if
		// that happens it will throw index out of bound exception so
		// use try catch for that
		String pagesXpath="(//div[@class='pagination'])[1]/a";
		SelectContactFromList("Tim Simmsons", pagesXpath);
	}

	public static void SelectContactFromList(String contactname,String pagesXpath) {
		
		List<WebElement> links = driver.findElements(By.xpath(pagesXpath));
		int i = 0;

		while (true) {
			if (driver.findElements(By.linkText(""+contactname+"")).size() > 0) {
				clickContactcheckbox(""+contactname+"");
				break;
			} else {
				try {
					links.get(i).click();// we need to click next page
				} catch (Exception e) {
					System.out.println("total pages is over ...please enter crct name ");
					break;
				}
				links = driver.findElements(By.xpath(pagesXpath));
			}
			i++;
		}
	}

	public static void clickContactcheckbox(String contactname) {
		String checkBoxXpath = "//a[text()='" + contactname
				+ "']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkBoxXpath)).click();
	}

}
