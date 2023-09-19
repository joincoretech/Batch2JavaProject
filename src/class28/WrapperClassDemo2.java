package class28;

public class WrapperClassDemo2 {


    public static void main(String[] args) {
        int a=10;
        Integer aa=a; // autoBoxing

        int b=aa; // autoUnboxing

        Integer integer=new Integer(15); // this is the long way of boxing
        System.out.println(integer);
        Integer integer1=20; // this is the short way of boxing

        int ab=integer1.intValue();// longger way of unboxing
        ab=integer1; //this is short way of unboxing
    }
}
