package com.endava.soa_5.tools;

import com.google.common.base.Strings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class PropertyReaderTest {
    PropertyReader propertyReader;

    @BeforeEach
    void setUp() {
        propertyReader = new PropertyReader("TestConfiguration.properties");
    }

    @Test
    void CheckGetPropertyValue() {
        assertThat("Check that url value is picked from Configuration.properties file.", propertyReader.getPropertyValue("url"), is("http://demowebshop.tricentis.com/"));
    }

    @Test
    void CheckGetPropertyEmptyValue() {
        assertThat("Check that emptyParameter parameter is picked from Configuration.properties file.", Strings.isNullOrEmpty(propertyReader.getPropertyValue("emptyParameter")), is(true));
    }

    @Test
    void CheckGetPropertyValueNonExistingValue() {
        assertThat("Check that nonExistentValue parameter is picked from Configuration.properties file.", Strings.isNullOrEmpty(propertyReader.getPropertyValue("nonExistentValue")), is(true));
    }
}