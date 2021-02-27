package com.endava.soa_5.actions;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.page_objects.LogInPageObject;
import com.endava.soa_5.page_objects.MyAccountPage.CustomerInfoPage;
import com.endava.soa_5.page_objects.enums.GenderEnums;

import java.util.Map;

public class EditUserDataPageActions extends BaseClass {
    private CustomerInfoPage customerInfoPage = new CustomerInfoPage();
    private LogInPageObject logInPageObject = new LogInPageObject(driver);
    private GenericActions genericActions = new GenericActions();

    public void clickAccountNameButton() {
        genericActions.waitForElement(logInPageObject.getAccountName());
        logInPageObject.getAccountName().click();
    }

    public void fillInCustomerInfo(Map<String, String> userData) {
        if (userData.get("Gender") != null) {
            if (userData.get("Gender").equalsIgnoreCase(GenderEnums.MALE.getGenderEnum())) {
                customerInfoPage.getMaleRadioButton().click();
            } else if (userData.get("Gender").equalsIgnoreCase(GenderEnums.FEMALE.getGenderEnum())) {
                customerInfoPage.getFemaleRadioButton().click();
            }
        }
        if (userData.get("First name") != null) {
            customerInfoPage.getFirstNameTextBox().clear();
            customerInfoPage.getFirstNameTextBox().sendKeys(userData.get("First name"));
        }
        if (userData.get("Last name") != null) {
            customerInfoPage.getLastNameTextBox().clear();
            customerInfoPage.getLastNameTextBox().sendKeys(userData.get("Last name"));
        }
    }

    public String getGenderCheck(String gender) {
        if (gender.equalsIgnoreCase(GenderEnums.MALE.getGenderEnum())) {
            return customerInfoPage.getMaleRadioButton().getAttribute("checked");
        } else if (gender.equalsIgnoreCase(GenderEnums.FEMALE.getGenderEnum())) {
            return customerInfoPage.getFemaleRadioButton().getAttribute("checked");
        }
        throw new IllegalArgumentException("No GenderEnums for value: " + gender);
    }

    public String getFirstNameText() {
        genericActions.waitForElement(customerInfoPage.getFirstNameTextBox());
        return customerInfoPage.getFirstNameTextBox().getAttribute("value");
    }

    public String getLastNameText() {
        genericActions.waitForElement(customerInfoPage.getLastNameTextBox());
        return customerInfoPage.getLastNameTextBox().getAttribute("value");
    }

    public void clickSaveCustomerInfoButton() {
        genericActions.waitForElement(customerInfoPage.getSaveCustomerInfoButton());
        customerInfoPage.getSaveCustomerInfoButton().click();
    }

    public String getFirstNameErrorMessage() {
        genericActions.waitForElement(customerInfoPage.getFirstNameIsRequiredError());
        return customerInfoPage.getFirstNameIsRequiredError().getText();
    }

    public String getLastNameErrorMessage() {
        genericActions.waitForElement(customerInfoPage.getLastNameIsRequiredError());
        return customerInfoPage.getLastNameIsRequiredError().getText();
    }

    public String getEmailErrorMessage() {
        genericActions.waitForElement(customerInfoPage.getEmailIsRequiredError());
        return customerInfoPage.getEmailIsRequiredError().getText();
    }

    public void clearExistingText() {
        customerInfoPage.getFirstNameTextBox().clear();
        customerInfoPage.getLastNameTextBox().clear();
        customerInfoPage.getEmailTextBox().clear();
    }
}
