package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.JewelryPage;

public class JewelryPageActions {
    private JewelryPage jewelryPage;

    public JewelryPageActions() {
        this.jewelryPage = new JewelryPage();
    }

    public void AddToCartCustomJewelry() {
        jewelryPage.getCustomJewelryAddToCartButton().click();
    }

    public void AddToCartDiamondHeart() {
        jewelryPage.getDiamondHeartAddToCartButton().click();
    }

    public void accessDiamondEarringsDetails() {
        jewelryPage.getDiamondEarrings().click();
    }

    public void accessDiamondHeartDetails() {
        jewelryPage.getDiamondHeart().click();
    }

    public void accessDiamondBraceletDetails() {
        jewelryPage.getDiamondBracelet().click();
    }

    public void accessDiamondRingDetails() {
        jewelryPage.getDiamondRing().click();
    }

    public void accessCustomJewelryDetails() {
        jewelryPage.getCustomJewelry().click();
    }
}
