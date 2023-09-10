package class22;

public class MethodOverLoadingDemo1Tester {

    public static void main(String[] args) {
        MethodOverLoadingDemo1 obj=new MethodOverLoadingDemo1();
        int [] arr={10,5, 15,20};
        obj.add(arr);
        obj.add(5,10.5);
        obj.add(5.5, 10);
        obj.add(2,4);
    }

}
