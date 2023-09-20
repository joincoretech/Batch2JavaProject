package class29;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {

        List<String> linkedList=new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("strawBerry");
        linkedList.add("Watermelon");
        linkedList.add("Pineapple");

        Iterator<String> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            if (str.endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(linkedList);
    }
}
