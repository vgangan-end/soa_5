package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DiamondHeartPage extends BasePage {
    @FindBy(xpath = "//input[contains(@value,'compare')]")
    private WebElement addToCompareButton;
    @FindBy(xpath = "//input[contains(@id,'add-to-wishlist')]")
    private WebElement addToWishListButton;
    @FindBy(xpath = "//input[contains(@id,'add-to-cart')]")
    private WebElement addToCartButton;
}
