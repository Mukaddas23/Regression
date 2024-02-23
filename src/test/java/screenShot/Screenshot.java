package screenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Capture full page screenshot
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
       File trg= new File("C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\test\\java\\screenShot\\file.png");
        FileUtils.copyFile(src,trg);

        //Screenshot specific  area
        WebElement featureFile=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File src1= featureFile.getScreenshotAs(OutputType.FILE);
        File trg1= new File("C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\test\\java\\screenShot\\file.png" );
        FileUtils.copyFile(src1,trg1);
    }
}
