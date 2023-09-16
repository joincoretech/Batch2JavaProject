package class26;

public abstract class AbstractAndInterface {
    // this is abstract class

    String name;
   private int num=21;
    AbstractAndInterface(){
        System.out.println("this is abstract class constructor ");
    }

    void method(){
        System.out.println("this is default method");
    }
}

interface InterfaceDemo{
    // this is interface
     String name="Masodi";
   /* InterfaceDemo(){ // constructor is not allowed in interface

    }*/

     void method();// all methods in interface are public and abstract
}