package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SmokeTest extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 90;

    @Test
    public void checkMainComponentsOnHomePage() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getHomePage().isHeaderVisible());
        assertTrue(getHomePage().isAccountLinkVisible());
        assertTrue(getHomePage().isCartIconVisible());
        assertTrue(getHomePage().isFooterVisible());
        getHomePage().clickOnAccountLink();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getSignInPopup());
        assertTrue(getHomePage().isEmailLoginInputVisible());
        assertTrue(getHomePage().isPasswordLoginInputVisible());
        getHomePage().closeSignInPopup();
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertTrue(getHomePage().isCatalogVisible());
    }

    @Test
    public void checkAddToCart() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().isSearchFieldVisible();
        getHomePage().enterTextToSearchField("видеорегистратор");
        getSearchResultPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getSearchResultPage().clickAddToCartButton();
        getSearchResultPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSearchResultPage().getProductAddToCartPopup());
        assertTrue(getSearchResultPage().isProductAddToCartPopupVisible());
        getSearchResultPage().clickOnLogo();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickToCartButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getOrderButton());
        getHomePage().isCartSideBarVisible();
        getHomePage().isOrderButtonVisible();
        getHomePage().clickOrderButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getCheckOutPage().isInputCustomerTelVisible());
        assertTrue(getCheckOutPage().isInputCustomerNameVisible());
        assertTrue(getCheckOutPage().isInputCustomerLastNameVisible());
        assertTrue(getCheckOutPage().isCheckoutButtonVisible());
    }
}
