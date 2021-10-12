package testNGSessions;

public class FrameworkArtchitechture {

	
//	
//	Framework Architechture:
//
//	    Hybrid Framework--->POM Design Pattern +libraries/Utilities+Data Driven Framework+Logs+SRP(Single responsible Principle)
//
//			1.is generic /No Hard Coded
//			2.has Utilities/libraries
//			3.maintenance of framework is easy
//			4.design is simple and easy to understand 
//			5.test logic should be different 
//			6.main source code logic should be different 
//			7.should support infrastructure
//
//
//	Tools/Technologies Used :
//			1.Selenium with Java language 
//			2.TestNG as a Unit Testing Framework
//			3.Data Drivern--->From Excel (Apachi POI) +Dependencies+Parameters
//			4.Log4j APT for logs
//			5.Extend/Allure reports for reports 
//			6.Maven as a Build Automation Tool---->Maven Life Cycle
//			7.WebDriverManager libraries
//
//	Infrastructure:
//			1.Git Repository as a version control system
//			2.Jenkins as a Continous Intergration tool
//			3.Docker 
//			4.Dockerized Selenium Grid for Cross Browser Testing 
//			5.AWS-Linux EC2 (to set selenium grid machine)
//			6.Zalenium 
//			7.Selenoid
//			8.NGROK Proxy (to execute the testcases and to trigger Jenkins)
//

	
	
	
	
	
	
	
	// Framework Structure
		///create a Maven Project as POM Series and delete the Junit dependencies and add the webDriver/Webdriver Manager/TestNg dependencies to pom.xml
		//after adding we can see the list of libraries in pom.xml
	
	//SRC Main java
		
		//Create a package ---com.qa.demoopencart.pages ---where list of classes on pages should be defined (Eg.LoginPage/AccountPage/SearchresultPage)
		//Create a Package ---com.qa.demoopencart.factory---where driver factory class should be initialised
		//Create a Package ---com.qa.demoopencart.Utils---where General Utility classes should be defined (Eg.ElementUtil.ExcelUtil..)
		//create a Package --com.qa.demoopencart.listerners --were we defined code for extend reports allure reports etc
	
	//SRC Test java
		//Create a package--com.qa.demoopencart.tests ----where test class for pages in com.qa.demoopencart.pages should be defined(eg.LoginPageTest/AccountsPageTest)
		//Create a package--com.qa.demoopencart.base---where basetest should be defined (Eg.BaseTest)
	
	//Create a source folder in project level as src/test/resources
		//create a folder as config and under that create a config.properties file where properties should be defined (Eg.Url/Browser/Headless)
		//cretae a folder for testrunner and under this testng.xml where parameters can be defned 
		//create a folder for testdata for test data 
	
		
	

	
	
	
	
	
	
	
	
}
