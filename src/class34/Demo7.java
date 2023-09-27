package class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo7 {

    public static void main(String[] args) {
        System.out.println("important code");
        System.out.println("important code");
        System.out.println("important code");
        System.out.println("important code");

        String path="C:\\Users\\azizu\\IdeaProjects\\Batch2AdvanceJava\\Files\\myData.xlsx";
        FileInputStream fileInputStream=null;

        try{
            fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("file not found with following path "+path);
        }finally {
            try{
                fileInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
