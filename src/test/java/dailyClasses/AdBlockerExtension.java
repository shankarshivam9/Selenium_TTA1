package dailyClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AdBlockerExtension {

    //ad AdBlocker extension in the browser
    //ad blocker for edge download - crx file

    @Test
    public void adBlockerExtension() {
        WebDriver driver = new EdgeDriver();
    //    driver.get("www.youtube.com");
    driver.get("https://www.youtube.com/");

    }
}
