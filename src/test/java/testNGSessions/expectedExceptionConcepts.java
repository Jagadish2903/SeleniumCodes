package testNGSessions;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class expectedExceptionConcepts {

//we can define expectedexception at the @Testlevel as well this will make the Test to pass even the exception is raised 
	//eg.
	//in this 1st one will throw Arithmetic exception but when we use above concept it will throw as pass
	//we can also write Exceoption.class as well since it is the parent of the Arithmetic exception
	//N:B if we write Null pointer exception it will fail since it throws Arithmetic exception
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void homepageHeaderTest() {
		System.out.println("HomePageHeader Test");
		int i=9/0;
	}
	
	@Test(expectedExceptions = Exception.class)
	public void homepageTitleTest() {
		System.out.println("homepageTitle Test");
		int i=9/0;
	}
	
	
	@Test
	public void searchTest() {
		System.out.println("SearchTest Test");
	}
	
	
	
	
	
	
}
