package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.CustomJewelryPage;

public class CustomJewelryPageActions {
    CustomJewelryPage customJewelryPage;

    public CustomJewelryPageActions() {
        this.customJewelryPage = new CustomJewelryPage();
    }

    public void addToCompareList() {
        customJewelryPage.getAddToCompareButton().click();
    }

    public void addToCart() {
        customJewelryPage.getAddToCartButton().click();
    }

    public void addToWishList() {
        customJewelryPage.getAddToWishListButton().click();
    }
}
