package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class FilterByPricePage extends BaseClass {
    @FindBy(xpath = "//div[@class='page-title']//h1")
    private WebElement booksPageTitle;
    @FindBy(xpath = "//div[@class='filter-title']//strong")
    private WebElement filterByPriceTitle;
    @FindBy(xpath = "//a[contains(@href,'/books?price=-25')]")
    private WebElement priceUnder25FilterButton;
    @FindBy(xpath = "//a[contains(@href,'/books?price=50')]")
    private WebElement priceOver50FilterButton;
    @FindBy(xpath = "//div[@class='product-grid']//span[@class='price actual-price']")
    private List<WebElement> listOfBooksPrices;
    @FindBy(xpath = "//a[contains(@href, 'http://demowebshop.tricentis.com/books')]")
    private WebElement removeFilterButton;
}
