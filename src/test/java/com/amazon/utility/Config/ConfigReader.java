package com.amazon.utility.Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    static {
        try (InputStream in = new FileInputStream("configuration.properties")) {
            properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to load properties file");
        }
    }

    /**
     * @param key browser, url
     * @return return the value of the key from configuration.properties
     */
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
