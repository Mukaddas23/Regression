package apache;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\main\\resources\\myfile.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet();
        //creating rows

        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("Welcome");
        row1.createCell(1).setCellValue("Study");
        row1.createCell(2).setCellValue("Selenium");

        // Creating the second row
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("excel");
        row2.createCell(1).setCellValue("done");
        row2.createCell(2).setCellValue("writing");

        workbook.write(file);
        workbook.close();
        file.close();
    }

}


