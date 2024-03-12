package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

    @Test
    public void openBrowser() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
    }
}
