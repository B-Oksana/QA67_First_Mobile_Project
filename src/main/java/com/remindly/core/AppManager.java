package com.remindly.core;

import com.remindly.fw.MainScreenHelper;
import com.remindly.fw.ReminderHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppManager {
    AppiumDriver driver;
    DesiredCapabilities capabilities;

    MainScreenHelper mainScreenHelper;
    ReminderHelper reminderHelper;

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UIAutomator2");
        capabilities.setCapability("appium:platformVersion", "10");
        capabilities.setCapability("appium:deviceName", "mob");
        capabilities.setCapability("appium:appPackage", "com.blanyal.remindly");
        capabilities.setCapability("appium:appActivity", "com.blanyal.remindme.MainActivity");

        capabilities.setCapability("appium:app", "C:/Mobile/Remindly1.1.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainScreenHelper = new MainScreenHelper(driver);
        reminderHelper = new ReminderHelper(driver);
    }

    public MainScreenHelper getMainScreenHelper() {
        return mainScreenHelper;
    }

    public ReminderHelper getReminderHelper() {
        return reminderHelper;
    }

    public void stop() {
        driver.quit();
    }


}
