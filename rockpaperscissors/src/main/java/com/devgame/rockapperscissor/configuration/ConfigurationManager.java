package com.devgame.rockapperscissor.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigurationManager.class.getClassLoader().getResourceAsStream("properties")) {
            if (input == null) {
                System.out.println("Not able to find properties file.");
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static int getIntProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }
}

