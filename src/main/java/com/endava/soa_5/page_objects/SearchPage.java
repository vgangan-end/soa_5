package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Search')]")
    private WebElement searchHeader;
    @FindBy(xpath = "//input[@id='Q']")
    private WebElement searchField;
    @FindBy(xpath = "//div/input[@type='submit']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='product-grid']")
    private WebElement productGrid;
    @FindBy(xpath = "//input[@id='As']")
    private WebElement advancedSearchCheckBox;
    @FindBy(xpath = "//select[@id='Cid']")
    private WebElement categoryDropDown;
    @FindBy(xpath = "//input[@id='Sid']")
    private WebElement searchInProductDescriptionCheckBox;
    @FindBy(xpath = "//input[@id='Isc']")
    private WebElement searchInSubCategoriesCheckBox;
    @FindBy(xpath = "//input[@id='Pf']")
    private WebElement priceFromField;
    @FindBy(xpath = "//input[@id='Pt']")
    private WebElement priceToField;
    @FindBy(xpath = "//strong[@class='warning']")
    private WebElement warningMessage;
}
