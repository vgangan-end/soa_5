package com.endava.soa_5.runner;

import com.endava.soa_5.JUnit_and_Hamcrest.MagicSquareTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({MagicSquareTest.class})
public class TestRunner {
}
