package reviewClass7;

final public class FinalDemo {

    void method(){
        System.out.println("this si final class method");
    }
}

/*class A extends FinalDemo{ // we can not inherit final class

}*/

class finalMethod{

    final void print(){
        System.out.println("this is final method");
    }
}

class finalMethodChild extends finalMethod{

   /* void print(){// we can not override the final method
    }*/
   public static void main(String[] args) {
      final String name="Aslam";
       //name="Samiullah"; we can not reassign value to final variable
   }
}
