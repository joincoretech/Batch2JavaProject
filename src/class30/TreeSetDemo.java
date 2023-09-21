package class30;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet <String> names=new TreeSet<>();
        names.add("Iqbal");
        names.add("Aslam");
        names.add("Masodi");
        names.add("Nasratullah");
        names.add("Ahmad");
        names.add("Meraj");
        names.add("Samiullah");
        names.add("1");
        for (int i=1; i<=4; i++){
            names.add(""+ i +"");
        }
        System.out.println(names);

        for (String name:names){
            System.out.println(name);
        }

        TreeSet <Integer> numbers=new TreeSet<>();
        for (int i=1; i<=50; i++){
            numbers.add(i);
        }
        System.out.println(numbers);

        /*for (Integer number: numbers){// we will get exception error

            if (number%2!=0){
                numbers.remove(number);
            }
        }*/

        Iterator <Integer> iterator=numbers.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if (number%2!=0){
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
