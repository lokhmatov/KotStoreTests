package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='cart']")
    private WebElement cart;

    @FindBy(xpath = "//button[@class='fm-product-btn']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='fm-product-btn']")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = "//div[@class='fm-alert-content d-flex align-items-center']")
    private WebElement productAddToCartPopup;


    @FindBy(xpath = "//div[@class='fm-logo']//a")
    private WebElement logo;

    public void clickAddToCartButton() {
        addToCartButtons.get(0).click();
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public boolean isProductAddToCartPopupVisible() {
        return productAddToCartPopup.isDisplayed();
    }


    public WebElement getProductAddToCartPopup() {
        return productAddToCartPopup;
    }

    public void clickOnLogo() {
        logo.click();
    }

}
