import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement dropCountryEle= driver.findElement(By.xpath("//select[@id='country-list']"));
        Select dropCountry= new Select(dropCountryEle);

        /*
        1. Selection option from dropdown
        dropCountry.selectByvisibleText
        dropCountry.selectByValue

         */
       // dropCountry.selectByVisibleText("France");
       // dropCountry.selectByValue("5");
       // dropCountry.selectByIndex(1);


        List<WebElement> options = dropCountry.getOptions();
        System.out.println("total number of options: "+options.size());

        for(int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }

    }
}
