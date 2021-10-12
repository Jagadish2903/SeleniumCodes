package Assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Suggestionlistcapture {
		
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil browser=new BrowserUtil();
		WebDriver driver=browser.initDriver("chrome");
		browser.launchUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
		By searchbox=By.id("search_query_top");
		By optionslist=By.xpath("//div//li[@class='ac_even']");
		By visible=By.xpath("//h1[@itemprop='name']");
		
		ElementUtil ele=new ElementUtil(driver);
		ele.doSendKeys(searchbox, "dresses");
		Thread.sleep(10000);
		ele.selectDropdownWithoutSelect(optionslist, "Casual Dresses > Printed Dress");
	    String text=ele.getText(visible);
	    
	   if(text.equals("Printed Dress")) {
		   System.out.println("Element is present");
	   }else
	   {
		   System.out.println("Wrong path");
	   }
	    
		
		
		
	
		

	}

}
