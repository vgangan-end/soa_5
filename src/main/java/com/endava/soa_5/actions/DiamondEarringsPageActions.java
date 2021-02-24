package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.DiamondEarringsPage;

public class DiamondEarringsPageActions {
    private DiamondEarringsPage diamondEarringsPage;

    public DiamondEarringsPageActions() {
        this.diamondEarringsPage = new DiamondEarringsPage();
    }

    public void addToCompareList() {
        diamondEarringsPage.getAddToCompareButton().click();
    }
}
