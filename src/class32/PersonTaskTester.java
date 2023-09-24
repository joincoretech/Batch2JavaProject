package class32;

import java.util.TreeMap;

public class PersonTaskTester {
    public static void main(String[] args) {
        PersonTask obj=new PersonTask("name", "lastname", 21, 1000);
        TreeMap<Integer, PersonTask> emp=new TreeMap<>();
        emp.put(001, obj);
        emp.put(003, new PersonTask("Samiullah", "Aminzai", 35, 6000));
        emp.put(002, new PersonTask("masodi", "masodi", 30, 6000));
        emp.put(004, new PersonTask("Aslam", "Zaland", 35, 4000));
        emp.put(005, new PersonTask("Iqbal", "Dawodzai", 17, 5000));

        System.out.println(emp);

        for (Integer key: emp.keySet()){
            System.out.println(key+ " "+ emp.get(key).name+ " "+emp.get(key).lastName+ " "+emp.get(key).salary);
        }

    }
}
