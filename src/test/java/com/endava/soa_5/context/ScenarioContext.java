package com.endava.soa_5.context;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private final Map<Keys, Object> context;
    private static ScenarioContext scenarioContext;

    private ScenarioContext() {
        context = new HashMap<Keys, Object>();
    }

    public static ScenarioContext getScenarioContext() {
        if (scenarioContext == null) {
            scenarioContext = new ScenarioContext();
        }
        return scenarioContext;
    }

    public void saveData(Keys key, Object value) {
        context.put(key, value);
    }

    public Object getData(Keys key) {
        return context.get(key);
    }

    public <T extends Object> T getData(Keys keys, Class<T> clazz){
       return clazz.cast(context.get(keys));
    }

    public void clearData() {
        context.clear();
    }
}
