package class32;

import java.util.Iterator;
import java.util.TreeMap;

public class Task2 {

   /* Create a Map from array of cities that will sort
    keys in alphabetical order. As a key store the
    n a m e of the city and as a value store the length
    of the city (Example: Paris=5, Moscow =6,
                 Washington DC=13 etc..).
    If any city n a m e is more than 7 characters
    remove that city ( use Iterator ).*/

    public static void main(String[] args) {

        String [] cities={"Springfield", "Alexander", "Woodbridge", "Haripoor",};

        TreeMap <String, Integer> city=new TreeMap<>();

        for (String str: cities){
            city.put(str, str.length());
        }
        System.out.println(city);

        Iterator<String> it=city.keySet().iterator();
        while (it.hasNext()){
            String key= it.next();
            if (key.length()>9){
                it.remove();
            }
        }

        System.out.println(city);
    }
}
