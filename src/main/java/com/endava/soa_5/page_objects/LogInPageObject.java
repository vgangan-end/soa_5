package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LogInPageObject extends BaseClass {
    @FindBy(xpath = "//div[@class=\"header-links\"]//a[@class=\"ico-login\"]")
    private WebElement logInLink;
    @FindBy(xpath = "//a[@href=\"/logout\"]")
    private WebElement logOutLink;
    @FindBy(xpath = "//input[@id=\"Email\"]")
    private WebElement emailInputField;
    @FindBy(xpath = "//input[@id=\"Password\"]")
    private WebElement passwordInputField;
    @FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
    private WebElement logInButton;
    @FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
    private WebElement accountName;
    @FindBy(xpath = "//div[@class=\"validation-summary-errors\"]")
    private WebElement wrongCredentialsMessage;
}
