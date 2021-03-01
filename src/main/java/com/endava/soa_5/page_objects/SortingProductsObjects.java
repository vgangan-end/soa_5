package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SortingProductsObjects extends BaseClass {
    @FindBy(xpath = "//div[@class=\"listbox\"]//a[@href=\"/computers\"]")
    private WebElement computerLink;
    @FindBy(xpath = "//div[@class=\"listbox\"]//a[@href=\"/desktops\"]")
    private WebElement desktopsLink;
    @FindBy(xpath = "//select[@id=\"products-orderby\"]")
    private WebElement sortDropDown;
    @FindBy(xpath = "//option[contains(@value, 'desktops?orderby=10')]")
    private WebElement priceLowToHigh;
    @FindBy(xpath = "//option[contains(@value, 'desktops?orderby=11')]")
    private WebElement priceHighToLow;
    @FindBy(xpath = "//div[@class=\"prices\"]//span[@class=\"price actual-price\"]")
    private WebElement listOfAllPrices;
}
