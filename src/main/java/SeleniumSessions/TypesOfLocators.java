package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesOfLocators {

	public static void main(String[] args) {
		//Locator Types 
		//1.By Id(Always be unique)
		//2.By Name(can be duplicate sometimes
		//3.By Class Name(it is a CSS property no of class name will be calculated based on spaces (i.e form-Horizontal is a 1 class name and form horizontal is a 2 class name)
				//if there is eg. 3 matches it will pass the value to the first value always
		//4.By Xpath(It is not the attribute its like a address of the web element)
		//5.By Css Selector(It is not the attribute,CSS is CASTCADED STYLE SHEET,Its something like design)
		//6.By linkText(All the links will be in a tag (anchor tag) href --Hyperlink reference
		//7.By partialLinkText
		//8.By tagName
		
		
		//to validate the perfect match ..press ctrl +F  and type and enter it should be 1of1 match 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//By Link Text
		By regLink=By.linkText("Register");
		
		ElementUtil ele=new ElementUtil(driver);
		ele.doClick(regLink);
		
		//By Namex
		By name=By.name("firstname");
		ele.doSendKeys(name, "Jaggu");
		
		//By tagName
		By tag=By.tagName("h1");
		System.out.println(ele.getText(tag));
		
		
		
		
	
	
		
		
		
		
		
		
	}

}
