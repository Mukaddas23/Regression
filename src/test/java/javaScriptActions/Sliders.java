package javaScriptActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act =new Actions(driver);
       WebElement minSlider= driver.findElement(By.xpath("//span[1]"));
        System.out.println("Current location of min slider "+minSlider.getLocation());
        act.dragAndDropBy(minSlider,100, 100).perform();

        WebElement maxSlider= driver.findElement(By.xpath("//span[2]"));
        System.out.println("Current location of max slider "+maxSlider.getLocation());
        act.dragAndDropBy(maxSlider,-90, 190).perform();
        System.out.println("Location of after max slider moves "+ maxSlider.getLocation());



    }
}
