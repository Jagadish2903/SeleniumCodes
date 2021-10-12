package Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		Thread.sleep(3000);
		
		
		String xPathgraph="//*[name()='svg']//*[name()='g']//*[name()='rect' and @class='highcharts-point']";
		String tooltip="//*[name()='svg']//*[name()='g' and contains(@class,'highcharts-tooltip')]";
		List<WebElement>charts=driver.findElements(By.xpath(xPathgraph));
		for(WebElement e:charts) {
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(xPathgraph))).build().perform();
			Thread.sleep(2000);
			String text=driver.findElement(By.xpath(tooltip)).getText();
			System.out.println(text);
		}
	}

}
