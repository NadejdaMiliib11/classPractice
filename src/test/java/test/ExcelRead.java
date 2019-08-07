package test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelRead {
    public static void main(String[] args) throws IOException {
        //Creating a file
        //Import  from java io
        File file = new File("src/SampleData.xlsx");
        System.out.println(file.exists()); // a method to check the given path, returns boolean
        FileInputStream fileInputStream = new FileInputStream(file);
        //Workbook > Sheets > Rows > Cells
        //Loading the workbook to our class
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        //pass the sheet
        XSSFSheet sheet = workbook.getSheet("Employees");
        //this line is getting Sandler from Employee sheet
        System.out.println(sheet.getRow(2).getCell(1));
        int usedRows = sheet.getPhysicalNumberOfRows();
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("getPhysicalNumberOfRows "+ usedRows);
        System.out.println("getLastRowNum"+lastUsedRow);

        //TODO:
        for (int rowNum = 0; rowNum < usedRows ; rowNum++) {

       if (sheet.getRow(rowNum).getCell(0).toString().equalsIgnoreCase("Neena")){
           System.out.println(sheet.getRow(rowNum).getCell(0).toString());

       }

        }

        for (int j = 0; j < usedRows; j++) {
            if(sheet.getRow(j).getCell(0).toString().equalsIgnoreCase("Adam")){
                System.out.println(sheet.getRow(j).getCell(2).toString());
            }

        }


    }
}
