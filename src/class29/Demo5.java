package class29;

import java.util.LinkedList;

public class Demo5 {

    public static void main(String[] args) {

        LinkedList <String>  drinks= new LinkedList<>();
        drinks.add("Fanta");
        drinks.add("cook");
        drinks.add("pepsi");
        drinks.add("monster");
        drinks.add("juice");
        drinks.add("sprite");


        for (String drink: drinks){
            if (drink.contains("a")  || drink.contains("e")){
                drinks.set(drinks.indexOf(drink), "water");
            }
        }
        System.out.println(drinks);


        for (int i=0; i<drinks.size(); i++){

            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i, "WATER");
            }
        }
        System.out.println(drinks);
    }
}
