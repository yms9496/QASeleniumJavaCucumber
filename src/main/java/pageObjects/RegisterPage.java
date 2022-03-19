package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {

		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	// locating header of register page
	@FindBy(xpath = "//div[@class = 'main-header']") 
	private WebElement registerPage;
	
	// locating text on register form 
	@FindBy(xpath = "//div[@class='register-wrapper']//h4[text()='Register to Book Store']") 
	private WebElement registerFormText;
	
	//first name field
	@FindBys({@FindBy(id="firstname"),@FindBy(tagName="input")}) 
	private WebElement firstName;
	
	//last name field
	@FindBys({@FindBy(id="lastname"),@FindBy(tagName="input")}) 
	private WebElement lastName;
	
	//user name field
	@FindBys({@FindBy(id="userName"),@FindBy(tagName="input")}) 
	private WebElement userName;
	
	//password field
	@FindBys({@FindBy(id="password"),@FindBy(tagName="input")}) 
	private WebElement password;
	
	//locating register button
	@FindBys({@FindBy(id="register"),@FindBy(tagName="button")}) 
	private WebElement registerButton;
	
	//locating back to login button
	@FindBys({@FindBy(id="gotologin"),@FindBy(tagName="button")}) 
	private WebElement backToLoginButton;
	
	//locating captcha box
	@FindBy(xpath = "//div[@id='rc-anchor-cntainer']//div[@class='recaptcha-checkbox-border']") 
	private WebElement captchaCheckBox;
	
	
	/**
	 * @return the registerPage
	 */
	public WebElement getRegisterPage() {
		return registerPage;
	}


	/**
	 * @return the registerFormText
	 */
	public WebElement getRegisterFormText() {
		return registerFormText;
	}


	/**
	 * @return the firstName
	 */
	public WebElement getFirstName() {
		return firstName;
	}


	/**
	 * @return the lastName
	 */
	public WebElement getLastName() {
		return lastName;
	}


	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return userName;
	}


	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}


	/**
	 * @return the registerButton
	 */
	public WebElement getRegisterButton() {
		return registerButton;
	}


	/**
	 * @return the backToLoginButton
	 */
	public WebElement getBackToLoginButton() {
		return backToLoginButton;
	}


	/**
	 * @return the captchaCheckBox
	 */
	public WebElement getCaptchaCheckBox() {
		return captchaCheckBox;
	}


	//verify register loading or not 
	public void verifyRegisterPage(){
		
		String registerPageTitle ="";
		registerPageTitle = registerPage.getText();
		
		Assert.assertEquals("Register", registerPageTitle, "Register Page did not load successfully");
	}

}
