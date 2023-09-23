package class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo4 {
    public static void main(String[] args) {

        TreeMap<Integer, String>  offices= new TreeMap<>();

        offices.put(1, "Amazon");
        offices.put(2, "joincoretech");
        offices.put(3, "Google");
        offices.put(4, "Walmart");
        offices.put(5, "homeDepot");

        Set<Integer> mapKeys= offices.keySet();
        Iterator<Integer> it=mapKeys.iterator();
        while (it.hasNext()){
            Integer key=it.next();
            String value= offices.get(key);
            System.out.println(key+ " "+value);
            if (key<4){
                it.remove();
            }

        }

        System.out.println(offices);
    }


}
