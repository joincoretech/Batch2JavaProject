package class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {

    public static void main(String[] args) throws IOException {
            String path=System.getProperty("user.dir")+"/Files/myData.xlsx";

        FileInputStream file=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(file);
        Sheet sheet=xssfWorkbook.getSheet("Sheet2");
        int numberOfRows=sheet.getPhysicalNumberOfRows();

        for (int i=0; i<numberOfRows; i++){
            Row row=sheet.getRow(i);
            if (i==0){
                Cell cell=row.createCell(3);
                cell.setCellValue("Salary");
            }else {
                Cell cell=row.createCell(3);
                cell.setCellValue(150000);
            }
        }
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        xssfWorkbook.write(fileOutputStream);
    }
}
