package testNGSessions;

import org.testng.annotations.Test;

public class dependsOnMethodsConcepts {
		//dependsonMethods is keyword available in testNG
		//It is something like a priority one where we can use to set the depenedency on other test
		//if we set dependency in second execution pointing to 1st test when the first test fails 2 nd test wont execute it will skip for execution
		
	
	//eg.
		//we have kept depends on method in second test so if first test pass it will execute second test if not it will skip the second
	
	
	@Test
	public void loginPageTest() {
		System.out.println("loginTest");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginPageTest")
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	
	@Test
	public void searchboxTest() {
		System.out.println("searchboxTest");
	}
	
	//in the above case 1st test gets failed and 2 is dependency on 1 so since 1st failed it will skip 2nd and 3 executes as passed 
	//incase when we write both searchboxtest and homepagetest are kept as dependency ...it wont execute 2 if 1st failed and if 1st passed it will then execute 2 and 3 
	
	
	
	//But Testcases should not be dependent to each other so not recommended 
	//i.e it should be independent to each other 
	//dependency makes testcases complex
	
	//eg.
	
	//Always follow --CRUD ---create //Update//Delete concepts
	
	
	//utilities
	public void userCreate(String name,int age) {
		System.out.println(name +" " +age);
	}
	
	public void updateCreateUser(String name,int age) {
		System.out.println(name +" " +age);
	}
	
	public void userDelete(String name,int age) {
		System.out.println(name +" " +age);
	}
	
	
	@Test
	public void createUserTest() {
	userCreate("Tom", 25);
	}
	

	@Test
	public void UpdateUserTest() {
	userCreate("Tom", 25);
	updateCreateUser("sambath", 20);
	}
	
	@Test
	public void deleteUserTest() {
		userCreate("jaggu", 20);
		userDelete("jaggu", 20);
	}
	
	
	//the above case is always the best practice to write the testcase as independent we used @testUpdate using both create and then update instead of keeping dependency
	
	//this is because incase if we have 200 testcaes and  if we keep dependency and if one failed it will not execute other so its better to keep always independent
	
	
	
	
	
}
