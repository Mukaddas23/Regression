import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class HomeTaskFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");

        WebElement frm3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frm3);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[text()='Choose']")).click();
        Thread.sleep(5000);

        List<WebElement> text = driver.findElements(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf OIC90c LMgvRb']//span"));

        System.out.println(text.size());


        for(int i=0;i < text.size();i++){
            String text1= text.get(i).getText();
            if(text1.equals("Yes")){
                text.get(i).click();
            }
        }

       /* for(int i=0;i<text.size();i++){
            String text1 =  text.get(i).getText();
            if(text1.equals("Well, now I know :-)")){
                text.get(i).click();
            }
        }*/



    }
}
