package class22;

public class MethodOverLoadingDemo1 {


    void add(int a , int b){
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }

    void add(int a, double b){
        System.out.println(a+b);
    }

    void add(double a, int b){
        System.out.println(a+b);
    }

    void add(int [] arr){
        int sum=0;
        for (int n:arr){
            sum+=n;
        }
        System.out.println(sum);
    }
}
