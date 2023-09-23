package class31;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

    public static void main(String[] args) {
        Map<String , Double> groceries=new LinkedHashMap<>();
        groceries.put("Apple", 10.29);
        groceries.put("Orange", 15.5);
        groceries.put("Eggs", 10.00);
        groceries.put("Milk", 6.5);
        groceries.put("watermelon", 7.4);


        Set<Map.Entry<String, Double>> entrySet=groceries.entrySet();

        for (Map.Entry<String, Double> entry: entrySet){
           System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        // this is the second way to retrieve data from map
        Set< String>  set=groceries.keySet();
        for (String mapKey: set){
            System.out.println(mapKey+ " "+ groceries.get(mapKey));
        }




    }
}
