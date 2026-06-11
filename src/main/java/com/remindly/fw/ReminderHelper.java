package com.remindly.fw;

import com.remindly.core.BaseHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ReminderHelper extends BaseHelper {
    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void enterReminderTitle(String text) {
        type(By.id("reminder_title"), text);
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }

    public void tapOnDateField() {
        tap(By.id("date"));
    }

    public void swipeToMonth(String period, String month, int swipeCount) {
        if (!getSelectedMonth().equals(month)) {
            for (int i = 0; i < swipeCount; i++) {
                if (period.equals("future")) {
                    swipe(0.8, 0.4);
                } else if (period.equals("past")) {
                    swipe(0.5, 0.9);
                }
            }
        }
    }
    private String getSelectedMonth() {
        return isTextPresent(By.id("date_picker_month"));
    }

}
