package class24;

public class Parent {

    static void staticMethod(){

        System.out.println("I am parent static method");
    }

    void parentMethod(){
        System.out.println("I am father of my child");
    }
}


class Child1 extends Parent{
    static void staticMethod(){

    }
    void parentMethod(){
        System.out.println("I am child of my parent");
    }

    public static void main(String[] args) {
        Child1 child=new Child1();
        child.parentMethod();

    }
}
