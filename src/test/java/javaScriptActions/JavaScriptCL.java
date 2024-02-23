package javaScriptActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptCL {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
      /*  JavascriptExecutor executor=(JavascriptExecutor) driver;
        WebElement address= driver.findElement(By.id("textarea"));

        executor.executeScript("arguments[0].value='8820 Sandra ave';", address);
        WebElement phone =driver.findElement(By.id("phone"));
        executor.executeScript("arguments[0].value='abcdefg.com';email");*/

        WebElement address = driver.findElement(By.id("textarea"));
        JavascriptExecutor excutor=(JavascriptExecutor)driver;
        excutor.executeScript("arguments[0].value='5645 Merlin ave';", address);
        WebElement phone = driver.findElement(By.id("phone"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        excutor.executeScript("arguments[0].value='7089996633';", phone);
        WebElement email = driver.findElement(By.id("email"));
        JavascriptExecutor executor1=(JavascriptExecutor)driver;
        excutor.executeScript("arguments[0].value='abcdefg';", email);




    }
}
