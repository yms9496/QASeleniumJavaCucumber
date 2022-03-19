package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// driver object
	WebDriver driver;

	// constructor withh initialization of page elements
	public LoginPage(WebDriver driver) {
	   
		// initialize driver
		this.driver = driver;
		
		// initialize web elements 
		PageFactory.initElements(driver, this);
	}
	
	
	//////////////////////////////////////// WebElement Locators /////////////////////////////////////

	// login page
	@FindBy(xpath = "//div[@class='main-header' and normalize-space() = 'Login']") 
	private WebElement LoginPage;
	
	// user name field
	@FindBys({@FindBy(id="userName"),@FindBy(tagName="input")}) 
	private WebElement UserName;
	
	// password field
	@FindBys({@FindBy(id="password"),@FindBy(tagName="input")}) 
	private WebElement Password;
	
	// login button
	@FindBys({@FindBy(id="login"),@FindBy(tagName="button")}) 
	private WebElement LoginButton;

	// new user button
	@FindBys({@FindBy(id="newUser"),@FindBy(tagName="button")}) 
	private WebElement NewUserButton;
	
	
	/**
	 * @return the loginPage
	 */
	public WebElement getLoginPage() {
		return LoginPage;
	}

	
	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return UserName;
	}

	
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return Password;
	}

	
	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return LoginButton;
	}

	
	/**
	 * @return the newUserButton
	 */
	public WebElement getNewUserButton() {
		return NewUserButton;
	}

////////////////////////////////// Reusable Page Methods /////////////////////////////////////////////


	// method to login with given username and password
	public void loginWithCredentials(String username, String password) {
		
		UserName.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
	}
	
	// method to click on new user button
	public void clickNewUserButton() {
		
		NewUserButton.click();
	}

}
