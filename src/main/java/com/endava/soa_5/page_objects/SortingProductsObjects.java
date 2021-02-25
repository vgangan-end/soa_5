package com.endava.soa_5.page_objects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SortingProductsObjects {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class=\"listbox\"]//a[@href=\"/computers\"]")
    private WebElement computerLink;
    @FindBy(xpath = "//div[@class=\"listbox\"]//a[@href=\"/desktops\"]")
    private WebElement desktopsLink;
    @FindBy(xpath = "//select[@id=\"products-orderby\"]")
    private WebElement sortDropDown;
    @FindBy(xpath = "//select[@id=\"products-orderby\"]//option[@value = \"http://demowebshop.tricentis.com/desktops?orderby=10\"]")
    private WebElement priceLowToHigh;
    @FindBy(xpath = "//select[@id=\"products-orderby\"]//option[@value = \"http://demowebshop.tricentis.com/desktops?orderby=11\"]")
    private WebElement priceHighToLow;
    @FindBy(xpath = "//div[@class=\"prices\"]//span[@class=\"price actual-price\"]")
    private WebElement listOfAllPrices;

    public SortingProductsObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
