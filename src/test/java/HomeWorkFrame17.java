import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
;

import java.time.Duration;
import java.util.List;

public class HomeWorkFrame17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
        driver.switchTo().frame(element);
        driver.findElement(By.id("current_filter")).click();
        List<WebElement> element3 = driver.findElements(By.xpath("//span[@id='current_filter']//following-sibling::ul//li"));


         for (int i = 0; i < element3.size(); i++) {
            if (element3.get(i).getText().equalsIgnoreCase("Automation")) {
                element3.get(i).click();
                break;
            }
            }

        }
    }
