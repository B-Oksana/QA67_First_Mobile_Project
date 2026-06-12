package com.remindly.tests;

import com.remindly.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

@Test
    public void appLaunchTest() {
    Assert.assertTrue(app.getMainScreenHelper().isNoReminderTextPresent());
}

@Test
    public void verifyLicense() {
    app.getMainScreenHelper().tapMoreOptions();
    app.getMainScreenHelper().tapLicenses();

    Assert.assertTrue(app.getMainScreenHelper()
            .isElementPresent(By.xpath("//*[@resource-id=\"com.blanyal.remindly:id/licenses_text_view\"]")));
}

}
