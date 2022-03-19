package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BookDetailsPage {

	WebDriver driver;

	public BookDetailsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//////////////////////////////////////// WebElement Locators/////////////////////////////////////

	// book details page
	@FindBy(id = "ISBN-label")
	private WebElement BookDetailsPage;

	// book isbn
	@FindBy(xpath = "//label[@id = 'ISBN-label']/parent::div/following-sibling::div/label")
	private WebElement BookISBN;

	// book title
	@FindBy(xpath = "//label[@id = 'title-label']/parent::div/following-sibling::div/label")
	private WebElement BookTitle;

	// book sub title
	@FindBy(xpath = "//label[@id = 'subtitle-label']/parent::div/following-sibling::div/label")
	private WebElement BookSubTitle;

	// book author
	@FindBy(xpath = "//label[@id = 'author-label']/parent::div/following-sibling::div/label")
	private WebElement BookAuthor;

	// book publisher
	@FindBy(xpath = "//label[@id = 'publisher-label']/parent::div/following-sibling::div/label")
	private WebElement BookPublisher;

	// book description
	@FindBy(xpath = "//label[@id = 'description-label']/parent::div/following-sibling::div/label")
	private WebElement BookDescription;

	// book web site
	@FindBy(xpath = "//label[@id = 'website-label']/parent::div/following-sibling::div/label")
	private WebElement BookWebsite;

	// book isbn label
	@FindBy(xpath = "//label[@id = 'ISBN-label']")
	private WebElement BookISBNLabel;

	// book title label
	@FindBy(xpath = "//label[@id = 'title-label']")
	private WebElement BookTitleLabel;

	// book sub title label
	@FindBy(xpath = "//label[@id = 'subtitle-label']")
	private WebElement BookSubTitleLabel;

	// book author label
	@FindBy(xpath = "//label[@id = 'author-label']")
	private WebElement BookAuthorLabel;

	// book publisher label
	@FindBy(xpath = "//label[@id = 'publisher-label']")
	private WebElement BookPublisherLabel;

	// book description label
	@FindBy(xpath = "//label[@id = 'description-label']")
	private WebElement BookDescriptionLabel;

	// book web site label
	@FindBy(xpath = "//label[@id = 'website-label']")
	private WebElement BookWebsiteLabel;

	// back to book store button
	@FindBy(xpath = "//button[normalize-space() = 'Back To Book Store']")
	private WebElement BackToBookStoreButton;

	// add to your collection button
	@FindBy(xpath = "//button[normalize-space() = 'Add To Your Collection']")
	private WebElement AddToyourCollectionButton;

	// login button
	@FindBys({ @FindBy(id = "login"), @FindBy(tagName = "button") })
	private WebElement LoginButton;

	// logout button
	@FindBys({ @FindBy(id = "submit"), @FindBy(tagName = "button") })
	private WebElement LogoutButton;

	// user name
	@FindBys({ @FindBy(id = "userName-value"), @FindBy(tagName = "label") })
	private WebElement UserName;

	/**
	 * @return the bookDetailsPage
	 */
	public WebElement getBookDetailsPage() {
		return BookDetailsPage;
	}

	/**
	 * @return the bookISBN
	 */
	public WebElement getBookISBN() {
		return BookISBN;
	}

	/**
	 * @return the bookTitle
	 */
	public WebElement getBookTitle() {
		return BookTitle;
	}

	/**
	 * @return the bookSubTitle
	 */
	public WebElement getBookSubTitle() {
		return BookSubTitle;
	}

	/**
	 * @return the bookAuthor
	 */
	public WebElement getBookAuthor() {
		return BookAuthor;
	}

	/**
	 * @return the bookPublisher
	 */
	public WebElement getBookPublisher() {
		return BookPublisher;
	}

	/**
	 * @return the bookDescription
	 */
	public WebElement getBookDescription() {
		return BookDescription;
	}

	/**
	 * @return the bookWebsite
	 */
	public WebElement getBookWebsite() {
		return BookWebsite;
	}

	/**
	 * @return the bookISBNLabel
	 */
	public WebElement getBookISBNLabel() {
		return BookISBNLabel;
	}

	/**
	 * @return the bookTitleLabel
	 */
	public WebElement getBookTitleLabel() {
		return BookTitleLabel;
	}

	/**
	 * @return the bookSubTitleLabel
	 */
	public WebElement getBookSubTitleLabel() {
		return BookSubTitleLabel;
	}

	/**
	 * @return the bookAuthorLabel
	 */
	public WebElement getBookAuthorLabel() {
		return BookAuthorLabel;
	}

	/**
	 * @return the bookPublisherLabel
	 */
	public WebElement getBookPublisherLabel() {
		return BookPublisherLabel;
	}

	/**
	 * @return the bookDescriptionLabel
	 */
	public WebElement getBookDescriptionLabel() {
		return BookDescriptionLabel;
	}

	/**
	 * @return the bookWebsiteLabel
	 */
	public WebElement getBookWebsiteLabel() {
		return BookWebsiteLabel;
	}

	/**
	 * @return the backToBookStoreButton
	 */
	public WebElement getBackToBookStoreButton() {
		return BackToBookStoreButton;
	}

	/**
	 * @return the addToyourCollectionButton
	 */
	public WebElement getAddToyourCollectionButton() {
		return AddToyourCollectionButton;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return LoginButton;
	}

	/**
	 * @return the logoutButton
	 */
	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return UserName;
	}

	////////////////////////////////// Reusable Page Methods//////////////////////////////////

	// get the book Iisbn
	public String getBookISBNValue() {
		return BookISBN.getText();
	}

	// get the book title
	public String getBookTitleValue() {
		return BookTitle.getText();
	}

	// get the book sub title
	public String getBookSubTitleValue() {
		return BookSubTitle.getText();
	}

	// get the book author
	public String getBookAuthorValue() {
		return BookAuthor.getText();
	}

	// get the book publisher
	public String getBookPublisherValue() {
		return BookPublisher.getText();
	}

	// get the book description
	public String getBookDescriptionValue() {
		return BookDescription.getText();
	}

	// get the book website
	public String getBookWebsiteValue() {
		return BookWebsite.getText();
	}

	// method to click on login button
	public void clickOnLoginButton() {

		LoginButton.click();
	}

	// method to click on logout button
	public void clickOnLogoutButton() {

		LogoutButton.click();
	}

	// method to get username of logged in user
	public String getLoggedInUserName() {

		return UserName.getText();
	}

	// method to click on back to book store button
	public void clickOnBackToBookStoreButton() {

		BackToBookStoreButton.click();
	}

	// method to click on add to your collection button
	public void clickOnAddToyourCollectionButton() {

		AddToyourCollectionButton.click();
	}

}
