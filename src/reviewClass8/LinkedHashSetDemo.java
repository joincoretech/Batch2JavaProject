package reviewClass8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<Integer> numbers=new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(100);
        numbers.add(102);
        numbers.add(1);

        System.out.println(numbers);

        for (Integer number: numbers){
            System.out.println(number);
        }

        Iterator<Integer> iterator=numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
