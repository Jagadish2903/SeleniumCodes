package SeleniumSessions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarouselHandlingConcepts {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.noon.com/uae-en/");
		 Thread.sleep(3000);
		 
		//scrolling the page down
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,600)");
		 Thread.sleep(2000);
		 
		
		//to get the Xpath of the list of WebElement displyaed (i.e Recommednded for you)
		 //we need to start our Xpath from Recommended for u and then to the list and get text
		 
		 
		String recommendXpath="//h3[text()='Recommended for you']//parent::div//following-sibling::div//div[@data-qa='product-name']/span";
		//the above xpath should work for all the carousal
		String nextXpath="//h3[text()='Recommended for you']//parent::div//following-sibling::div//div[contains(@class,'swiper-button-next')]";
		
	
		
		List<WebElement>productList=driver.findElements(By.xpath(recommendXpath));
		System.out.println(productList.size());
		
		//we dont know the number of products so use while loop and  click next
		
		Set<String>prodList=new HashSet<String>();//we can use List or set ...List will store duplicate value wereas Set will not store duplicate value 
		//and we can also use TreeSet instead of Hashset to sort in the alphabetical order  
		while(!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("swiper-button-disabled")){
			//logic to next button
			for(WebElement e:productList) {
				String text=e.getText();
				if(!text.isEmpty()) {
						prodList.add(text);
			}
			driver.findElement(By.xpath(nextXpath)).click();
			productList=driver.findElements(By.xpath(recommendXpath));
		}
		//to traverse the productlist
			for(String e:prodList) {
				System.out.println(e);
			}
			 
	}
	}}

