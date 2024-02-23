package apache;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReading {
    public static void main(String[] args) throws IOException {
     FileInputStream file  = new FileInputStream("C:\\Users\\olimo\\IdeaProjects\\SeleniumClass25\\src\\main\\resources\\DataToTest1.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        /* file-workbook-sheet*/
        int totalrows= sheet.getLastRowNum();
        int totalcell=sheet.getRow(1).getFirstCellNum();
        System.out.println("number of rows " + totalrows);
        System.out.println("number of cells " + totalcell);

        for(int r=0;r<=totalrows;r++){
            XSSFRow currentRow = sheet.getRow(r);
            for( int c=0;c<=totalcell;c++){
                XSSFCell cell= currentRow.getCell(c);
                String value= cell.toString();
                System.out.println(value +" ");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}
