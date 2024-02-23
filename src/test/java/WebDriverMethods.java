import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
    /*
       get method
       conditional method
       Browser methods
       Navigational Methods
       wait method
       get;
       URL();
       getTitle();
       getCurrentURL();
       getWindowhandle();
       getWindowHandles();

       Conditional Methods: return boolean
       isDisPlayed(); true/false

       isEbnabled();
       isSelected();

       close();
       quit();
     */
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        System.out.println("title of page " +driver.getTitle());
        driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Get current url"+driver.getCurrentUrl());
        String ps=driver.getPageSource();
        System.out.println(ps);
        System.out.println(ps.contains("html"));
    }
}
