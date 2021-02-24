package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.WishListPage;

public class WishListPageActions {
    WishListPage wishListPage;

    WishListPageActions() {
        this.wishListPage = new WishListPage();
    }

    public void clickOnUpdateWishListButton() {
        wishListPage.getUpdateWishListButton().click();
    }

    public void clickAddToCartButton() {
        wishListPage.getAddToCartButton().click();
    }

    public String getWishListQuantity() {
        return wishListPage.getWishListQuantity().getText();
    }
}
