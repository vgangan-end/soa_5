package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class JewelryPage extends BaseClass {
    @FindBy(xpath = "//a[contains(text(),'Diamond Pave Earrings')]")
    private WebElement diamondEarrings;
    @FindBy(xpath = "//a[contains(text(),'Black & White Diamond Heart')]")
    private WebElement diamondHeart;
    @FindBy(xpath = "//a[contains(text(),'Diamond Tennis Bracelet')]")
    private WebElement diamondBracelet;
    @FindBy(xpath = "//a[contains(text(),'Vintage Style Three Stone Diamond Engagement Ring')]")
    private WebElement diamondRing;
    @FindBy(xpath = "//a[contains(text(),'Create Your Own Jewelry')]")
    private WebElement customJewelry;
    @FindBy(xpath = "//input[contains(@onclick,'catalog/71/')]")
    private WebElement customJewelryAddToCartButton;
    @FindBy(xpath = "//input[contains(@onclick,'catalog/14/')]")
    private WebElement diamondHeartAddToCartButton;
}
