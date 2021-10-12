package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElements {
       static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//SVG Elements are mostly graphs 
		//Scallable vector Graphics
		//normal xpath wont work in these kind 
		//		//*[local-name()='svg']   ---syntax	
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://emicalculator.net/");
		//getting the xpath for all the vertical bars 
		String verticalbarsXpath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		String textXpath="//*[local-name()='svg']//*[name()='g' and contains(@class,'highcharts-tooltip')]//*[name()='text']//*[name()='tspan']";
		
		List<WebElement> element=driver.findElements(By.xpath(verticalbarsXpath));
		
		//to move to all the elements we need to use Actions class
		Actions act=new Actions(driver);
		for(WebElement e:element) {
			act.moveToElement(e).build().perform();
			
			
			//we need to get the tooltip so 
			//to freeze the DOM go to sources and press Function + F8 
			//this will freeze the Dom and WebPage with tooltip
			//to get the value in tooltip we need to find xpath for tooltip and use gettext
			String tooltip=driver.findElement(By.xpath(textXpath)).getText();
			System.out.println(tooltip);
		}	

	}

}
