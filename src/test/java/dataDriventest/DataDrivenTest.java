package dataDriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class DataDrivenTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();
        String file = "C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\test\\java\\dataDriventest\\caldata.xlsx";
        int rows  = ExcelUtils.getRowCount(file,"Sheet1");

        for(int i=1;i<=rows;i++){
            //read data a from excel
            String principles = ExcelUtils.getCellData(file,"Sheet1",i,0);
            String rateOfInterest = ExcelUtils.getCellData(file,"Sheet1",i, 1);
            String per1 = ExcelUtils.getCellData(file,"Sheet1",i, 2);
            String per2 = ExcelUtils.getCellData(file,"Sheet1",i, 3);
            String fre = ExcelUtils.getCellData(file,"Sheet1",i, 4);
            String exp_value = ExcelUtils.getCellData(file,"Sheet1",i, 5);

            //pass the data to the website
            driver.findElement(By.id("principal")).sendKeys(principles);
            driver.findElement(By.id("interest")).sendKeys(rateOfInterest);
            driver.findElement(By.id("tenure")).sendKeys(per1);

            Select perdrp =new Select(driver.findElement(By.id("tenurePeriod")));
            perdrp.selectByVisibleText(per2);

            Select fredrp =new Select(driver.findElement(By.id("frequency")));
            fredrp.selectByVisibleText(fre);



            JavascriptExecutor js= (JavascriptExecutor) driver;
            WebElement calculate_btn= driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
            js.executeScript("arguments[0].click();",calculate_btn);//clicking calculate button


            //validation & update results in sxcel
            String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
            if(Double.parseDouble(exp_value)==Double.parseDouble(act_mvalue)){
                System.out.println("test passed");
                ExcelUtils.setCellData(file,"Sheet1",i,7,"Passed");
                ExcelUtils.fillGreenColor(file,"Sheet1",i,7);
            }
            else {
                System.out.println("test failed");
                ExcelUtils.setCellData(file,"Sheet1",i,7,"Failed");
                ExcelUtils.fillRedColor(file,"Sheet1",i,7);
            }
            Thread.sleep(3000);

            WebElement clear_btn = driver.findElement(By.xpath("//img[@class='PL5']"));
            js.executeScript("arguments[0].click();",clear_btn);

        }
        //driver.quit();
    }
}
