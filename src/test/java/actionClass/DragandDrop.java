package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();


        WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
        WebElement rome= driver.findElement(By.xpath("//div[@id='box6']"));

        Actions act = new Actions(driver);
        act.dragAndDrop(rome,italy).perform();

        WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
        WebElement copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));

        Actions act1 = new Actions(driver);
        act.dragAndDrop( copenhagen,denmark).perform();

        WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
        WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));

        Actions act2 = new Actions(driver);
        act.dragAndDrop(oslo ,norway).perform();

        WebElement southKorea = driver.findElement(By.xpath("//div[@id='box105']"));
        WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));

        Actions act3 = new Actions(driver);
        act.dragAndDrop(seoul ,southKorea).perform();

        WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
        WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));

        Actions act4 = new Actions(driver);
        act.dragAndDrop(madrid ,spain).perform();

        WebElement unitedstates = driver.findElement(By.xpath("//div[@id='box103']"));
        WebElement washinton = driver.findElement(By.xpath("//div[@id='box3']"));

        Actions act5 = new Actions(driver);
        act.dragAndDrop(washinton ,unitedstates).perform();

        WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
        WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));

        Actions act6 = new Actions(driver);
        act.dragAndDrop(stockholm ,sweden).perform();



    }
}
