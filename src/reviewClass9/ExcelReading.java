package reviewClass9;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReading {
    public static void main(String[] args) {
        String path="C:\\Users\\azizu\\IdeaProjects\\Batch2AdvanceJava\\Files\\myData.xlsx";
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
            Row row=sheet.getRow(3);
            Cell cell=row.getCell(1);
            System.out.println(cell);

            cell.setCellValue("AMINZAI");
            FileOutputStream fileOutputStream=new FileOutputStream(path);
            xssfWorkbook.write(fileOutputStream);
        }catch (IOException e){
            System.out.println("file not found check your path");
        }


    }
}
