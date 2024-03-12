package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownListLooping {

    @Test
    public void dropDownList() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://trytestingthis.netlify.app/");
        WebElement dropdown = driver.findElement(By.id("option"));
        Select select = new Select(dropdown);
        List<WebElement> list = select.getOptions(); // returns all dropdown options

        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().equalsIgnoreCase("option 2")) {
                options.click();
                Thread.sleep(2000);
            }
            System.out.println("Done...");
        }
    }
}