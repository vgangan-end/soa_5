package com.endava.soa_5.page_objects.MyAccountPage;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MyAccountModule extends BaseClass {

    @FindBy(xpath = "//div[@class='title']/strong")
    private WebElement title;
    @FindBy(xpath = "//a[contains(@href,'/customer/info')]")
    private WebElement customerInfoButton;
    @FindBy(xpath = "//a[contains(@href,'/customer/addresses')]")
    private WebElement addressesButton;
    @FindBy(xpath = "//a[contains(@href,'/customer/orders')]")
    private WebElement ordersButton;
    @FindBy(xpath = "//a[contains(@href,'/customer/downloadableproducts')]")
    private WebElement downloadableProductsButton;
    @FindBy(xpath = "//a[contains(@href,'/customer/backinstocksubscriptions')]")
    private WebElement backInStockSubscriptionsButton;
    @FindBy(xpath = "//a[contains(@href,'/customer/rewardpoints')]")
    private WebElement rewardPoints;
    @FindBy(xpath = "//a[contains(@href,'/customer/changepassword')]")
    private WebElement changePassword;
}
