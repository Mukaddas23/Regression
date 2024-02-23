package javaScriptActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocationOfElement {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
        System.out.println("Before maximizing window "+logo.getLocation());

        driver.manage().window().maximize();
        System.out.println("After maximizing window "+logo.getLocation());

        driver.manage().window().fullscreen();
        System.out.println("After full screen " +logo.getLocation());

        Point p = new Point(125,125);
        driver.manage().window().setPosition(p);
        System.out.println("After setting point 125X125 " +logo.getLocation());
        driver.close();
    }
}
