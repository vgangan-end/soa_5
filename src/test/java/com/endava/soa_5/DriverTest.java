package com.endava.soa_5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DriverTest {
    WebDriver driver = Driver.getInstance().getDriver();
    Driver instance1 = Driver.getInstance();
    Driver instance2 = Driver.getInstance();

    @Test
    void CheckGetDriver(){
        String name = driver.toString().toLowerCase().substring(0,6);
        assertThat(name, is("chrome"));
    }
    @Test
    void ChechGetDriverInstance(){
        assertThat("Check that there is only one instance of the driver", instance1, is(instance2));
    }
}
