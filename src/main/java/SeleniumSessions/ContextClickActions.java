package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickActions {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

//			WebElement rightClickMe=driver.findElement(By.xpath("//span[text()='right click me']"));
//			
//			Actions act=new Actions(driver);
		// to perform contextclick
//			act.contextClick(rightClickMe).build().perform();
//			
//			List<WebElement>itemsList=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li//span"));
//			
		By rightclick = By.xpath("//span[text()='right click me']");

		By items = By.xpath("//ul[@class='context-menu-list context-menu-root']/li//span");

		// to check element is present using utility
		List<String> actualList = getrightClickChecklist(rightclick, items);
		if (actualList.contains("Cut")) {
			System.out.println("Cut is present");
		} else {
			System.out.println("Its not present");
		}

		// to validate the count

		if (getRightClickItemsCount(rightclick, items) == 6) {
			System.out.println("Count is correct");
		}

		// to click on the particular option in context menu

		rightclickItem(rightclick, items, "Copy");
	}

	// Creating a general utility

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getRightClickItemsCount(By rightclick, By items) {
		return getrightClickChecklist(rightclick, items).size();
	}

	public static void rightclickItem(By rightclick, By items, String value) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightclick)).build().perform();
		List<WebElement> menuList = getElements(items);
		for (WebElement e : menuList) {
			String text = e.getText();
			if (text.equalsIgnoreCase(value)) {
				e.click();
				break;
			}
		}
	}

	public static List<String> getrightClickChecklist(By rightclick, By items) {
		List<String> itemsValuelist = new ArrayList<String>();
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightclick)).build().perform();
		List<WebElement> menuList = getElements(items);

		for (WebElement e : menuList) {
			String text = e.getText();
			System.out.println(text);
			itemsValuelist.add(text);
		}
		return itemsValuelist;
	}

}
