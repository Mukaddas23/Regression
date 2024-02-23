import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class HomeTaskSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
        Thread.sleep(5000);

        List<WebElement> searchResults = driver.findElements(By.xpath("(//div[@class='wM6W7d'])[2]"));
      //  List<WebElement> searchResults = driver.findElements(By.xpath("(//div[@class='wM6W7d'])[3]"));



       System.out.println(searchResults.size());



       /* for(int i=0;i < searchResults.size();i++){
            String searchResults1= searchResults.get(i).getText();
            if(searchResults1.equals("selenium supplement")){
                searchResults.get(i).click();
            }
        }*/
        for(int i=0;i < searchResults.size();i++){
            String searchResults1= searchResults.get(i).getText();
            if(searchResults1.equals("selenium benefits")){
                searchResults.get(i).click();
            }
        }
        //driver.quit();
        }
    }

