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
	
	
	//verify register loading or not 
	public void verifyRegisterPage(){
		
		String registerPageTitle ="";
		registerPageTitle = registerPage.getText();
		
		Assert.assertEquals("Register", registerPageTitle, "Register Page did not load successfully");
	}

}
