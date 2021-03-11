package com.endava.soa_5ed.runner;

import com.endava.soa_5ed.workshop.junit_streams.PrimeManagerTest;
import com.endava.soa_5ed.workshop.junit_streams.ZooTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        PrimeManagerTest.class,
        ZooTest.class
})
public class RegressionRun {
}