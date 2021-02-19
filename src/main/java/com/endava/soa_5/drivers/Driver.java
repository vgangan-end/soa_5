package com.endava.soa_5.drivers;

import com.endava.soa_5.tools.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collections;

import static com.endava.soa_5.tools.Constants.PROPERTY_FILE_NAME;

public class Driver {

    private static final Driver INSTANCE = new Driver();
    private WebDriver driver;

    private Driver() {
        PropertyReader propertyReader = new PropertyReader(PROPERTY_FILE_NAME);
        final String BROWSER = propertyReader.getPropertyValue("browser").toLowerCase();
        if (driver == null) {
            switch (BROWSER) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(addChromeOptions());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().deleteAllCookies();
                    break;
                default:
                    throw new RuntimeException("Incorrect browser definition in property file");
            }
        }
    }

    public static Driver getInstance() {
        return INSTANCE;
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public ChromeOptions addChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        //Hide "Chrome is being controlled by automated software" infobar
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        return options;
    }
}
