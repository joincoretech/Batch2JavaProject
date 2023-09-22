package reviewClass8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List <String>  cities=new ArrayList<>();
        cities.add("SpringField");
        cities.add("Alexanderia");
        cities.add("woodBridge");
        cities.add("Haripoor");
        cities.add("Kabul");

        System.out.println(cities);

        for (String city: cities){
            System.out.println(city);
        }

        for (int i=0; i< cities.size(); i++){

            if (i%2==0){

                System.out.println(cities.get(i));
            }
        }


        Iterator <String> iterator=cities.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
