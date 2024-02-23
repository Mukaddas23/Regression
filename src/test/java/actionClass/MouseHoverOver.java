package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();


       /* WebElement desktop =  driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));

        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
         Thread.sleep(5000);


         Actions act = new Actions(driver);
       // act.moveToElement(desktop).moveToElement(mac).click().build().perform();
        act.moveToElement(desktop).moveToElement(mac).click().perform();*/

        WebElement cameras =  driver.findElement(By.xpath("//a[normalize-space()='Cameras']"));
        WebElement  nikon =  driver.findElement(By.xpath("//img[@class='img-fluid']"));

        Thread.sleep(5000);

       Actions act1 = new Actions(driver);

        //act1.moveToElement(cameras).click().moveToElement(nikon).perform();
       act1.moveToElement(cameras).click().contextClick(nikon).click().build().perform();




    }
}
