import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.time.Duration.*;

public class DropDownWithoutSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));

        //clicking on the dropdown
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
       List<WebElement> options = driver.findElements(By.xpath( "//ul[contains(@class,'multiselect')]//label"));
         //find total number of options
        System.out.println("total number of  options:" +options.size());

        //get text
        for(int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }


        for(int i=0;i<options.size();i++){
            String option = options.get(i).getText();
            if(option.equals("Java") || option.equals("Python")){
                options.get(i).click();
            }
        }

      //driver.quit();



    }
}
