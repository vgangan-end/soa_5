package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.HomePage;
import com.endava.soa_5.page_objects.JewelryPage;

public class JewelryPageActions {
    private JewelryPage jewelryPage;
    private HomePage homePage;

    public JewelryPageActions() {
        this.jewelryPage = new JewelryPage();
        this.homePage = new HomePage();
    }

    public void addToCartDiamondHeart() {
        jewelryPage.getDiamondHeartAddToCartButton().click();
    }

    public void accessPage() {
        homePage.getJewelryButton().click();
    }
}