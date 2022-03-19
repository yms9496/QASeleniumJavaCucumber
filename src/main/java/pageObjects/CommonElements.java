package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements {

	// driver object
	WebDriver driver;

	// constructor with initialization of page elements
	public CommonElements(WebDriver driver) {

		// initialize driver
		this.driver = driver;
		
		// initialize web elements 
		PageFactory.initElements(driver, this);
	}
	
	//////////////////////////////////////// WebElement Locators /////////////////////////////////////

	//close advertise button
	@FindBy(xpath = "//*[@title = 'Ad.Plus Advertising']") 
	private WebElement CloseAdvertise;
	
	
	//book store menu button
	@FindBy(xpath = "//div[@class='header-text' and normalize-space() = 'Book Store Application']") 
	private WebElement BookStoreMenuButton;
}
