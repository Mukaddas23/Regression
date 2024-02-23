import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // launch browser
        /*test case
        * launch browser
        * openURL Orange HRM
        * provide username
        * Provide password
        * click to submit
        * close browser*/
        //Open URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //provide username
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

       driver.findElement(By.xpath("//button[@type='submit']")).click();
       driver.close();

    }
}
