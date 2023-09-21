package class30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {

        Set <String> countryNames=new TreeSet<>();

        countryNames.add("USA");
        countryNames.add("Mexico");
        countryNames.add("Afghanistan");
        countryNames.add("Canada");
        countryNames.add("Brazil");

        System.out.println(countryNames);

        Iterator<String> it=countryNames.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String name:countryNames){
            System.out.println(name);
        }
    }
}
