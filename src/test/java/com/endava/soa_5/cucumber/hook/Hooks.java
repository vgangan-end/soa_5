package com.endava.soa_5.cucumber.hook;

import com.endava.soa_5.abstract_classes.BaseAction;
import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.context.ScenarioContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

import static java.lang.String.format;

public class Hooks extends BaseAction {
    ScenarioContext context = ScenarioContext.getScenarioContext();

    @Before
    public void beforeScenario(Scenario scenario) {
        String scenarioName = scenario.getName();
        log.info("---------------------START OF SCENARIO--------------------");
        log.info("*********************" + scenarioName + "*********************");
        driver.get(propertyReader.getPropertyValue("url"));
    }

    @After
    public void afterScenario(Scenario scenario) {
        Status scenarioStatus = scenario.getStatus();
        log.info("---------------------END OF SCENARIO--------------------");
        log.info(format("ENDING TEST: [%s] %s ", scenario.getStatus().toString().toUpperCase(), scenario.getName()));
    }
}