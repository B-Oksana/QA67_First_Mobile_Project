package com.remindly.tests;

import com.remindly.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getMainScreenHelper().tapOnReminder();
        app.getReminderHelper().enterReminderTitle("Test");
    }

    @Test
    public void addReminderTitle() {
        app.getReminderHelper().saveReminder();

        Assert.assertTrue(app.getMainScreenHelper().isReminderPresent().contains("Test"));
    }

    @Test
    public void addReminderDate() {
        app.getReminderHelper().tapOnDateField();
        app.getReminderHelper().swipeToMonth();
        app.getReminderHelper().selectDate();
        app.getReminderHelper().tapOnYear();
        app.getReminderHelper().swipeToYear();
        app.getReminderHelper().tapOnOk();
        app.getReminderHelper().saveReminder();

        Assert.assertTrue(app.getMainScreenHelper().isReminderDateTime().contaons("3/8/27"));
    }
}
