package class28;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String > subjects=new ArrayList<>();
        subjects.add("Java");
        subjects.add("Java");
        subjects.add("SDLC");
        subjects.add("STLC");

        System.out.println(subjects.contains("Java"));
        System.out.println(subjects.contains("Selenium"));
    }
}
