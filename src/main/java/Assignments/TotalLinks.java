package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.ElementUtil;

public class TotalLinks {
	
		public static void main(String[] args) {
			BrowserUtil br=new BrowserUtil();
			WebDriver driver=br.initDriver("chrome");
			
			br.launchUrl("https://demo.opencart.com/index.php?route=account/login");	
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			//to get the total links in the page
			System.out.println(links.size());
			
			ElementUtil ele=new ElementUtil(driver);
			By register=By.linkText("Register");
			ele.doClick(register);
			
			List<WebElement> textfields=driver.findElements(By.tagName("input"));
			System.out.println(textfields.size());//to get the total textfields available in register page
			
			//to get the placeholder by iterating using for loop
			for(int i=0;i<textfields.size();i++) {
				String holderattr=textfields.get(i).getAttribute("placeholder");
				System.out.println("The placeholder values are as" +holderattr);
			}
			
			System.out.println("_____________________________________________________");
			
			//using enhanced for loop
			for(WebElement e:textfields) {
				String holattr=e.getAttribute("placeholder");
				System.out.println(holattr);
			}
		
			
			
			
			
			
		

	}

}
