package class25;

abstract public class AbstractClass1 {

    abstract void sendText();

    void printInfo(){
        System.out.println("This is not abstract method");
    }

}

class AbstractChild extends AbstractClass1{

    void sendText(){
        System.out.println("this is abstract method implementation");
    }

    public static void main(String[] args) {
       AbstractChild obj=new AbstractChild();
       obj.sendText();
       obj.printInfo();
    }
}