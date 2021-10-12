package testNGSessions;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testEnableandDisableConcept {

	//this is used to tell what needs to be executed 
	//i.e if there are 100 testcases and only 5 needs to be executed we can use enabled =true/false ..if false this one will be skipped for execution but wont show in skip count 
	//we no need to write the enabled =true since automatically it will participate for execution
	//we can write description also with enabled ....but it will display only when we use true ...since false wont be participated
	//we can write @ignore also to skip the participation like third one 
	
	
	
	
	
	
	@Test
	public void homepageHeaderTest() {
		System.out.println("HomePageHeader Test");
	}
	
	@Test(enabled=false,description = "hi this is danger")
	public void homepageTitleTest() {
		System.out.println("homepageTitle Test");
	}
	
	@Ignore
	@Test
	public void searchTest() {
		System.out.println("SearchTest Test");
	}
	
}
