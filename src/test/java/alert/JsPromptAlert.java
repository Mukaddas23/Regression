package alert;

import io.opentelemetry.api.internal.ApiUsageLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JsPromptAlert {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alertWindow= driver.switchTo().alert();

        System.out.println("AlertText: " + alertWindow.getText());
        alertWindow.sendKeys("We will all get jobs, Code Crushers!");
        alertWindow.accept();
        String act_text=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        String exp_text= "You entered: We will all get jobs, Code Crushers!";

        if (act_text.equals(exp_text)) {
            System.out.println("Test Passed! Actual text matches expected text.");
        } else {
            System.out.println("Test Failed! Actual text does not match expected text.");
        }


         //driver.close();

    }
}
