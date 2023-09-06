package class19;

public class LocalVariableDemo {

    public void addition(int num1, int num2){ //num1 and num2 are local variables

        System.out.println(num1+num2);
    }


    public void sub(){

        int num1=10;
        int num2=5;
        System.out.println(num1-num2);
    }

    public static void main(String[] args) {
        LocalVariableDemo obj=new LocalVariableDemo();

        obj.addition(10, 20);
        obj.sub();
    }

}
