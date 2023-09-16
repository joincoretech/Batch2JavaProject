package class26;

public interface I1 {
    static void method1(){
       System.out.println("this is interface1 method");
    }
}

interface I2{
    static void method1(){
        System.out.println("This is interface 2 method");

    }
}

class StaticDemo implements I1,I2{
    public void method1(){
         I1.method1();
        I2.method1();
    }
}