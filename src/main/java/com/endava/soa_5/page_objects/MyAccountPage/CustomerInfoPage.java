package com.endava.soa_5.page_objects.MyAccountPage;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class CustomerInfoPage extends BaseClass {

    @FindBy(xpath = "//div[@class='block block-account-navigation']")
    private MyAccountModule myAccountModule;
    @FindBy(xpath = "//div[@class='page account-page customer-info-page']//h1")
    private WebElement customerInfoPageTitle;
    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//input[@id='gender-female']")
    private WebElement femaleRadioButton;
    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstNameTextBox;
    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastNameTextBox;
    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailTextBox;
    @FindBy(xpath = "//input[@class='button-1 save-customer-info-button']")
    private WebElement saveCustomerInfoButton;
    @FindBy(xpath = "//div[@class='inputs']//span[@for='FirstName']")
    private WebElement firstNameIsRequiredError;
    @FindBy(xpath = "//div[@class='inputs']//span[@for='LastName']")
    private WebElement lastNameIsRequiredError;
    @FindBy(xpath = "//div[@class='inputs']//span[@for='Email']")
    private WebElement emailIsRequiredError;
}
