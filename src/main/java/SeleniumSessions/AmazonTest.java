package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
	   
		BrowserUtility obj =new BrowserUtility();
		
		obj.initDriver("chrome");//when we scroll over initdriver we will be getting the documentation we have written 
		obj.launchUrl("http:\\\\www.amazon.com");
		String title=obj.getTitle();
		System.out.println("The Title of the page is "+":"+title);
		String url=obj.getUrl();
		System.out.println("The Current URL is "+":"+ url);
		obj.closeBrowser();
		
		

	}

}
