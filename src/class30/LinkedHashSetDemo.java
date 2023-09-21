package class30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set <Integer> numbers=new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(18);
        numbers.add(20);
        numbers.add(15);
        numbers.add(20);
        numbers.add(20);

        System.out.println(numbers);
        numbers.remove(10);
        System.out.println(numbers);

        for(Integer number: numbers){
            System.out.println(number);
        }

        Iterator <Integer> iterator=numbers.iterator();
        while(iterator.hasNext()){
            Integer number=iterator.next();
            if (number%2==0){
                System.out.println(number);
            }
        }
    }
}
