package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerButton;
    private @FindBy(xpath = "//a[@class='ico-login']")
    WebElement logInButton;
    private @FindBy(xpath = "//li[@id='topcartlink']/a[@class='ico-cart']")
    WebElement shoppingCartButton;
    private @FindBy(xpath = "//span[contains(text(),'Wishlist')]")
    WebElement wishlistButton;
    private @FindBy(xpath = "//input[@id='small-searchterms']")
    WebElement searchInputField;
    private @FindBy(xpath = "//input[@value='Search']")
    WebElement searchButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Books')]")
    WebElement booksButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Computers')]")
    WebElement computersButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Electronics')]")
    WebElement electronicsButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Apparel & Shoes')]")
    WebElement apparelAndShoesButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Digital downloads')]")
    WebElement digitalDownloadsButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Jewelry')]")
    WebElement jewelryButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Gift Cards')]")
    WebElement giftCardsButton;
    private @FindBy(xpath = "//a[contains(text(),'Compare products list')]")
    WebElement compareProductsButton;

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public WebElement getShoppingCartButton() {
        return shoppingCartButton;
    }

    public WebElement getWishlistButton() {
        return wishlistButton;
    }

    public WebElement getSearchInputField() {
        return searchInputField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getBooksButton() {
        return booksButton;
    }

    public WebElement getComputersButton() {
        return computersButton;
    }

    public WebElement getElectronicsButton() {
        return electronicsButton;
    }

    public WebElement getApparelAndShoesButton() {
        return apparelAndShoesButton;
    }

    public WebElement getDigitalDownloadsButton() {
        return digitalDownloadsButton;
    }

    public WebElement getJewelryButton() {
        return jewelryButton;
    }

    public WebElement getGiftCardsButton() {
        return giftCardsButton;
    }

    public WebElement getCompareProductsButton() {
        return compareProductsButton;
    }
}