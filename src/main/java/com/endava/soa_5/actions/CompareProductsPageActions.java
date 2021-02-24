package com.endava.soa_5.actions;


import com.endava.soa_5.abstract_classes.BasePage;
import com.endava.soa_5.page_objects.CompareProductsPage;

public class CompareProductsPageActions extends BasePage {
    CompareProductsPage compareProductsPage;

    public CompareProductsPageActions() {
        this.compareProductsPage = new CompareProductsPage();
    }

    public void clickOnRemoveDiamondEarring() {
        compareProductsPage.getRemoveDiamondEarringsButton().click();
    }

    public void clickOnRemoveDiamondBracelet() {
        compareProductsPage.getRemoveDiamondBraceletButton().click();
    }

    public void clickOnRemoveDiamondHeart() {
        compareProductsPage.getRemoveDiamondHeartButton().click();
    }

    public void clickOnRemoveCustomJewelry() {
        compareProductsPage.getRemoveCustomJewelryButton().click();
    }

    public String getPageConfirmation() {
        return compareProductsPage.getCompareProductsHeader().getText();
    }
}
