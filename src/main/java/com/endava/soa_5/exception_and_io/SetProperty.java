package com.endava.soa_5.exception_and_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SetProperty {
    private String result;
    private InputStream inputStream;
    private String fileProperties;
    private Properties properties;

    public SetProperty(String fileProperties) {
        this.fileProperties = fileProperties;
        result = new String();
        properties = new Properties();
    }

    public String getPropValues(String key) {

        try {
            inputStream = getClass().getClassLoader().getResourceAsStream(fileProperties);
            properties.load(inputStream);

            String controlValue = properties.getProperty(key);
            if (controlValue != null) {
                result = controlValue;
                inputStream.close();
            } else {
                return null;
            }
        } catch (NullPointerException | IOException exception) {
            exception.getStackTrace();
        }
        return result;
    }
}
