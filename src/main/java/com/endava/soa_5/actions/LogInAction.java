package com.endava.soa_5.actions;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.drivers.Driver;
import com.endava.soa_5.page_objects.LogInPageObject;

public class LogInAction extends BaseClass {
    LogInPageObject logInPageObject = new LogInPageObject(Driver.getInstance().getDriver());

    public void login() {
        logInPageObject.getLogInLink().click();
        logInPageObject.getEmailInputField().sendKeys(propertyReader.getPropertyValue("userName"));
        logInPageObject.getPasswordInputField().sendKeys(propertyReader.getPropertyValue("password"));
    }

    public void clickLogInButton() {
        logInPageObject.getLogInButton().click();
    }

    public String checkAccountNameIsDisplayed() {
        return logInPageObject.getAccountName().getText();
    }
}