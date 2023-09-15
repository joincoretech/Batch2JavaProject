package reviewClass7;

public class OverLoadingDemo {
    String name;
    // overload constructor
    OverLoadingDemo (){
       System.out.println("I am constructor with out parameter");
    }

    OverLoadingDemo(String name){
        this.name=name;

    }

   void printInfo(String name) {
       this.name=name;
       System.out.println("your name is "+name);
   }

   void printInfo(String name, String age){
       this.name=name;
       System.out.println("your name is "+name+"your age "+ age);
   }

   static void staticMethod(){
        System.out.println("I am static method");
   }
   static void staticMethod(String str){

        System.out.println("I am a static method with parameter "+ str);
   }

    public static void main(String[] args) {
        OverLoadingDemo obj=new OverLoadingDemo();
        obj.printInfo("Aslam");
        obj.printInfo("Meraj", "25");
        staticMethod();
        staticMethod("static String");
    }
}
