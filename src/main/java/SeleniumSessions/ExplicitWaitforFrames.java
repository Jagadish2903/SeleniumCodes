package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitforFrames {

	static WebDriver driver;
	//explicit waits are used for non-webelements as well(Title/URL/Alerts)
		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame("main");
		//since we use explicit wait no need of witch too 
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		String text=driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		
		System.out.println(text);
		driver.switchTo().defaultContent();	
		
	}
	
	public static void waitForFramesusingNameorID(String FrameIDorName,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIDorName));
	}
	
	public static void waitForFramesusingframeByLocator(By frameLocator,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public static void waitForFramesusingframeIndex(int frameIndex,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitForFramesusingElementLocator(String frameElement,int Timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
		

}
