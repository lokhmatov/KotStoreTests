package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='customer_telephone']")
    private WebElement inputCustomerTel;

    @FindBy(xpath = "//input[@id='shipping_address_firstname']")
    private WebElement inputCustomerName;

    @FindBy(xpath = "//input[@id='shipping_address_lastname']")
    private WebElement inputCustomerLastName;

    @FindBy(xpath = "//a[@class='button btn-primary button_oc btn']")
    private WebElement checkoutButton;

    public boolean isInputCustomerTelVisible() {
        return inputCustomerTel.isDisplayed();
    }

    public boolean isInputCustomerNameVisible() {
        return inputCustomerName.isDisplayed();
    }

    public boolean isInputCustomerLastNameVisible() {
        return inputCustomerLastName.isDisplayed();
    }

    public boolean isCheckoutButtonVisible() {
        return checkoutButton.isDisplayed();
    }
}
