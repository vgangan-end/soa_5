package com.endava.soa_5.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.endava.soa_5.cucumber.stepdef",
                "com.endava.soa_5.cucumber.hook"},
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"},
        tags = "not @Ignore"
)

public class TestRunner {
}

