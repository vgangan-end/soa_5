package com.endava.soa_5.page_objects.enums;

public enum PageTitlesEnum {
    HOME_PAGE("Demo Web Shop"),
    REGISTER_PAGE("Demo Web Shop. Register"),
    NOTEBOOKS_PAGE("Demo Web Shop. Notebooks"),
    MY_ACCOUNT("Demo Web Shop. Account"),
    BOOKS("Demo Web Shop. Books"),
    COMPUTERS("Demo Web Shop. Computers"),
    ELECTRONICS("Demo Web Shop. Electronics"),
    APPAREL_AND_SHOES("Demo Web Shop. Apparel & Shoes"),
    DIGITAL_DOWNLOADS("Demo Web Shop. Digital Downloads"),
    JEWELRY("Demo Web Shop. Jewelry"),
    GIFT_CARDS("Demo Web Shop. Gift Cards");

    String title;

    PageTitlesEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
