package reviewClass6;

public class VariablesDemo {

    // local variables
    // instance variables
    // static variable

    // local variables
    void localVar(String str){
       int salary=5000;
       System.out.println(str + " "+ salary);
    }

    // instance

    String str="Hello";

    void reverseString(){
        String newStr="";
        for (int i=str.length()-1; i>=0; i--){
           newStr+= str.charAt(i) ;
        }
        System.out.println(newStr);
    }

    // static variable
   static String name;
   static void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo variablesDemo=new VariablesDemo();
        variablesDemo.localVar("Samiullah");
        variablesDemo.reverseString();
        name="Iqbal";
        printName();
    }

}
