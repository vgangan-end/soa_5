package com.endava.soa_5.abstract_classes;

import com.endava.soa_5.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseClass {
    WebDriver driver = Driver.getInstance().getDriver();
}
