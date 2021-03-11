package com.endava.soa_5ed.tasks.task5_io.ex1;

import java.io.*;
import java.util.Properties;

public class PropertiesManager {
    String result;
    private Properties properties;

    public PropertiesManager(String filepath) {
        try {
            properties = readPropFile(filepath);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public Properties readPropFile(String filepath) throws IOException {
        FileInputStream inputStream = null;
        Properties prop = null;
        try {
            inputStream = new FileInputStream(filepath);
            prop = new Properties();
            prop.load(inputStream);
        } catch (FileNotFoundException fileNotFound) {
            System.out.println(fileNotFound.getMessage());
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        return prop;
    }

    public String getProperty(String key) throws NoValueException {
        result = properties.getProperty(key);
        if (result.isEmpty()) {
            throw new NoValueException("No value was found for " + key + " property");
        }
        return result;
    }
}
