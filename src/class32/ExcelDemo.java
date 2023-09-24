package class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+"/Files/myData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);

        Sheet sheet=excel.getSheet("userData");
        Row row=sheet.getRow(2);
        Cell col=row.getCell(0);

        System.out.println(col);
        System.out.println("rows "+sheet.getPhysicalNumberOfRows());
        System.out.println("columns "+row.getPhysicalNumberOfCells());


    }
}
