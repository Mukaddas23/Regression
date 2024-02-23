package javaScriptActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        Actions actions= new Actions(driver);
        actions.click(searchBar).build().perform();
        Thread.sleep(3000);
        actions.keyDown(Keys.SHIFT).build().perform();
        actions.sendKeys("selenium").build().perform();
        Thread.sleep(1000);
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions.keyUp(Keys.SHIFT).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        System.out.println("done");


    }
}
