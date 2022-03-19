package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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


	// method to verify login page load
	public void verifyLoginPageLoad() {
		
		Assert.assertTrue(LoginPage.isDisplayed(), "Login Page did not load");
	}
	
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
	
	// method to click on login button
		public void clickLoginrButton() {
			
			LoginButton.click();
		}

	// method to send user name
	public void enterUserName(String username) {
		
		UserName.sendKeys(username);
	}
	
	// method to send password
	public void enterPassword(String password) {
		
		Password.sendKeys(password);
	}
	
	// method to verify user name is highlighted in red as mandatory field - invoke after clicking login without entering 
	public void verifyUsernameMandatoryIndication() {
		
		// get class attribute from page
		String classAttribute = UserName.getAttribute("class");
		
		// verify tht it is highlighted as mandatry
		Assert.assertTrue(classAttribute.contains("is-invalid"), "Username not highlighted in red as mandatory");
	}
	
	// method to verify password is highlighted in red as mandatory field - invoke after clicking login without entering 
	public void verifyPasswordMandatoryIndication() {
		
		// get class attribute from page
		String classAttribute = Password.getAttribute("class");
		
		// verify tht it is highlighted as mandatry
		Assert.assertTrue(classAttribute.contains("is-invalid"), "Password not highlighted in red as mandatory");
	}
}
