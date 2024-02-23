package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement drop = driver.findElement(By.xpath("//input[@id='field1']"));
        Actions act = new Actions(driver);
        drop.clear();
        drop.sendKeys("Welcome");
        act.doubleClick(drop).perform();

        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        act.doubleClick(button).perform();

        //Validation
        WebElement box2 =driver.findElement(By.xpath("//input[@id='field2']"));
        String copyText= box2.getAttribute("value");
        System.out.println(copyText);
        if(copyText.equals("Welcome")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

    }
}
