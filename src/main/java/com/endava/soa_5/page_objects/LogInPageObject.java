package com.endava.soa_5.page_objects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LogInPageObject {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class=\"header-links\"]//a[@class=\"ico-login\"]")
    private WebElement logInLink;
    @FindBy(xpath = "//input[@id=\"Email\"]")
    private WebElement emailInputField;
    @FindBy(xpath = "//input[@id=\"Password\"]")
    private WebElement passwordInputField;
    @FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
    private WebElement logInButton;
    @FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
    private WebElement accountName;

    public LogInPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
