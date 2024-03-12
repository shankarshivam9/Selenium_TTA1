package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

    @Test
    public void openBrowser() {
        WebDriver driver = new EdgeDriver(); // This allow all WebDriver methods
//        EdgeDriver driver = new EdgeDriver(); // This allow only EdgeDriver methods
        driver.get("https://www.google.com");

        //Selenium - 4  ==> Most of the companies using Selenium 4 version - Automatic browser management

       /* Selenium Manager automatically discovers, downloads, and caches the browsers driven with Selenium
        (Chrome, Firefox, and Edge)when these browsers are not installed in the local system.As of Selenium 4.11.
        0, Selenium Manager also implements automated browser management.*/

        /*searchContext(Interface) --> WebDriver(Interface) -->
        RemoteWebDriver(Class) --> Chromiumdriver(class) --> EdgeDriver(class)*/
    }
}
