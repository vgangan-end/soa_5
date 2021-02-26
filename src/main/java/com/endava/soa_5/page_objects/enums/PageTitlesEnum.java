package com.endava.soa_5.page_objects.enums;

public enum PageTitlesEnum {
    HOME_PAGE("Demo Web Shop"),
    REGISTER_PAGE("Demo Web Shop. Register");

    String title;

    PageTitlesEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
