package class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Iqbal");
        arrayList.add("Samiullah");
        arrayList.add("Aslam");
        arrayList.add("Muhammad Gul");

        arrayList.indexOf("Aslam");

        Map<Integer, String> map=new HashMap<>();
        map.put(0001, "Iqbal");
        map.put(0002, "Samiullah");
        map.put(0003, "Aslam");
        map.put(0005, "Aslam");
        map.put(0004, "Muhammad Gul");
        System.out.println(map);
        map.remove(0004);
        System.out.println(map);

    }
}
