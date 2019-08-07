package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DDTExample {
    public static void main(String[] args) throws IOException {


    FileInputStream fileInputStream = new FileInputStream("src/SampleData.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
    XSSFSheet sheet = workbook.getSheet("Employees");
    for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++){
        if(sheet.getRow(rowNum).getCell(0).toString().equals("Steven")){
            sheet.getRow(rowNum).getCell(2).setCellValue("Politician");
        }
    }
        FileOutputStream fileOutputStream = new FileOutputStream("src/SampleData.xlsx");
    workbook.write(fileOutputStream);
    workbook.close();
    fileInputStream.close();
    fileOutputStream.close();



    }
}
