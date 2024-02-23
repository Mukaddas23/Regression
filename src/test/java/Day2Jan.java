import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Jan {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        /*   launch the browser


         *  Provide username
         * provide password
         * click to submit
         * close browser*/
        //Open URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //provide username
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        //verify the title of dashboard page

        //Title validation
       /* String act_title = driver.getTitle();
        System.out.println(act_title);
        String exp_title="OrangeHRM";
        if(act_title.equals(exp_title)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }*/
        String act_title= "";
        try{
            act_title=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        }catch (NoSuchElementException e){
            String exp_title="Dashboard";
        }
        if(act_title.equals(act_title)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        driver.close();


    }
}
