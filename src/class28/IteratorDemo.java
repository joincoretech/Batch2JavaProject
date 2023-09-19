package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String > subjects=new ArrayList<>();
        subjects.add("Java");
        subjects.add("Java");
        subjects.add("SDLC");
        subjects.add("STLC");
        subjects.add("Selenium");

        System.out.println("this is enhanced for loop");
        for (String subject: subjects){
            System.out.println(subject);
        }

        System.out.println("this is regular for loop");

        for (int i=0; i<subjects.size(); i++){
            System.out.println(subjects.get(i));
        }

        System.out.println("this is iterator to loop data");

        Iterator<String> it=subjects.iterator();
        while (it.hasNext()){
            String str=it.next();
            if (str.length()>5){
                it.remove();
            }
            System.out.println(str);

        }
       System.out.println(subjects);


    }
}
