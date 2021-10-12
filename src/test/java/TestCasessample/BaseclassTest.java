package TestCasessample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassTest {

	// here Amazon/Freshworks/google have duplicate code so that can be written in
	// BaseClass and to use these methods we can inherit these
	// properties to the child by using Extends
	// BaseClass is a Parent
	//we can pass the parameter in TestNG.xml file and value (<parameter name ="url"  value="https://www.amazon.in/" />)
	//to use the parameter defined in xml file we need to use @Parameter in the Base class and pass the parameter 
	//these parameters are called Environmental params 
	//we can use multiple parameters as well 
	//incase if we want to execute cross browser testing or parallel testing we can use multiple params
	//if we want to run the testcases parallelley we need to write thread-count="3" and parallel="tests" in suite level( refer .xml )this will run the testcases parallel 
	//1 thread will run for chrome 1 for firefox and 1 for edge ..by thread count and parallel we can achieve parallel execution
	//if thread count or parallel is not mentioned it will execute sequential mode
	//thread count also should not e always equal to testblock in .xml file cox incase if i have 100 testcases and have threadcount=100 its not recommended 
	//cox it will consume more memory utilisation(max it is best to give thread count of 5)
	//incase if thread count=2 parallel execution can be donw for first twoblocks as 1st thread count and 3rd testblock in 2nd thread
	//decission of thread to be handled will be done by testNG internally
	//we can create multiple .xml file and run accordingly to achieve cross browser  (Eg.TestNG crossbrowser) but testname should be different
	
	
	

  WebDriver driver;
  
  	@Parameters({"url" ,"browser"})
	@BeforeMethod
	public void setUp(String url, String browser) {
  		
  		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();			
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("please pass the right browser name");
			break;
		}
  		
  		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);

	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
