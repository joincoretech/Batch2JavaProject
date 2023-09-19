package class28;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {


        int [] num={10,5,15,4};

        for (int n:num){
            if (n==10){
                System.out.println("number 10 is found");
                System.out.println(num.length);
            }
        }

        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(4);

        System.out.println(arrayList.contains(10));
        System.out.println(arrayList.size());

    }
}
