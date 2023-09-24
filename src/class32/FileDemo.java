package class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/Configuration.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));

        int iteration= Integer.parseInt(properties.getProperty("loop"));

        for (int i=0; i<iteration; i++){
            System.out.println("Dynamic program");
        }

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.setProperty("url", "www.google.com");
        properties.store(fileOutputStream, "added new properties in the file");

    }
}
