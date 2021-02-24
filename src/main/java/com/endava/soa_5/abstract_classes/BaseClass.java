package com.endava.soa_5.abstract_classes;

import com.endava.soa_5.drivers.Driver;
import com.endava.soa_5.tools.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseClass {
    public WebDriver driver = Driver.getInstance().getDriver();
    public PropertyReader propertyReader = Driver.getInstance().getPropertyReader();
}
