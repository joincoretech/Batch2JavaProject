package class26;

public interface InterfaceDemo1 {

      String name="Aslam";// java compiler will add public , static, and final to each variable

    void interfaceMethod();
}

interface  Interface2{

    void interfaceMethod();// java compiler add public and abstract keywords to each method
}

 class InterfaceChild implements InterfaceDemo1, Interface2{

    public void interfaceMethod(){
        System.out.println("this is a same method in all interfaces");
    }
}