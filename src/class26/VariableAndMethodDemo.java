package class26;

public interface VariableAndMethodDemo {

    int num=21; ////public static final int num =21;

    void method();


   static void method2(){
       System.out.println("static method should have body in the interface");
   }

   default void method3(){
       System.out.println("this is default method should have body");
   }

}
