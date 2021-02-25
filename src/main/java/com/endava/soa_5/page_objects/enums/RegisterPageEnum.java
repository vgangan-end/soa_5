package com.endava.soa_5.page_objects.enums;

public enum RegisterPageEnum {
    GENDER_MALE("#gender-male"),
    GENDER_FEMALE("#gender-female"),
    FIRST_NAME("#FirstName"),
    LAST_NAME("#LastName"),
    EMAIL("#Email"),
    PASSWORD("#Password"),
    CONFIRM_PASSWORD("#ConfirmPassword"),
    REGISTER_BUTTON("#register-button");

    String css;

    RegisterPageEnum(String css) {
        this.css = css;
    }

    public String getCss() {
        return this.css;
    }
}