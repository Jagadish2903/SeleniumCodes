package SeleniumSessions;

public class CssSelector {

	public static void main(String[] args) {

		//Css Selector is not an attribute,its a locator
		
		//if id is available 
		//#idvalue
		
		//ifclass is available
		//.classvalue
		
		//to use both id and class 
		//#idvalue.classvalue
		//.classvalue#idvalue
		
		//multiple class is available(separated by spaces)
		//.classvalue1.classvalue2.classvalue3
		
		//to use both id and class 
		//#idvalue.classvalue1.classvalue2.classvalue3
		//.classvalue1.classvalue2.classvalue3#idvalue
		
		//if we dont have id or class we need to use as below 
		
		//						htmltag[attr='value']
				// no @ or // should be used 
				//eg .   input[value='login']		---css
				//		//input[@value='login']		--xpath
		
		//to use multiple properties in xpath we use and keyword and in css no need to use any keyword
		
		//					htmltag[attr1='value1'][attr2='Value2']
		//eg.				input[value='login'][type='submit'] ----css
		//					//input[@value='login' and @type='submit'] ---xpath
		
		
		//to use contains functions (* is used as contains in css)
		
		//					htmltag[attr*='value']
		//eg.				input[id*='email'] ---css
		//					//htmltag[contains(@attribute,'value'] ---xPath
		
		
		//to Use Starts with (^ is used as Starts with in css)
		//					htmltag[attr^='value']
		//eg.				input[id^='email'] ---css
		//					//htmltag[starts-with(@attribute,'value'] ---xPath
		
		
		//to Use ends with ($ is used as Starts with in css)
				//					htmltag[attr$='value']
				//eg.				input[id$='email'] ---css
				//					no ends with in xpath after selenium 4
		
		
		//Parent to Child Concepts 
		
		//in Css
		
		//space between parent and child (direct+indirect)
		//> between parent and child(direct child)
		
		// eg.   div.private-form > input   (direct)
		//eg.	div.private-form input (direct+indirect)
		
		
		//in Xpath
		
		//1.Parent to direct child 
		//To go the immediate child from parent use							/
		//eg. //div[@class='form_group']/input[@name='email']
		
		//2.Parent to indirect + direct child
				//we need to use  													//
				//eg. //div[@class='form_group']//input[@name='email']

		
		
		//Child to Parent Concepts 
		
		//not allowed in CSS
		//Allowed in xPath  input[@name='email']/parent::div
		
					
		//Comma feature in CSS 
		//we can use multiple properties 
		//eg          input#login,input#password,input#submit
		//here # is used for id and , is used for separated ...
		//here we can get all the elements in a single value using , feature --- login/passwrd/submit
		
		//Comma feature in Xpath
		//Not available 
		
		
		//Siblings Concepts
		//following is allowed in CSS    by using +
		//eg.label[form='name-email']+input
		
		
		//Preceding is not allowed in CSS
		
		
		
		//indexing in CSS
		//    	ul.footer-nav li:nth-of-type(4) a
		
	//here :nth-of-type(n) is used as indexing
		
		
		
		
		
		//  		 				Xpath vs    CSS
		//1Syntax.				Complex			simple
		//2functions.			better			limited
		//3.backward traversing	possible		NA
		//4.Performance			good			good 
		//5.Webtable			better 			limited 
		//6.dynamic attr		good			good
		//7.element text		available 		NA
			//(to check header)
		//8.diff tags			NA				Comma Feature
				
				
		
		

	}

}
