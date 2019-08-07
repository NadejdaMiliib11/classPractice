package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "src/SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        //loading the workbook to class
        workbook = new XSSFWorkbook(fileInputStream);
        //providing the specific sheet that we want to work with from the worbook
        sheet = workbook.getSheet("Employees");
        //we are selecting and saving row
        row = sheet.getRow(1);
        //selecting the cell from the selected row
        cell = row.getCell(1);
        System.out.println(cell);
        XSSFCell adamCell = sheet.getRow(2).getCell(0);
        adamCell.setCellValue("Madam");
        //for when you are sending a value to a file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // this is the line that is executing and writing to the file
        workbook.write(fileOutputStream);
        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
