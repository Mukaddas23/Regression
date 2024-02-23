import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLinkText {
    public static void main(String[] args) throws InterruptedException {
        /*
        * findElement-single element
        * findElements-multipleElements
        * findelement =webelement
        * findElements=List<webElement>
        */
        WebDriver driver=new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2013/09/testing.html?");
       //Thread.sleep(5000);
        driver.findElement(By.name("fname")).sendKeys("Apple");
      //  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Cucumber");
       // driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Fruit");
       //driver.findElement(By.xpath("//*[@id=\"post-body-7114928646577071695\"]/div[1]/div[1]/form[1]/input[2]")).sendKeys("Fruit");

    }
}
