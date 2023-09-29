package reviewClass9;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileAllData {
    public static void main(String[] args) {

        String path="C:\\Users\\azizu\\IdeaProjects\\Batch2AdvanceJava\\Files\\myData.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
            int numberOfRows= sheet.getPhysicalNumberOfRows();
            for (int i=0; i<numberOfRows; i++){
                Row row=sheet.getRow(i);
                int columnsNumber=row.getPhysicalNumberOfCells();
                for (int j=0; j<columnsNumber; j++){
                    System.out.print(row.getCell(j)+" ");
                }
                System.out.println();
            }

        }catch (IOException e){
            System.out.println("file not found");
        }
    }
}
