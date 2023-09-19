package class28;

import class21.MoultiLevelInhiertance.A;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList <String > subjects=new ArrayList<>();
        subjects.add("Java");
        subjects.add("Java");
        subjects.add("SDLC");
        subjects.add("STLC");

        ArrayList <String>  addAllArrayList=new ArrayList<>();
        addAllArrayList.addAll(subjects);
        System.out.println(addAllArrayList);
        addAllArrayList.removeAll(addAllArrayList);
        System.out.println(addAllArrayList);
    }
}
