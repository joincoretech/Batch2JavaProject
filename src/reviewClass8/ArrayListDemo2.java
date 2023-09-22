package reviewClass8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("SpringField");
        cities.add("Alexanderia");
        cities.add("woodBridge");
        cities.add("Haripoor");
        cities.add("Kabul");
        cities.set(1, "Lorton");
        for (String city: cities){
            if (city.contains("S")){
                System.out.println(city);
               // cities.remove(city); when we remove data it is better to use iterator
            }
        }

        Iterator<String> iterator=cities.iterator();
        while (iterator.hasNext()){
            String city=iterator.next();
            if (city.contains("S")){
                iterator.remove();
            }
        }
        System.out.println(cities);



    }
}
