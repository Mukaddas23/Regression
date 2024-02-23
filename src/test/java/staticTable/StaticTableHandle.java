package staticTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTableHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        //int[][]
        int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("number of rows "+ rows);
        int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("number of columns "+columns);

        //Let's read specific rows and column data

        String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[1]")).getText();
        System.out.println(value);

        //read data from all rows and columns
        for(int r=2;r<=rows;r++){
            for(int c=1; c<=columns;c++){
                String value1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value1+"\t");
            }
            System.out.println();
        }
        //Print specific book names whose name is Mukesh
        for(int r=2;r<=rows;r++){

                String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
                if (author.equals("Mukesh")){String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                    System.out.println(author+" "+bookname);
                }

        }

    }
}
