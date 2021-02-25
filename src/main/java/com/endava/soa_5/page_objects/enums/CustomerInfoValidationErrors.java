package com.endava.soa_5.page_objects.enums;

import lombok.Getter;

@Getter
public enum CustomerInfoValidationErrors {
    FIRST_NAME_ERROR("First name is required."),
    LAST_NAME_ERROR("Last name is required."),
    EMAIL_ERROR("Email is required.");

    String errorMessage;

    CustomerInfoValidationErrors(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
