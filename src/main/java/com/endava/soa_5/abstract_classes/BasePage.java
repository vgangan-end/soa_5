package com.endava.soa_5.abstract_classes;

import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends BaseClass {
    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
