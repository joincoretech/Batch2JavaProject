package class28;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();
        names.add("Iqbal");
        names.add("Samiullah");
        names.add("Meraj");
        names.add("Nasratullah");
        names.add("Masodi");
        System.out.println(names);
        for (String name:names){
            System.out.println(name);
        }
        names.add("Aslam");
        System.out.println(names);
        names.remove("Meraj");
        System.out.println(names);
        names.add(1, "Meraj");
        System.out.println(names);
    }
}
