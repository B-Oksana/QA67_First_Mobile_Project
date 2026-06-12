package com.remindly.fw;

import com.remindly.core.BaseHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper {

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public boolean isNoReminderTextPresent() {
        return isElementPresent(By.id("com.blanyal.remindly:id/no_reminder_text"));
    }

    public void tapOnReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderPresent() {
        return isTextPresent(By.id("recycle_title"));
    }

    public void tapMoreOptions() {
        tap(By.xpath("//*[@content-desc=\"More options\"]"));
    }

    public void tapLicenses() {
        tap(By.xpath("//*[@resource-id=\"com.blanyal.remindly:id/title\"]"));
    }
}
