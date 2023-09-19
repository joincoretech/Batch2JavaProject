package class28;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList <String> subject=new ArrayList<>();
        subject.add("SDLC");
        subject.add("STLC");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        System.out.println(subject.get(1));
        subject.add("Testng");
        System.out.println(subject.get(5));
        System.out.println(subject.size());
        System.out.println(subject.indexOf("Java"));
        subject.remove("Git");
        System.out.println("this is size of array list after remove "+ subject.size());
        System.out.println(subject);
    }
}
