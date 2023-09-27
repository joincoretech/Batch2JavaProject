package class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) {
        String path="C:\\Users\\azizu\\IdeaProjects\\Batch2AdvanceJava\\Files\\myDat.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }

        System.out.println("this important code");
        System.out.println("this important code");
        System.out.println("this important code");
        System.out.println("this important code");
        System.out.println("this important code");
     }

}
