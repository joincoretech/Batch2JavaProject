package class31;

import java.util.HashMap;

public class MapDemo2 {

    public static void main(String[] args) {

        HashMap<String, Double>  groceries=new HashMap<>();
        groceries.put("Eggs", 3.5);
        groceries.put("Milk", 4.29);
        groceries.put("Tomatoes", 14.5);
        groceries.put("Potato", 15.30);

        System.out.println(groceries);
        groceries.remove("Tomatoes");
        System.out.println(groceries);
    }
}
