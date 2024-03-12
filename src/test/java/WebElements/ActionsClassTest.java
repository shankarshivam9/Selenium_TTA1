package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsClassTest {

    @Test
    public void actionsClass() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://omayo.blogspot.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("blogsmenu"))).perform();
        WebElement menuOption = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));
        actions.moveToElement(menuOption).click().build().perform();


    }
}
