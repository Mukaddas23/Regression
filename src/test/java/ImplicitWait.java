import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    /*
    wait statement will be used to solve synchronization issue in automation:
    * Implicit wait
    * Explicit wait
    * Thread.sleep= it is Java function


    sleep: It provides by Java (It is not Selenium command)
    adv.
    1.easy to use
    disadvantages:
    2.if time not sufficient then you will get an exception
    Thread.sleep(5000);
    1. it will wait for maximum time, and this will reduce performance script.
    2.you have to write multiple time of element available
    3.easy to use
    dis
    1.if the time is not sufficient then you will get an exception
    * */

    /*Implicit Wait-
    adv.
    1.write 1 time and its applicable to every sync on the page
    2.it will not wait till max time of element */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("admin123");


        //Thread.sleep(5000);
    }
}
