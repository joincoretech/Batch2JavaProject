package class29;

import java.util.ArrayList;
import java.util.Collections;

public class MaxInArray {

    public static void main(String[] args) {

        int [] array={10,12,50,100,107,2,6};

        ArrayList <Integer> arrayList=new ArrayList<>();

        for (Integer num: array){
            arrayList.add(num);
        }

        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
    }
}
