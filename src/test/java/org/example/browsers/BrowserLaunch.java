package org.example.browsers;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.TestBase;

public class BrowserLaunch extends TestBase {

    @Test
    @Owner("Shankar")
    @Description("Launch Edge Browser")
    public void launchEdgeBrowser() {
        LaunchBrowserAndNavigate();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
