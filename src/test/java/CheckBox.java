import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        List<WebElement> box = driver.findElements(By.xpath("//input[@type='checkbox']"));

        //index starts from 0

       /* for (int i=0;i<box.size();i++){
            box.get(i).click();
        }
        for (int i=0;i<box.size();i++) {
            if (i < 1) {
                box.get(i).click();
            }
        }*/

       /* for (int i=0;i<box.size();i++) {

            box.get(i).click();}
        Thread.sleep(4000);

        for (int i=0;i<box.size();i++) {

            box.get(i).click();}*/
        Thread.sleep(4000);
        for (int i=0;i<box.size();i++) {
            if(box.get(i).isSelected()){
            box.get(i).click();}
        }
    }
}
