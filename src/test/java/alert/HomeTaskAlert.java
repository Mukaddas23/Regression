package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeTaskAlert {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alertWindow= driver.switchTo().alert();
        System.out.println(alertWindow.getText());
        alertWindow.accept();
        String act_text=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        String exp_text= "You successfully clicked an alert";
        System.out.println(act_text);
        System.out.println(exp_text);
        if(act_text.equals(exp_text)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
    }
}
