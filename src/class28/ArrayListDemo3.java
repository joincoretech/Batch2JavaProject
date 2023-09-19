package class28;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String > subjects=new ArrayList<>();
        subjects.add("Java");
        subjects.add("Java");
        subjects.add("SDLC");
        subjects.add("STLC");

        ArrayList <String> subjects2=new ArrayList<>();
        subjects2.add("Selenium");
        subjects2.add("Git");
        subjects2.add("STLC");

        subjects.addAll(2, subjects2);
        System.out.println(subjects);
    }
}
