package com.endava.soa_5.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.endava.soa_5.tools.Constants.CONFIGURATION_FOLDER;

public class PropertyReader {
    private Properties properties;
    private InputStream inputStream;

    public PropertyReader(String fileName) {
        properties = new Properties();
        properties = loadConfiguration(fileName);
    }

    private Properties loadConfiguration(String fileName) {
        inputStream = getClass().getClassLoader().getResourceAsStream(CONFIGURATION_FOLDER + fileName);
        try {
            properties.load(inputStream);
        } catch (IOException | NullPointerException exception) {
            exception.printStackTrace();
        }
        return properties;
    }

    public String getPropertyValue(String key) {
        try {
            return properties.getProperty(key);
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException | NullPointerException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }
}
