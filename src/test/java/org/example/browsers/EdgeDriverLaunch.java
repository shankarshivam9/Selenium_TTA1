package org.example.browsers;

import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Owner("Shankar")



public class EdgeDriverLaunch {
    @Test(priority = 1,enabled = true,description = "Launch Edge Browser",
            groups = {"Regression"},invocationCount = 1,
            invocationTimeOut = 10,threadPoolSize = 1,successPercentage = 100,
            alwaysRun = true,dependsOnGroups = {"Smoke"}, dependsOnMethods = {"launchChromeBrowser"}
    )
    public void LaunchEdgeBrowser() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}
