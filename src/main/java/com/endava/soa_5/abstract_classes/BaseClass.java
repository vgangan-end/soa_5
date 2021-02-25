package com.endava.soa_5.abstract_classes;

import com.endava.soa_5.drivers.Driver;
import com.endava.soa_5.tools.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseClass {
    public WebDriver driver;
    public PropertyReader propertyReader;
    public BaseClass(){
        PageFactory.initElements(driver, this);
        propertyReader = Driver.getInstance().getPropertyReader();
        driver = Driver.getInstance().getDriver();
    }
}
