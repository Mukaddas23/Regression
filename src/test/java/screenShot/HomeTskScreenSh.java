package screenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HomeTskScreenSh {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        /*WebElement title= driver.findElement(By.xpath("//img[@alt='client brand banner']"));
        File scr = title.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\test\\java\\screenShot\\file1.png");
        FileUtils.copyFile(scr,trg);*/

        WebElement stranger= driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']"));
        File scr1 = stranger.getScreenshotAs(OutputType.FILE); // Take a screenshot of the WebElement
        // Specify the destination path for the screenshot
        File trg1 = new File("C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\test\\java\\screenShot\\file1.png");
        FileUtils.copyFile(scr1,trg1);// Copy the screenshot to the specified destination


        TakesScreenshot webPage= (TakesScreenshot) driver;
        File scr3=webPage.getScreenshotAs(OutputType.FILE);
        File trg3 = new File("C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\test\\java\\screenShot\\file1.png");
        FileUtils.copyFile(scr3,trg3);
    }
}
