package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.BookDetailsPage;
import pageObjects.BookStorePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import pageObjects.RegisterPage;

public class PageObjectManager {

	private WebDriver driver;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	
	HomePage homePage;// = new HomePage(driver);
	LoginPage loginPage;// = new LoginPage(driver);
	ProfilePage profilePage;// = new ProfilePage(driver);
	RegisterPage registerPage;// = new RegisterPage(driver);
	BookStorePage bookStorePage;// = new BookStorePage(driver);
	BookDetailsPage bookDetailsPage;//= new BookDetailsPage(driver);
	
	public HomePage getHomepage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
	
	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}
	
	public ProfilePage getProfilePage() {
		
		return (profilePage == null) ? profilePage = new ProfilePage(driver) : profilePage;
	}
	
	public RegisterPage getRegisterPage() {

		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;
	}
	
	public BookStorePage getBookStorePage() {

		return (bookStorePage == null) ? bookStorePage = new BookStorePage(driver) : bookStorePage;
	}
	
	public BookDetailsPage getBookDetailsPage() {

		return (bookDetailsPage == null) ? bookDetailsPage = new BookDetailsPage(driver) : bookDetailsPage;
}
	
	
}
