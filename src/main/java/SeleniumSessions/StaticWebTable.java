package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		 //here in HTML Dom TR is row 
		 //td is Table data 
		 //creating a common xpath
		 
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[5]/td[1]
		//table[@id="customers"]/tbody/tr[6]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1] here tr 7 is the row no its same xpath except the value tr 
		 
		 String beforexpath="//table[@id=\"customers\"]/tbody/tr[";
		 String afterxpath="]/td[1]";
		 
		 //to get the row count 
//		int rowcount= driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
//		 
//		 for(int row=2;row<=rowcount;row++) {
//			 String comxPath=beforexpath+row+afterxpath;
//			 String value=driver.findElement(By.xpath(comxPath)).getText();
//			 System.out.println(value);
//		 }
		 
		 
		 //to get the detail from the second column
		 gettabledata(3);
		 
		 
	}
	
	
	//creating a general utility
	public static void gettabledata(int Columnnumber) {
		
		 String beforexpath="//table[@id=\"customers\"]/tbody/tr[";
		 String afterxpath="]/td["+Columnnumber+"]";
		int rowcount= driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		 
		 for(int row=2;row<=rowcount;row++) {
			 String comxPath=beforexpath+row+afterxpath;
			 String value=driver.findElement(By.xpath(comxPath)).getText();
			 System.out.println(value);
		 }
	}

}
