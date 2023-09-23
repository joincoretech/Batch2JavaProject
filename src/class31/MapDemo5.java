package class31;

import java.util.*;

public class MapDemo5 {
    public static void main(String[] args) {

        TreeMap<Integer, String> offices= new TreeMap<>();
        offices.put(1, "Amazon");
        offices.put(2, "joincoretech");
        offices.put(3, "Google");
        offices.put(4, "Walmart");
        offices.put(5, "homeDepot");

        LinkedHashMap <Integer, String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.putAll(offices);
        linkedHashMap.put(6, "Kools");
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.containsValue("Google"));
        System.out.println(linkedHashMap.containsKey(7));

        Collection<String> values=linkedHashMap.values();
         for (String value: values){
            System.out.println(value);
         }

        Iterator<String > it=values.iterator();
         while (it.hasNext()){
             String value=it.next();
             if (value.contains("o")){
                 System.out.println(value);
                 it.remove();
             }
         }
         System.out.println(values);
    }
}
