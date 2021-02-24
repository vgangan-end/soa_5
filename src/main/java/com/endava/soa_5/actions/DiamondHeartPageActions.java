package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.DiamondHeartPage;

public class DiamondHeartPageActions {
    private DiamondHeartPage diamondHeartPage;

    public DiamondHeartPageActions() {
        this.diamondHeartPage = new DiamondHeartPage();
    }

    public void addToCompareList() {
        diamondHeartPage.getAddToCompareButton().click();
    }

    public void addToCart() {
        diamondHeartPage.getAddToCartButton().click();
    }

    public void addToWishList() {
        diamondHeartPage.getAddToWishListButton().click();
    }
}
