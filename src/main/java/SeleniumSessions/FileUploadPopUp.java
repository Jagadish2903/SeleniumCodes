package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

		static WebDriver driver;
			
			public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/upload");

			//to upload file ....it is mandatory to have type as a file in HTML DOM
			
			
			//to upload the file we need to pass sendkeys instead of click in the choosefile element
			driver.findElement(By.id("file-upload")).sendKeys("F:\\97114.PNG");
			
			
			//Third Party applications used for file upload but not recommended due to some limitations
			
			//autoit//wont work in docker/linux 
			//sikuli
			//robot
			
			
			
			
			
			

}
}
