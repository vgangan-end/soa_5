package com.endava.soa_5.actions;

import com.endava.soa_5.constant.LogInValidationMessages;
import com.endava.soa_5.page_objects.ChangePasswordObjects;
import com.endava.soa_5.page_objects.LogInPageObject;
import com.endava.soa_5.tools.PropertyReader;
import com.mifmif.common.regex.Generex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.endava.soa_5.tools.Constants.PROPERTY_CHANGE_PASSWORD;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChangePasswordActions extends LogInAction {
    ChangePasswordObjects changePasswordObjects = new ChangePasswordObjects();
    PropertyReader propertyChangePassword = new PropertyReader(PROPERTY_CHANGE_PASSWORD);
    LogInPageObject logInPageObject = new LogInPageObject();
    String newPassword = getNewPassword();

    public void userLogsIn() {
        genericActions.waitForElement(logInPageObject.getLogInLink());
        logInPageObject.getLogInLink().click();
        logInPageObject.getEmailInputField().sendKeys(propertyChangePassword.getPropertyValue("passUserName"));
        logInPageObject.getPasswordInputField().sendKeys(propertyChangePassword.getPropertyValue("currentPassword"));
        logInPageObject.getLogInButton().click();
    }

    public void navigateToChangePasswordPage() {
        genericActions.waitForElement(changePasswordObjects.getUserEmail());
        changePasswordObjects.getUserEmail().click();
        changePasswordObjects.getChangePassword().click();
    }

    public void typeInOldPassword() {
        changePasswordObjects.getOldPasswordField().sendKeys(propertyChangePassword.getPropertyValue("currentPassword"));
    }

    public void typeInNewPassword() throws IOException {
        changePasswordObjects.getNewPasswordField().sendKeys(newPassword);
        changePasswordObjects.getConfirmPasswordField().sendKeys(newPassword);
        writePass(newPassword);
    }

    public void clickChangePasswordButton() {
        changePasswordObjects.getChangePasswordButton().click();
    }

    public void checkConfirmationMessageIsDisplayed() {
        genericActions.waitForElement(changePasswordObjects.getChangePasswordConfirmation());
        assertThat("Change password message displayed", changePasswordObjects.getChangePasswordConfirmation().getText(), is(LogInValidationMessages.CHANGE_PASSWORD_CONFIRMATION.getValidationMessage()));
    }

    public void logInWithOldPassword() {
        logInPageObject.getLogOutLink().click();
        genericActions.waitForElement(logInPageObject.getLogInLink());
        logInPageObject.getLogInLink().click();
        genericActions.waitForElement(logInPageObject.getEmailInputField());
        logInPageObject.getEmailInputField().sendKeys(propertyChangePassword.getPropertyValue("passUserName"));
        logInPageObject.getPasswordInputField().sendKeys(propertyChangePassword.getPropertyValue("oldPassword"));
        logInPageObject.getLogInButton().click();
    }

    public void checkWrongCredentialsMessage() {
        genericActions.waitForElement(logInPageObject.getWrongCredentialsMessage());
        assertThat("User cannot log in with old password", logInPageObject.getWrongCredentialsMessage().getText(), is(LogInValidationMessages.WRONG_CREDENTIALS.getValidationMessage()));
    }

    public void LogInWithNewPassword() {
        logInPageObject.getLogInLink().click();
        genericActions.waitForElement(logInPageObject.getEmailInputField());
        logInPageObject.getEmailInputField().sendKeys(propertyChangePassword.getPropertyValue("passUserName"));
        logInPageObject.getPasswordInputField().sendKeys(newPassword);
        logInPageObject.getLogInButton().click();
    }

    public void checkThatUserIsLoggedIn() {
        assertThat("LogIn was successful", checkAccountNameIsDisplayed(), is(propertyChangePassword.getPropertyValue("passUserName")));
    }

    public void writePass(String value) throws IOException {
        Path filePath = Paths.get("src/main/resources/configuration/ChangePasswordCredentials.properties");
        BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)));
        writer.write("passUserName=" + propertyChangePassword.getPropertyValue("passUserName") + "\n");
        writer.write("oldPassword=" + propertyChangePassword.getPropertyValue("currentPassword") + "\n");
        writer.write("currentPassword=" + value);
        writer.close();
    }

    public String getNewPassword() {
        Generex generex = new Generex("([0-9]+[a-z]+[A-Z]+[!@#$%^&*()_+-]){2,10}");
        return generex.random();
    }
}
