package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UploadFile {

    @Test
    public void uploadFile() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement upload_file = driver.findElement(By.xpath("//input[@id='fileToUpload']"));

        upload_file.sendKeys("C:\\Users\\Dell\\OneDrive\\Pictures\\img1.JPG");
        driver.findElement(By.name("submit")).click();

    }
}
