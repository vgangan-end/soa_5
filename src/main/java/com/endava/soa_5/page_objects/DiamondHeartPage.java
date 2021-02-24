package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DiamondHeartPage extends BaseClass {
    @FindBy(xpath = "//input[contains(@value,'compare')]")
    private WebElement addToCompareButton;
    @FindBy(xpath = "//input[contains(@id,'add-to-wishlist')]")
    private WebElement addToWishListButton;
    @FindBy(xpath = "//input[contains(@id,'add-to-cart')]")
    private WebElement addToCartButton;
}
