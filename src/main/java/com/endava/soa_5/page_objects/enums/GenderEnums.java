package com.endava.soa_5.page_objects.enums;

import lombok.Getter;

@Getter
public enum GenderEnums {
    MALE("M"),
    FEMALE("F");

    String genderEnum;

    GenderEnums(String genderEnum) {
        this.genderEnum = genderEnum;
    }
}
