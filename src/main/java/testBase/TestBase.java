package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import reusableComponents.PropertiesOperations;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public void LaunchBrowserAndNavigate() {
        //read prop file and get browser and url
        String browser = PropertiesOperations.getPropertiesValueByKey("browser");
        String url = PropertiesOperations.getPropertiesValueByKey("url");


        if (browser.equalsIgnoreCase("chrome")) {
            //launch chrome
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            //launch firefox|
            System.out.println("firefox");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            //launch edge
            driver = new EdgeDriver();
            System.out.println("edge");
        } else {
            System.out.println("Invalid browser");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(url);
    }
}