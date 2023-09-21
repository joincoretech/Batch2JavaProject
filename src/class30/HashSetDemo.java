package class30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set <String> hSet=new HashSet<>();
        hSet.add("Apple");
        hSet.add("Orange");
        hSet.add("Mango");
        hSet.add("watermelon");
        hSet.add("Grapes");
        hSet.add(null);
        hSet.add("Apple");

        System.out.println(hSet);
        hSet.remove("Apple");
        System.out.println(hSet);

        for (String str:hSet){
            System.out.println(str);
        }

        Iterator <String> it=hSet.iterator();

        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

    }
}
