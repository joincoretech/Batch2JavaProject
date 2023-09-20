package class29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class Demo6 {

    public static void main(String[] args) {

        ArrayList<Integer>  numbers=new ArrayList<>();
        for (int i=1; i<=50; i++){
            if (i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        Integer maxNumber= Collections.max(numbers);
        System.out.println(maxNumber);

        Iterator<Integer> iterator=numbers.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if (number%5==0){
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
