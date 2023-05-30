package com.Fawry.Utils;

import java.util.Properties;

public class ConfigUtils {
    private static Properties properties;
    private static ConfigUtils configUtils;

    private ConfigUtils() {
        properties =
                PropertiesUtils.LoadProperties("src/main/resources/Config/Data.properties");
    }

    public static ConfigUtils getInstance() {
        if (configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }
    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find base URL in Property file");
    }
    public String getAppPath() {
        String prop = properties.getProperty("appPath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find App path in Property file");
    }
    public String getPlatformName() {
        String prop = properties.getProperty("platformName");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find platform Name in Property file");
    }
    public String getDeviceName() {
        String prop = properties.getProperty("deviceName");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find device name in Property file");
    }
    public String getPlatformVersion() {
        String prop = properties.getProperty("platformVersion");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find platform Version in Property file");
    }
    public String getAutomationName() {
        String prop = properties.getProperty("automationName");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find automation Name in Property file");
    }
    public String getUsernameFieldXpath() {
        String prop = properties.getProperty("usernameFieldXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find username Field Xpath in Property file");
    }
    public String getPasswordFieldXpath() {
        String prop = properties.getProperty("passwordFieldXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find password Field Xpath in Property file");
    }
    public String getLoginButtonXpath() {
        String prop = properties.getProperty("loginButtonXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find login Button Xpath in Property file");
    }
    public String getValidUsername() {
        String prop = properties.getProperty("validUsername");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find valid Username in Property file");
    }
    public String getValidPassword() {
        String prop = properties.getProperty("validPassword");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find valid password in Property file");
    }
    public String getInvalidPassword() {
        String prop = properties.getProperty("invalidPassword");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find valid password in Property file");
    }
    public String getCalcXpath() {
        String prop = properties.getProperty("calcXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find calc Xpath in Property file");
    }
    public String getButton5Xpath() {
        String prop = properties.getProperty("button5Xpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find button 5 Xpath Xpath in Property file");
    }
    public String getButton6Xpath() {
        String prop = properties.getProperty("button6xpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find button 6 Xpath Xpath in Property file");
    }
    public String getPlusButtonXpath() {
        String prop = properties.getProperty("plusButtonXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find Plus button Xpath Xpath in Property file");
    }
    public String getEqualButtonXpath() {
        String prop = properties.getProperty("equalButtonXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find equal button Xpath Xpath in Property file");
    }
    public String getResultXpath() {
        String prop = properties.getProperty("resultXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find equal button Xpath Xpath in Property file");
    }
    public String getMultiXpath() {
        String prop = properties.getProperty("multiXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find Multi button Xpath Xpath in Property file");
    }
    public String getHistoryXpath() {
        String prop = properties.getProperty("historyXpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find Multi button Xpath Xpath in Property file");
    }
    public String getDeleteXpath() {
        String prop = properties.getProperty("deleteButton");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find delete button Xpath Xpath in Property file");
    }
    public String getCheckBox1Xpath() {
        String prop = properties.getProperty("checkBox1Xpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find checkBox1 button Xpath Xpath in Property file");
    }
    public String getCheckBox2Xpath() {
        String prop = properties.getProperty("checkBox2Xpath");
        if (prop != null) return prop;
        else
            throw new RuntimeException("Couldn't find checkBox2 button Xpath Xpath in Property file");
    }

}
