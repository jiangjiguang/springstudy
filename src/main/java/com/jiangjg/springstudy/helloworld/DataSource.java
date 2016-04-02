package com.jiangjg.springstudy.helloworld;

import java.util.Properties;

/**
 * Created by root on 16-4-2.
 */
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" + "properties=" + properties + '}';
    }
}
