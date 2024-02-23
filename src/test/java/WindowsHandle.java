import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowsHandle {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        // capture id's for browser window
        Set<String > windowIDs= driver.getWindowHandles();
        List<String> windowList =new ArrayList<>(windowIDs);

        String parentWindowID = windowList.get(0);
        String childWindowID= windowList.get(1);

        // Switch to Child window
        driver.switchTo().window(childWindowID);
    }
}
