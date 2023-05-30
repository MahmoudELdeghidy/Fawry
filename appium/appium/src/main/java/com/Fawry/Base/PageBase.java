package com.Fawry.Base;

import com.Fawry.Utils.ConfigUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class PageBase {
    protected static AndroidDriver driver;
    @Test
    public void setupTest() {
        File app = new File(ConfigUtils.getInstance().getAppPath());
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigUtils.getInstance().getPlatformName());
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigUtils.getInstance().getDeviceName());
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigUtils.getInstance().getPlatformVersion());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigUtils.getInstance().getAutomationName());
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        try {
            driver = new AndroidDriver(new URL(ConfigUtils.getInstance().getBaseUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
