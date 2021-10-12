package testNGSessions;

import org.testng.annotations.Test;

public class invocationCountConcepts {

	//invocation count is used to run the same testcase n num of times 
	//when we keep the count it executes the same test 
	//invocation is nothing but execution
	//mostly we wont use this 
	
	//eg.
	
	@Test(invocationCount = 5)
	public void loginTest() {
		System.out.println("loginTest");
	}
	
	
	
}
