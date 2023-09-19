package class28;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo1 {

    public static void main(String[] args) {

        String [] names=new String[2];
        names[0]="Samiullah";
        names[1]="Nasratullah";
        //names[2]="Meraj";

        String [] names2=new String[3];
        names2[0]= names[0];
        names2 [1]=names[1];
        names2[2]="Meraj";
        System.out.println(Arrays.toString(names2));

        int [] num={10,5,6,15};
        System.out.println(Arrays.stream(num).sum());
        System.out.println(Arrays.stream(num).max());
    }
}
