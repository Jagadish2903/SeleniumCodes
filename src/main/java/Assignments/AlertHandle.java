package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandle {

	public static void main(String[] args) {
		BrowserUtil brw=new BrowserUtil();
		WebDriver driver=brw.initDriver("chrome");
		
		brw.launchUrl("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//To handle JS Alert
		By JSAlert=By.xpath("//button[text()='Click for JS Alert']");
		
		By JSConfirm=By.xpath("//button[text()='Click for JS Confirm']");
		
		By JSPrompt=By.xpath("//button[text()='Click for JS Prompt']");
		
		ElementUtil ele=new ElementUtil(driver);
		ele.doClick(JSAlert);
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.dismiss();
		
		
		//to switch back driver to the webpage 
		driver.switchTo().defaultContent();
		
		//To Handle JS Confirm Alert
		ele.doClick(JSConfirm);
		driver.switchTo().alert();
		String text2=alert.getText();
		System.out.println(text2);
		alert.dismiss();
		
		//to switch back driver to the webpage 
		driver.switchTo().defaultContent();
		
		//To Handle JS Prompt Alert
				ele.doClick(JSPrompt);
				driver.switchTo().alert();
				String text3=alert.getText();
				System.out.println(text3);
				alert.sendKeys("Hi what is your name"+":"+text3);
				alert.dismiss();
				
		
		
		
		
		
		
		
		

	}

}
