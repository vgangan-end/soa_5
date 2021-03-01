package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BaseClass {

    private @FindBy(xpath = "//a[contains(text(), 'Computers')]")
    WebElement computersButton;
    private @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerButton;
    private @FindBy(xpath = "//li[@id='topcartlink']/a[@class='ico-cart']")
    WebElement shoppingCartButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Books')]")
    WebElement booksButton;
    private @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(), 'Jewelry')]")
    WebElement jewelryButton;
}