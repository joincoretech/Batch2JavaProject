package reviewClass8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> cities=new LinkedList<>();
        cities.add("SpringField");
        cities.add("Alexanderia");
        cities.add("woodBridge");
        cities.add("Haripoor");
        cities.add("Kabul");

        System.out.println(cities.getFirst());
        System.out.println(cities.getLast());

        Iterator <String> iterator=cities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
