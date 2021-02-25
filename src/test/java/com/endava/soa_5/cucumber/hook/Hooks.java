package com.endava.soa_5.cucumber.hook;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.context.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.String.format;

public class Hooks extends BaseClass {
    ScenarioContext context = ScenarioContext.getScenarioContext();
    static Logger log = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void beforeScenario(Scenario scenario) {
//        context.saveData(Keys.DRIVER, driver);
        String scenarioName = scenario.getName();
        driver.get(propertyReader.getPropertyValue("url"));
        log.info("---------------------START OF SCENARIO--------------------");
        log.info("*********************" + scenarioName + "*********************");

    }

    @After
    public void afterScenario(Scenario scenario) {
        log.info("---------------------END OF SCENARIO--------------------");
        log.info(format("ENDING TEST: [%s] %s ", scenario.getStatus().toString().toUpperCase(), scenario.getName()));
    }
}