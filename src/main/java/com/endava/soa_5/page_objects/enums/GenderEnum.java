package com.endava.soa_5.page_objects.enums;

import lombok.Getter;

@Getter
public enum GenderEnum {
    MALE("M"),
    FEMALE("F");

    String genderEnum;

    GenderEnum(String genderEnum) {
        this.genderEnum = genderEnum;
    }
}
