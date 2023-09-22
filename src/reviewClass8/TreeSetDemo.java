package reviewClass8;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<Integer> numbers=new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(100);
        numbers.add(102);
        numbers.add(1);

        System.out.println(numbers);
    }
}
