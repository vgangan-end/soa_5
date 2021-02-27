package com.endava.soa_5.page_objects.enums;

public enum PageTitlesEnum {
    HOME_PAGE("Demo Web Shop"),
    REGISTER_PAGE("Demo Web Shop. Register"),
    NOTEBOOKS_PAGE("Demo Web Shop. Notebooks"),
    MY_ACCOUNT("Demo Web Shop. Account");

    String title;

    PageTitlesEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
