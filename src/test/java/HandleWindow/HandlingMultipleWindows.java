package HandleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlingMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space() ='OrangeHRM, Inc']")).click();
        Set<String> windowId =driver.getWindowHandles();//I store 2 windows

        //1 Approach
        List<String> windowsList =new ArrayList<>(windowId);
        String parentWindowId= windowsList.get(0);
        String childWindowId= windowsList.get(1);

        //Switch to child window
        driver.switchTo().window(childWindowId);
        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
         //Switch to parent
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.name("username")).sendKeys("Admin");

        //2 Approach
       /* for(String winid:windowId){
            String title  = driver.switchTo().window(winid).getTitle();
            if(title.equalsIgnoreCase("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")){
                driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
            }

        }*/
        Thread.sleep(5000);
        for(String winid:windowId) {
            String title = driver.switchTo().window(winid).getTitle();
            if (title.equalsIgnoreCase("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
                driver.close();
            }


        }
    }
}
