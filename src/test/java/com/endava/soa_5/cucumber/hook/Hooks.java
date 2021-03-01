package com.endava.soa_5.cucumber.hook;

import com.endava.soa_5.abstract_classes.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.String.format;

public class Hooks extends BaseClass {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Before
    public void beforeScenario(Scenario scenario) {
        driver.get(propertyReader.getPropertyValue("url"));
        log.info("--------------------- START OF SCENARIO --------------------");
        log.info("********************* " + scenario.getName() + " *********************");
    }

    @After
    public void afterScenario(Scenario scenario) {
        log.info("--------------------- END OF SCENARIO --------------------");
        log.info(format("ENDING TEST: [%s] %s ", scenario.getStatus().toString().toUpperCase(), scenario.getName()));
        driver.manage().deleteAllCookies();
    }
}