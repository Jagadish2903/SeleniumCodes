package testNGSessions;

import org.testng.annotations.Test;

public class priorityConcepts {
   //Test execution will be done based on the priority we set ...Its a integer so we can set any number even -100
	//eg.
	
	//we can write only test without using @method also
	
	//in the below case Testcase Execution will be done based on Priority we set ...i.e C B A
	//if priority is not set execution will be as abc as per alphabetical order 
	//priority can be 0 also 
	//when we leave a test without priority it will be treated as 0 as well
	//if both are 0 given as priority it goes with alphabetical order 
	
	
	
	@Test(priority=1)
	public void aTest() {
		System.out.println("A Test");
	}
	
	@Test
	public void bTest() {
		System.out.println("B Test");
	}
	
	@Test(priority=-1)
	public void cTest() {
		System.out.println("C Test");
	}
	
}
