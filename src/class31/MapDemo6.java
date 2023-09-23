package class31;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo6 {
    public static void main(String[] args) {

        HashMap <String , String>  countries=new HashMap<>();
        countries.put("USA", "DC");
        countries.put("Afghanistan", "Kabul");
        countries.put("Pakistan", "Islamabad");
        countries.put("Tajikistan", "Dushambi");
        countries.put("Iran", "Tehran");



        countries.keySet().removeIf(key -> key.contains("k"));

       /* Iterator <String> it=countries.keySet().iterator();
        while (it.hasNext()){
            String key=it.next();
            if (key.contains("k")){
                it.remove();
            }
        }*/
        System.out.println(countries);
    }
}
