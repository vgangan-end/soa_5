package com.endava.soa_5.cucumber.hook;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.String.format;

public class Hooks {
    Logger log = LoggerFactory.getLogger(Hooks.class);

    @BeforeEach
    public void beforeScenario(Scenario scenario) {
        String scenarioName = scenario.getName();
        log.info("---------------------START OF SCENARIO--------------------");
        log.info("*********************" + scenarioName + "*********************");
    }

    @After
    public void afterScenario(Scenario scenario) {
        Status scenarioStatus = scenario.getStatus();
        log.info("---------------------END OF SCENARIO--------------------");
        log.info(format("ENDING TEST: [%s] %s ", scenario.getStatus().toString().toUpperCase(), scenario.getName()));
//        log.info("*********************" + scenarioStatus + "*********************");
    }
}