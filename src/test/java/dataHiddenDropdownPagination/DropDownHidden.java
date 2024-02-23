package dataHiddenDropdownPagination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DropDownHidden {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement pm = driver.findElement(By.xpath("//span[text()='PIM']"));
        executor.executeScript("arguments[0].click()",pm);

        //Dropdown

        driver.findElement(By.xpath("//label[text()='Job Title']/../..//div[text()='-- Select --']")).click();
        List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("List of events" +options.size());


        for(WebElement option:options){
            if(option.getText().equals("QA Engineer")){
                option.click();
                break;
            }
        }
        }


    }

