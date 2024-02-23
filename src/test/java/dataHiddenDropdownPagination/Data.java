package dataHiddenDropdownPagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Data {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        //Approach 1
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("19/01/2024");

        //Approach 2
        String year = "2024";
        String month = "October";
        String date = "21";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //select month & year
        while (true) {
            String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();


            if (mon.equals(month) && yr.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }
}

