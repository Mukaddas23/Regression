import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("display status of logo"+logo.isDisplayed());
        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(status);

        WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println(" is display"+searchbox.isDisplayed());
        System.out.println("is enabled"+searchbox.isEnabled());


        Thread.sleep(5000);
        WebElement ap = driver.findElement(By.xpath("https://demo.nopcommerce.com/clothing"));
        System.out.println(ap.isSelected());

    }
}
