package browsers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsDemo {

    @Test
    public void chromeOptionsTest(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER); //EAGER, NONE, NORMAL
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }
}
