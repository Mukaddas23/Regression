import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    /*
    XPath is address of element in a DOM
    * Absolute xpath-/html/body/div[6]/div[1]/div[2]/div[2]/form/input. This is direct way to find an element;starting from root of the HTML
    and specifying the complete path to the element. It is not flexible, can be change as structure
    web page will change.
    *
    *
    *
    * Relative xpath
    It starts at a specific element and navigates through the DOM hierarchy.

    XPath with contains://tagname[contains(attribute,'value')],we use contains keyword when we have
    partial linked text

    partial linked text  //*[contains(attribute,'value')]

    use and: //tag[@attribute = 'value' and @attribute='value'], complex expression

    Xpath text(): the text function locates elements based on the exact text of a web element. it is useful finding
    elements contain specific text string
     //taq[text()='value']
    //*[text()='value']
    *
    //input[@id = 'small-searchterms']
     */
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");

        driver.findElement(By.xpath("/html/body/div[4]/div/header/table/tbody/tr/td[5]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("laptop");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'and@role='presentation'])[1]")).click();

      // driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/a/div/span")).click();//absolute xpath works
       // driver.findElement(By.xpath("//input[@id='gh-ac']")).click();//Rayhon
       driver.findElement(By.xpath("//*[@id=\"item599dc07b2a\"]/div/div[2]/a/div/span")).click();// relative Xpath I found finally

       driver.quit();
    }
}
