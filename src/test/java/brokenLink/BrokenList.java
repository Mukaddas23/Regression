package brokenLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenList {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("total number of links "+links.size()); //48 links

        int brokenLinks = 0;
        for(WebElement linkElement:links){
            String hrefAttribute = linkElement.getAttribute("href");
            //pre-requisite for check broken links
            if (hrefAttribute==null || hrefAttribute.isEmpty()){
                System.out.println("Href value is empty");
                continue;
            }
            //checking link is broken or not
            URL linkurl= new URL(hrefAttribute); // convert String--> url
            HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();// send request to server :open, connect
            conn.connect();
            if(conn.getResponseCode()>=400){
                System.out.println(hrefAttribute+"  "+"===>Broken links");
                brokenLinks++;
            }
            else{
                System.out.println(hrefAttribute+"   "+" not broken links");
            }



        }
    }
}
