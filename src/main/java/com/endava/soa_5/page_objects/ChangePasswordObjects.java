package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ChangePasswordObjects extends BaseClass {

    @FindBy(xpath = "//div[@class=\"header-links\"]//a[@class=\"account\"]")
    private WebElement userEmail;
    @FindBy(xpath = "//ul[@class=\"list\"]//a[@href=\"/customer/changepassword\"]")
    private WebElement changePassword;
    @FindBy(xpath = "//input[@name=\"OldPassword\"]")
    private WebElement oldPasswordField;
    @FindBy(xpath = "//input[@name=\"NewPassword\"]")
    private WebElement newPasswordField;
    @FindBy(xpath = "//input[@name=\"ConfirmNewPassword\"]")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "//div[@class=\"buttons\"]//input[@type=\"submit\"]")
    private WebElement changePasswordButton;
    @FindBy(xpath = "//div[@class=\"result\"]")
    private WebElement changePasswordConfirmation;
}
