package class30;

import java.util.*;

public class RemoveArrayListDuplicate {

    public static void main(String[] args) {

        ArrayList<String>  fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Gripes");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Fig");
        fruits.add("Apple");
        fruits.add("Gripes");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Fig");

        System.out.println(fruits);

        Set <String> fruits2=new HashSet<>(fruits);
        System.out.println(fruits2);

        ArrayList <String> fruitsDuplicateRemoved=new ArrayList<>(fruits2);
        System.out.println(fruitsDuplicateRemoved);


        Set <String> linkedHashSet=new LinkedHashSet<>(fruits);
        System.out.println(linkedHashSet);
        ArrayList<String> fruitsDuplicateRemoved2=new ArrayList<>(linkedHashSet);
        System.out.println(fruitsDuplicateRemoved2);

        Set<String> fruitTreeSet=new TreeSet<>(fruits);
        System.out.println(fruitTreeSet);
        ArrayList<String> fruitsSortedData=new ArrayList<>(fruitTreeSet);
        System.out.println(fruitsSortedData);
    }
}
