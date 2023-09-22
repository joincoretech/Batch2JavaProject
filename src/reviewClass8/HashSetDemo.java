package reviewClass8;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<Integer> numbers=new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(100);
        numbers.add(102);
        numbers.add(1);

        System.out.println(numbers);
    }
}
