package class26;

public class InterfaceDemo1Tester {
    public static void main(String[] args) {

        Interface2 interface2=new InterfaceChild();
        InterfaceDemo1 interfaceDemo1=new InterfaceChild();

        interface2.interfaceMethod();
        interfaceDemo1.interfaceMethod();
    }
}
