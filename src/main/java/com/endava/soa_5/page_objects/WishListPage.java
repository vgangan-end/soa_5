package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter
public class WishListPage extends BaseClass {
    @FindBy(xpath = "//input[@name='updatecart']")
    private WebElement updateWishListButton;
    @FindBy(xpath = "//input[@name='addtocartbutton']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//td/a[contains(text(),'Music 2')]/../preceding-sibling::td[@class='remove-from-cart']")
    private WebElement removeMusic2CheckBox;
    @FindBy(xpath = "//td/a[contains(text(),'Smartphone')]/../preceding-sibling::td[@class='remove-from-cart']")
    private WebElement removeSmartPhoneCheckBox;
    @FindBy(xpath = "//td/a[contains(text(),'Sneaker')]/../preceding-sibling::td[@class='remove-from-cart']")
    private WebElement removeSneakerCheckBox;
    @FindBy(xpath = "//a[@href='/wishlist']/span[@class='wishlist-qty']")
    private WebElement wishListQuantity;
}
