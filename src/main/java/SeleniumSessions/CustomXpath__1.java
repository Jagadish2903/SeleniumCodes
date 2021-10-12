package SeleniumSessions;

public class CustomXpath__1 {

	public static void main(String[] args) {
		
		//What is a Xpath?
				//Xpath is the address of the element/it is a locator not the attribute
				//types of xpath
					//1.relative :/html/body/div[2]/div[1]/ul/li/li[2]/a
					//2.absolute (Custom xpath):
		
		//Conditions: Always the 1/1 element should be used in Xpath
		
		//Advantages of Xpath
				//gives the exact location of webelement
				//improves the coding nature 
				//complex address of webelement can be covered 
				
		
		
		
		
		//formula for absolute xpath
		//1.	//html tag[@attribute='value']
		//2.	//html tag[@attribute1='value' and @attribute2='value']
		//3.	//html tag[@attribute1='value' and @attribute2='value' and @attribute3='value' ]
		//4.	//html tag[@attribute1='value' and @attribute2='value' and @attribute3] //but not recommended
		//5.	//html tag[@attribute1='value' and @attribute2 and @attribute3]//but not recommended
		//6.	//html tag[@attribute1 and @attribute2 and @attribute3]//but not recommended
		//7.	//*[@attribute='value']  (here * is search all the elements interms of performance it is not recommended
		
		//8.	(//html tag[@attribute='value'])[1]   ---this is called capture group and it uses index value(position)
		//9.	(//html tag[@attribute='value'])[position()=1]
		
		//to find the Xpath for all the input field we can use Capture group method eg.if all the 6 inputs text field has common class name 
		
		
		
		//10.	(//html tag[@attribute='value'])[6] 
		
		//since 6 is hotcoded we can write it as 
		
		//11.   (//html tag[@attribute='value'])[last()]
		//12.	(//html tag[@attribute='value'])[last()-1] ---to give the path of 5th element
		
		//Starts with and Ends with concepts
		
		//13.	//html[starts-with(@attribute,'input')]  --this will give the address of webelement were it starts with input and is very useful in dynamic attribute
				//eg. test-123
				//test-456
				//test-658
		
		// here in this case we can use starts with since it is dynamic in nature 
		
		
		//Contains(): Its a inbuild function in xpath ..
		//used for dynamic values--dynamic attributes...
		
		
		//14	//htmltag[contains(@attribute,'value']
		
		//we can use the above case for dynamic attributes 
		
		//15	//htmltag[contains(@attribute1,'value') and @attribute2='value']
		
		//16 	//htmltag[contains(@attribute1,'value') and @attribute2='value' and contains(@attribute3,'value')]
		
		//17  	//htmltag[contains(@attribute1,'value') and contains(@attribute3,'value')]
		
		
		//text(): used for links/labels/div/span/header etc
			//should not be used as a attribute
		
		//18	//htmltag[text()='value']
		
		
		//Contains() with text()
		
		//19	//html tag[contains(text(),'value')]
		
		
		//Contains() with text() and attribute
		//used for links 
		
		//20	//html tag[contains(text(),'value') and @attribute='value']
		
		//ends with is removed in selenium 4 so avoid ends with function
		
		//difference bet By.classname and By.xpath using class as a attribute
				//By.classname will consider always  one classname (eg.jaggu_123......)
				//By.xpath will consider all the classes together (eg.jaggu  lav   123)(3 class name can be used as a single address of element)
		
		
		
		//PARENT-CHILD Concepts
		
		//1.Parent to direct child 
		//To go the immediate child from parent use							/
		//eg. //div[@class='form_group']/input[@name='email']
		//we can write it as //div[@class='form_group']/child::input[@name='email']
		//here //div[@class='form_group'] is a parent and /input[@name='email'] is a child 
		
		
		//2.Parent to indirect + direct child
		//we need to use  													//
		//eg. //div[@class='form_group']//input[@name='email']
		//we can write it as //div[@class='form_group']//child::input[@name='email']
		//here //div[@class='form_group'] is a parent and //input[@name='email'] is a child 
		
		//3.Child to immediate Parent
		//To go to the immediate parent from child  use						/..
		//eg.input[@name='email']/..   this will go to the div(immediate parent)
		//we can also write it as input[@name='email']/parent::div
		
		// there is no concept of indirect parent always it will goto the direct parent
		
		//4.Child to grand parents
		//to go to all the grandparent tags we use 							//ancestor::
		//eg.input[@name='email']//ancestor::div	
		//this will go to the all the grant parents with div tags
		
		//5.preceding-sibling
		//to go to the preceding sibling(above one) we use					/preceding-sibling::
		//eg.input[@name='email']/preceding-sibling::label
		//this will go to the preceding sibling of input 
		
		//6.following -sibling
		//to go to the following sibling(below one) we use					/following-sibling::
		//eg.//label[@for='name-email']/following-sibling::input
		//this will go to the following sibling of label
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
