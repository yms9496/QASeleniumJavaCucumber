package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage {

	WebDriver driver;

	public ProfilePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//////////////////////////////////////// WebElement Locators
	//////////////////////////////////////// /////////////////////////////////////

	// locating Advertisement banner
	@FindBy(xpath = "//img[@title='Ad.Plus Advertising']")
	private WebElement AdClose;

	// locating text on profile page header
	@FindBy(xpath = "//div[@class='main-header']")
	private WebElement profilePage;

	// locating searchBox
	@FindBys({ @FindBy(id = "searchBox"), @FindBy(tagName = "input") })
	private WebElement searchBox;

	// locate user name value
	@FindBy(xpath = "//div[@id='books-wrapper']//label[@id='userName-value']]")
	private WebElement userName;

	// locate logout button
	@FindBy(xpath = "//div[@id='books-wrapper']//button[@id='submit']]")
	private WebElement logoutButton;

	// locate go to store button
	@FindBy(xpath = "//div[@class='text-left button']//button[@id='gotoStore']]")
	private WebElement goToStoreButton;

	// locate delete account button
	@FindBy(xpath = "//div[@class='text-center button']//button[@id='submit']]")
	private WebElement deleteAccountButton;

	// locate delete all books button
	@FindBy(xpath = "//div[@class='text-right button di']//button[@id='submit']]")
	private WebElement deleteAllBooksButton;

	// image table header
	@FindBy(xpath = "//div[@class='rt-resizable-header-content' and normalize-space() = 'Image']")
	private WebElement ImageTableHeader;

	// title table header
	@FindBy(xpath = "//div[@class='rt-resizable-header-content' and normalize-space() = 'Title']")
	private WebElement TitleTableHeader;

	// author table header
	@FindBy(xpath = "//div[@class='rt-resizable-header-content' and normalize-space() = 'Author']")
	private WebElement AuthorTableHeader;

	// publisher table header
	@FindBy(xpath = "//div[@class='rt-resizable-header-content' and normalize-space() = 'Publisher']")
	private WebElement PublisherTableHeader;

	// action table header
	@FindBy(xpath = "//div[@class='rt-resizable-header-content' and normalize-space() = 'Action']")
	private WebElement ActionTableHeader;

	// top search result title
	@FindBy(xpath = "//div[@class='rt-tr-group'][1]/div[1]/div[2]//span/a")
	private WebElement TopSearchResultTitle;

	// top search result author
	@FindBy(xpath = "//div[@class='rt-tr-group'][1]/div[1]/div[3]")
	private WebElement TopSearchResultAuthor;

	// top search result publisher
	@FindBy(xpath = "//div[@class='rt-tr-group'][1]/div[1]/div[3]")
	private WebElement TopSearchResultPublisher;
	
	//top search result action
	@FindBy(xpath = "//div[@class='rt-tr-group'][1]/div[1]/div[3]//span[text()='Delete']")
	private WebElement TopSearchResultAction;

	/**
	 * @return the adClose
	 */
	public WebElement getAdClose() {
		return AdClose;
	}

	/**
	 * @return the profilePage
	 */
	public WebElement getProfilePage() {
		return profilePage;
	}

	/**
	 * @return the searchBox
	 */
	public WebElement getSearchBox() {
		return searchBox;
	}

	/**
	 * @return the logoutButton
	 */
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	/**
	 * @return the goToStoreButton
	 */
	public WebElement getGoToStoreButton() {
		return goToStoreButton;
	}

	/**
	 * @return the deleteAccountButton
	 */
	public WebElement getDeleteAccountButton() {
		return deleteAccountButton;
	}

	/**
	 * @return the deleteAllBooksButton
	 */
	public WebElement getDeleteAllBooksButton() {
		return deleteAllBooksButton;
	}

	/**
	 * @return the imageTableHeader
	 */
	public WebElement getImageTableHeader() {
		return ImageTableHeader;
	}

	/**
	 * @return the titleTableHeader
	 */
	public WebElement getTitleTableHeader() {
		return TitleTableHeader;
	}

	/**
	 * @return the authorTableHeader
	 */
	public WebElement getAuthorTableHeader() {
		return AuthorTableHeader;
	}

	/**
	 * @return the publisherTableHeader
	 */
	public WebElement getPublisherTableHeader() {
		return PublisherTableHeader;
	}

	/**
	 * @return the actionTableHeader
	 */
	public WebElement getActionTableHeader() {
		return ActionTableHeader;
	}

	/**
	 * @return the topSearchResultTitle
	 */
	public WebElement getTopSearchResultTitle() {
		return TopSearchResultTitle;
	}

	/**
	 * @return the topSearchResultAuthor
	 */
	public WebElement getTopSearchResultAuthor() {
		return TopSearchResultAuthor;
	}

	/**
	 * @return the topSearchResultPublisher
	 */
	public WebElement getTopSearchResultPublisher() {
		return TopSearchResultPublisher;
	}

	
	/**
	 * @return the topSearchResultAction
	 */
	public WebElement getTopSearchResultAction() {
		return TopSearchResultAction;
	}

	// verify profile page is loading successfully or not
	public void verifyProfilePageLoad() {

		String profilePageTitle = profilePage.getText();
		Assert.assertEquals("Profile", profilePageTitle, "Register Page did not load successfully");
	}

	// search a book with book name
	public void searchBook(String bookName) {

		searchBox.sendKeys(bookName);
	}

	// click on logout
	public void clickOnLogout() {

		logoutButton.click();
	}

	// click on go back to book store
	public void clickOnGoToStore() {

		goToStoreButton.click();
	}

	// click on delete account
	public void clickOnDeleteAccount() {

		deleteAccountButton.click();
	}

	// click on delete all books
	public void clickOnDeleteAllBooks() {

		deleteAllBooksButton.click();
	}

	// return value of user name label
	public String getUserName() {

		String userNameValue = userName.getText();
		return userNameValue;

	}

	// method to get number of books in table
	public int getNumberOfBooksInCollection() {

		List<WebElement> results = driver
				.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']/div[1]/div/img"));
		return results.size();
	}
	
	// method to delete book by row number
	public void deleteBookByRowNumber(int rowNum){
		
		WebElement deleteButton = driver.findElement(By.xpath("//div[@class='rt-tr-group']["+rowNum+"]/div[1]/div[3]//span[text()='Delete'])"));
		deleteButton.click();
	}

}
