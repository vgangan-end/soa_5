package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.HomePage;
import com.endava.soa_5.page_objects.ShoppingCartPage;
import org.openqa.selenium.WebElement;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShoppingCartActions {
    GenericActions genericActions = new GenericActions();
    private final ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    private final HomePage homePage = new HomePage();
    public String oldQuantity = "";

    public void accessPage() {
        genericActions.clickOnElement(homePage.getShoppingCartButton());
    }

    public void clickOnUpdateShippingCart() {
        genericActions.clickOnElement(shoppingCartPage.getUpdateCartButton());
    }

    public void clickOnRemoveFromCart() {
        genericActions.clickOnElement(shoppingCartPage.getRemoveFromCart());
    }

    public void clearQuanityField() {
        shoppingCartPage.getItemsCartQuantity().get(0).clear();
        oldQuantity = shoppingCartPage.getCartQuantity().getText();
    }

    public void clickOnItemsCartQuantityField() {
        shoppingCartPage.getItemsCartQuantity().get(0).sendKeys("5");
    }

    public boolean validateDiamondHeartIsDisplayed() {
        String diamondHeartDescription = "Black & White Diamond Heart";
        List<WebElement> list = shoppingCartPage.getProductNameList();
        for (WebElement e : list) {
            if (e.getText().contains(diamondHeartDescription)) return true;
        }
        return false;
    }

    public boolean validateItemsQuantity() {
        String newQuantity = shoppingCartPage.getCartQuantity().getText();
        log.info("New Items Quantity is: "+ newQuantity + " / " + "Old Items Quantity is: " + oldQuantity);
        if (!newQuantity.equals(oldQuantity)) {
            return true;
        }
        return false;
    }

    public boolean checkEmptyShoppingCart() {
        String shoppingCartMessage = "Your Shopping Cart is empty!";
        List<WebElement> list = shoppingCartPage.getEmptyShoppingCartMessage();
        for (WebElement e : list) {
            if (e.getText().contains(shoppingCartMessage))
                return true;
        }
        return false;
    }
}