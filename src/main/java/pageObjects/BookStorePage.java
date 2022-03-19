package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookStorePage {

	// driver object
	WebDriver driver;

	// constructor with initialization of page elements
	public BookStorePage(WebDriver driver) {

		// initialize driver
		this.driver = driver;
		
		// initialize web elements 
		PageFactory.initElements(driver, this);
	}
	
	//////////////////////////////////////// WebElement Locators /////////////////////////////////////

	// book store page
	@FindBy(xpath = "//div[@class='main-header' and normalize-space() = 'BookStore']") 
	private WebElement BookStorePage;
	
	// login button
	@FindBys({@FindBy(id="login"),@FindBy(tagName="button")}) 
	private WebElement LoginButton;
	
	// logout button
		@FindBys({@FindBy(id="submit"),@FindBy(tagName="button")}) 
		private WebElement LogoutButton;
	
	// search bar
		@FindBys({@FindBy(id="searchBox"),@FindBy(tagName="input")}) 
		private WebElement SearchBox;
	
	// user name
		@FindBys({@FindBy(id="userName-value"),@FindBy(tagName="label")}) 
		private WebElement UserName;

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

	// top search result title
		@FindBy(xpath = "//div[@class='rt-tr-group'][1]/div[1]/div[2]//span/a") 
		private WebElement TopSearchResultTitle;

	// top search result author
		@FindBy(xpath = "//div[@class='rt-tr-group'][1]/div[1]/div[3]") 
		private WebElement TopSearchResultAuthor;

	// top search result publisher
		@FindBy(xpath = "//div[@class='rt-tr-group'][1]/div[1]/div[3]") 
		private WebElement TopSearchResultPublisher;
		
		
		/**
		 * @return the bookStorePage
		 */
		public WebElement getBookStorePage() {
			return BookStorePage;
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
		 * @return the searchBox
		 */
		public WebElement getSearchBox() {
			return SearchBox;
		}

		/**
		 * @return the userName
		 */
		public WebElement getUserName() {
			return UserName;
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


		//////////////////////////////////Reusable Page Methods /////////////////////////////////////////////

		
		// method to verify Book Store page load
		public void verifyBookStorePageLoad() {
			
			Assert.assertTrue(BookStorePage.isDisplayed(), "Book Store Page did not load");
		}
		
		// method to enter search text
		public void enterSearchText(String text) {
			
			SearchBox.sendKeys(text);
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
		
		// method to get number of search results
		public int getNumberOfSearchResults() {
			
			List <WebElement> results = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]/div/img"));
			return results.size();
		}


		// method to get top search result title
		public String getTopSearchResultTitleValue() {
			return TopSearchResultTitle.getText();
		}

		// method to get top search result author
		public String getTopSearchResultAuthorValue() {
			return TopSearchResultAuthor.getText();
		}

		// method to get top search result publisher
		public String getTopSearchResultPublisherValue() {
			return TopSearchResultPublisher.getText();
		}

		// method to click on top search result title
		public void clickTopSearchResultTitle() {
			TopSearchResultTitle.click();
		}
}
	