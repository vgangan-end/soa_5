package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.page_objects.enums.RegisterPageEnum;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

@Getter
public class RegisterPage extends BaseClass {

    private @FindBy(css = "#gender-male")
    WebElement maleRadioButton;
    private @FindBy(css = "#gender-female")
    WebElement femaleRadioButton;
    private @FindBy(css = "#FirstName")
    WebElement firstName;
    private @FindBy(css = "#LastName")
    WebElement lastName;
    private @FindBy(css = "#Email")
    WebElement email;
    private @FindBy(css = "#Password")
    WebElement password;
    private @FindBy(css = "#ConfirmPassword")
    WebElement confirmPassword;
    private @FindBy(css = "#register-button")
    WebElement registerButton;

    public WebElement getRegisterElement(String cssButtonName) {
        return driver.findElement(By.cssSelector(cssButtonName));
    }

    public void fillRegisterForm(Map<RegisterPageEnum, String> data) {
        for (Map.Entry<RegisterPageEnum, String> registerPageElementsStringEntry : data.entrySet()) {
            getRegisterElement(registerPageElementsStringEntry.getKey().getCss()).sendKeys(registerPageElementsStringEntry.getValue());
        }
    }
}
