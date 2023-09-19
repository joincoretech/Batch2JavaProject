package class28;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<String > subjects=new ArrayList<>();
        subjects.add("Java");
        subjects.add("Java");
        subjects.add("SDLC");
        subjects.add("STLC");

        ArrayList<String > subjects2=new ArrayList<>();
        subjects2.add("Java");
        subjects2.add("Java");
        subjects2.add("SDLC");
        subjects2.add("STLC");
        subjects2.add("Selenium");

        System.out.println(subjects.containsAll(subjects2));
        System.out.println(subjects.size());

        for (String str:subjects2){

            System.out.println(str+ " length is "+ str.length());
        }

        System.out.println(subjects.isEmpty());

    }
}
