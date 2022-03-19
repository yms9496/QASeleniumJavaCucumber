package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage {
    
	// driver object
	WebDriver driver;
    
	//constructor of the page
	public HomePage(WebDriver driver) {
	    
		// assign driver
		this.driver = driver;
		//initialize the web elements
		PageFactory.initElements(driver, this);
	}
	
	//locate home page image
	@FindBy(xpath = "//img[@src = '/images/Toolsqa.jpg']") 
	private WebElement HomePage;
	
	//locate book store application
	@FindBy(xpath = "//div[@class = 'card-body']//h5[text() = 'Book Store Application']") 
	private WebElement BookStoreApplication;
     
	//return home page element
	public WebElement getHomePage() {
		return HomePage;
	}
     
	//return bookstore application element
	public WebElement getBookStoreApplication() {
		return BookStoreApplication;
	}
	
	//verify home page is loading or not
	public void verifyHomePage(){
		
		String homePageTitle = "";
		homePageTitle = driver.getTitle();
		
		Assert.assertEquals("ToolsQA",homePageTitle,"Home Page did not load correctly");
	}
	
	//click on bookstore application
	public void clickBookStore (){
		
		BookStoreApplication.click();
	}
	
	
}
