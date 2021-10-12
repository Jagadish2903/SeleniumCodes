package SeleniumSessions;

public class WaitsConcepts {

	public static void main(String[] args) {
		//What is a wait -->Wait is the synchronisation between Script and the application
		//Wait can be done for 1.WebElements
						//		2.Non-WebElements(Alerts/Pop-ups/Title/Url)
		//2 Types of Wait 
				//1.Static Wait --->Thread.sleep(5000)
				//2.Dynamic wait---->Implicit and Explicit wait
							//Explicit wait is divided into //Webdriver wait and //fluent waits
		
		//Thread.sleep is a Java wait 
		//Implicit and explicit is a Selenium waits
		
		//--->in Api documentation there is a hierarchy for waits 
		//wait(interface) has a method Until() withut method body--->Fluent wait(class)---->Webdriver wait(Class) untill method will be inherited 
		
		

	}

}
