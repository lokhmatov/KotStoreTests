package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@id ='cart']")
    private WebElement cart;

    @FindBy(xpath = "//a[contains(@class, 'btn btn-user')]")
    private WebElement account;

    @FindBy(xpath = "//input[@id = 'emailLoginInput']")
    private WebElement emailLoginInput;

    @FindBy(xpath = "//input[@id = 'passwordLoginInput']")
    private WebElement passwordLoginInput;

    @FindBy(xpath = "//div[@class='modal-content']//button[@class='fm-close']")
    private WebElement registrationFormCloseButton;

    @FindBy(xpath = "//div[@class='fm-menu d-flex align-items-center']")
    private WebElement catalog;

    @FindBy (xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//button[@class='fm-close']")
    private WebElement popupCloseButton;

    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement signInPopup;

    @FindBy(xpath = "//div[@id='fm_sidebar']")
    private WebElement cartSideBar;

    @FindBy(xpath = "//a[@class='fm-btn fm-btn-blue']")
    private WebElement orderButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isFooterVisible() {
        return footer.isDisplayed();
    }

    public boolean isCartIconVisible() {
        return cart.isDisplayed();
    }

    public boolean isAccountLinkVisible() {
        return account.isDisplayed();
    }

    public boolean isEmailLoginInputVisible() {
        return emailLoginInput.isDisplayed();
    }

    public boolean isPasswordLoginInputVisible() {
        return passwordLoginInput.isDisplayed();
    }

    public void clickOnAccountLink() {
        account.click();
    }

    public void closeSignInPopup() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", popupCloseButton);
    }

    public WebElement getSignInPopup() {
        return signInPopup;
    }

    public boolean isCatalogVisible() {
        return catalog.isDisplayed();
    }

    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText, Keys.ENTER);
    }

    public void clickToCartButton() {
        cart.click();
    }

    public boolean isCartSideBarVisible() {
        return cartSideBar.isDisplayed();
    }

    public boolean isOrderButtonVisible() {
        return orderButton.isDisplayed();
    }

    public void clickOrderButton() {
        orderButton.click();
    }

    public WebElement getOrderButton() {
        return orderButton;
    }


}
