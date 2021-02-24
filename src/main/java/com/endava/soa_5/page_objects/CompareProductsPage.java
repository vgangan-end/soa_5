package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CompareProductsPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Compare products')]")
    private WebElement compareProductsHeader;
    @FindBy(xpath = "//tr[@class='product-name']/td[contains(@class,'center')]")
    private WebElement comparableProductsNames;
    @FindBy(xpath = "//a[contains(text(),'Clear list')]")
    private WebElement clearListButton;
    @FindBy(xpath = "//input[contains(@onclick,'remove/26')]")
    private WebElement removeDiamondBraceletButton;
    @FindBy(xpath = "//input[contains(@onclick,'remove/25')]")
    private WebElement removeDiamondEarringsButton;
    @FindBy(xpath = "//input[contains(@onclick,'remove/14')]")
    private WebElement removeDiamondHeartButton;
    @FindBy(xpath = "//input[contains(@onclick,'remove/71')]")
    private WebElement removeCustomJewelryButton;
}
