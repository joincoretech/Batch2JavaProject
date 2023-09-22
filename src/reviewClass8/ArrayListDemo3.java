package reviewClass8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        List<String> cities=new ArrayList<>();
        cities.add("SpringField");
        cities.add("Alexanderia");
        cities.add("woodBridge");
        cities.add("Haripoor");
        cities.add("Kabul");

      /*  int counter=0;
        for(String city:cities){
            if(city.contains("n")){
                counter++;
            }
        }

        System.out.println(counter);
        */

        System.out.println(cities.stream().filter(city ->  city.contains("n")).count());
        //cities.stream().
        System.out.println(cities);
    }
}
