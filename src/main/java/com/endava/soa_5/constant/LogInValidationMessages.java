package com.endava.soa_5.constant;

import lombok.Getter;

@Getter
public enum LogInValidationMessages {
        WRONG_CREDENTIALS("Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect"),
        CHANGE_PASSWORD_CONFIRMATION("Password was changed");

        String validationMessage;

        public String getValidationMessage() {
            return validationMessage;
        }

    LogInValidationMessages(String message) {
            this.validationMessage = message;
        }
}

