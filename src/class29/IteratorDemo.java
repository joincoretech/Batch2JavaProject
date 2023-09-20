package class29;


import java.util.*;


public class IteratorDemo {

    public static void main(String[] args) {

        List<String> linkedList=new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("strawBerry");
        linkedList.add("Watermelon");
        linkedList.add("Pineapple");

        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.indexOf("Pineapple"));


        Iterator <String> it=linkedList.iterator();

         System.out.println(it.hasNext());//true
        System.out.println(it.next());

        it.remove();
        System.out.println(linkedList);
        System.out.println(it.hasNext());//true
        System.out.println(it.next());

        it.remove();
        System.out.println(linkedList);
        System.out.println(it.hasNext());//true
        System.out.println(it.next());
    }

}
