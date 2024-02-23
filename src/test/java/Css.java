import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //css with tag id
         Thread.sleep(5000);
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
       // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook");

        //tag class
      //  driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("MacBook");
       // driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("MacBook");

        //tag  & atrribute
       driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Macbook");
       driver.findElement(By.cssSelector("[name='q']")).sendKeys("Apple");

// tag class and attribute
       // driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Macbook");
        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
    }
}


