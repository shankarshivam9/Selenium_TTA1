package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsKeys {

    @Test
    public void actionsKeys() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        WebElement userId = driver.findElement(By.id("input-email"));
        WebElement password = driver.findElement(By.id("input-password"));
        userId.sendKeys("shankar123@gmail.com");
        password.sendKeys("password123");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();

    }
}
