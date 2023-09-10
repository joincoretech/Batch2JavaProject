package class22;

public class MethodOverLoadingDemo2 {

    void add(int a, int b){
        System.out.println(a+b);
    }

    void add (int... arr){
       int sum =0;
       for (int n:arr){
           sum+=n;
       }
       System.out.println(sum);
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo2 obj=new MethodOverLoadingDemo2();
        obj.add(5,10,15,20);
    }
}
