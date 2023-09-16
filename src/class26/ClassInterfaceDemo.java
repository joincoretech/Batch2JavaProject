package class26;

public interface ClassInterfaceDemo {

    void interfaceMethod();
}

interface A{

}

class B implements ClassInterfaceDemo, A{

    public void interfaceMethod(){
        System.out.println("this is implementation for interface method");
    }

    public static void main(String[] args) {
        B b=new B();
        b.interfaceMethod();
    }
}