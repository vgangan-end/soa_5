package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

@Getter
public class ShoppingCartPage extends BaseClass {

    private @FindBy(css = "input.qty-input")
    List<WebElement> itemsCartQuantity;
    private @FindBy(css = "span.cart-qty")
    WebElement cartQuantity;
    private @FindBy(css = "a.product-name")
    List<WebElement> productNameList;
    private @FindBy(xpath = "//input[@name='updatecart']")
    WebElement updateCartButton;
    private @FindBy(xpath = "//td/a[@href='/black-white-diamond-heart']/../preceding-sibling::td[@class='remove-from-cart']")
    WebElement removeFromCart;
    private @FindBy(xpath = "//div[@class='order-summary-content']")
    List<WebElement> emptyShoppingCartMessage;
}