package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDown {

    @Test
    public void dropDown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*WebDriver will wait up to 10 seconds for the element to appear before
         throwing a NoSuchElementException. This line sets the implicit wait to 10 seconds
        for the entire lifespan of the driver instance*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://trytestingthis.netlify.app/");
        WebElement dropdown = driver.findElement(By.id("option"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        Thread.sleep(1000);

        select.selectByValue("option 2");
        Thread.sleep(1000);

        select.selectByVisibleText("Option 3");
        Thread.sleep(2000); // 2 second

        driver.quit();
        System.out.println("Done..");

       /* Explicit wait in Selenium will throw a TimeoutException if the specified condition
       is not met within the specified timeout period.*/

        //dropdown
        //select class
        //selectByIndex
        //selectByValue
        //selectByVisibleText

        //deselctByIndex
        //deselectByValue
        //deselectByVisibleText
        //deselectAll

    }
}
