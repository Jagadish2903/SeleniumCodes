package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	 private WebDriver driver;
		
	 	public  ElementUtil(WebDriver driver){
		this.driver=driver;
	 	}
	 	
	
	 	public  WebElement getElement(By locator) {
	    	  return driver.findElement(locator);
	    }
	 	
	 	public List<WebElement> getElements(By locator){
	 		return driver.findElements(locator);
	 	}
	       
	    public void doSendKeys(By locator,String value) {
	     	   getElement(locator).sendKeys(value);
	    }    
	       
	    public void doClick(By locator) {
	    	getElement(locator).click();
	    }
	    public String getText(By locator) {
	    	return getElement(locator).getText();
	    }
	    
	    public boolean doIsDisplayed(By locator) {
	    	return getElement(locator).isDisplayed();
	    }
	    
	    public boolean doISEnabled(By locator) {
	    	return getElement(locator).isEnabled();
	    }
	    
	    public boolean doIsSelected(By locator) {
	    	return getElement(locator).isSelected();
	    }
	    
	    public String dogetAttributeValue(By locator,String attributename) {
	    	return getElement(locator).getAttribute(attributename);
	    }
	    
	    
	    public void doLinkClick(By locator,String linkvalue ) {
			List<WebElement> linkslist=driver.findElements(locator);
			
			for(WebElement e:linkslist) {
				String langtext=e.getText();
				System.out.println(linkslist);
				
				if(langtext.trim().equals(linkvalue)) {
					e.click();
					break;
		}
		}
	    }
			
			
	    public boolean checkElementDisplayed(By locator,int eleOccurance) {
				 if(getElements(locator).size()==eleOccurance) 
					 return true;
				 return false;
			 }
	    
	    
	    /*********************************dropdown Utility*****************************/
	    
	    public  void doSelectByIndex(By locator,int index) {
			Select select=new Select(getElement(locator));
			select.selectByIndex(index);
			
		}
		
		public  boolean doSelectByValue(By locator,String value) {
			Select select=new Select(getElement(locator));
			select.selectByValue(value);
			return isDropDownValueSelected(select, value);
		}

		 public boolean doSelectByVisibleText(By locator,String Text) {
				Select select=new Select(getElement(locator));
				select.selectByVisibleText(Text);
				return isDropDownValueSelected(select, Text);
			}
		 
		 public boolean isDropDownValueSelected(Select select,String expValue) {
			 if(select.getFirstSelectedOption().getText().contains(expValue)) {
				 return true;
			 }return false;
		 }
		
		public  void doSelectDropDown(By locator,String value) {
			Select select=new Select(getElement(locator));
			List<WebElement> optionslist=select.getOptions();
			iterateDropdownSelect(optionslist,value);
		}
		
		public  void selectDropdownWithoutSelect(By locator,String value) {
			List<WebElement> optionslist=getElements(locator);
			iterateDropdownSelect(optionslist,value);
				
		}
		
		private void iterateDropdownSelect(List<WebElement>optionslist,String value) {
				for(WebElement e:optionslist) {
					String text=e.getText();
					System.out.println(text);
						if(text.equals(value)) {
							e.click();
							break;
						}
				}
		}
		
	    


			public void googleSearchSelect(By search,By suggestion,String searchKey,String value) throws InterruptedException {
			getElement(search).sendKeys(searchKey);
			Thread.sleep(2000);
			List<WebElement> suggestionlist=getElements(suggestion);
			
			for(WebElement e:suggestionlist) {
				String text=e.getText().trim();
				System.out.println(text);
				  if(text.equals(value))	{
					  e.click();
					  break;
				  }
			}
			}
		}
