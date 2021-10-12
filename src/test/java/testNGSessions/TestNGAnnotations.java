package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
    //in manual testing we used to design the  testcases in the certain formate
	//same like in TestNg we can use 
	
	//Global PreCondition   ---in TestNG    @Before
	//Pre-Condition  ---in TestNG    @Before
	//test-Steps   ----in TestNG   @Test
	//Actual vs Expected ----Assertions
	
	//Post step   ---in TestNG  @After
	
	//Status ---Pass/Fail
	
	
	//Annotations are something which starts with @ and shuld be associated with some method
	//Testcases should be writted with @Test
	//Preconditions should always be used only once(BeforeSuite/BeforeTest/BeforeClass)...we can use but not recommended 
	//@Test can be used n number
	//whereever we write the suite or class TestNG Maints the below TestExecution Structure 
	//its not compulsory to write precondition or Poststep 
	
	
	//Assertions are used to verify actual vs expected results
	//do not write multiple assertions in the same method 
	
	
//Structure
	
	//@BeforeSuite
	//@BeforeTest
	//@BeforeClass
	//@BeforeMethod
	
	
	// @Test1
	//@Test2
	
	//@AfterMethod
	//@AfterClass
	//@AfterTest
	//@AfterSuite
	

	
	
	//eg.
	
	
	@BeforeSuite
	public void ConnectwithDB() {
		System.out.println("Bs------ConnectwithDB");
	}
	
	
	@BeforeTest
	public void CreateUser() {
		System.out.println("BT------CreateUser");
	}
	
	@BeforeClass
	public void Launchbrowser() {
		System.out.println("BC------Launchbrowser");
	}
	
	@BeforeMethod
	public void LogintoApp() {
		System.out.println("BM------LogintoApp");
	}
	
	@Test
	public void homepageHeaderTest() {
		System.out.println("HomePageHeader Test");
	}
	
	@Test
	public void homepageTitleTest() {
		System.out.println("homepageTitle Test");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("SearchTest Test");
	}
	
	@AfterMethod
	public void LogoutApp() {
		System.out.println("AM------LogoutApp");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("AC------CloseBrowser");
	}
	
	@AfterTest
	public void DeleteUser() {
		System.out.println("AT------DeleteUser");
	}
	
	@AfterSuite
	public void DisconnectDB() {
		System.out.println("As------DisconnectDB");
	}
	
	//when we execute as a TestNG the output will be as below
	
//				Bs------ConnectwithDB
//				BT------CreateUser
//				BC------Launchbrowser
	
//				BM------LogintoApp
//				SearchTest Test
//				AM------LogoutApp
	
//				BM------LogintoApp
//				HomePageHeader Test
//				AM------LogoutApp
	
//				BM------LogintoApp
//				homepageTitle Test
//				AM------LogoutApp
	
//				AC------CloseBrowser
//				AT------DeleteUser
//				As------DisconnectDB
	
	
	//so the sequence is before and after method will create a pair with test 
	
	
}
