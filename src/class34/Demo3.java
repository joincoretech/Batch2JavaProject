package class34;

public class Demo3 {

    public static void main(String[] args) {

        String s=null;
        if(s==null){
            System.out.println("we can not do any action on null String");
        }else {
            System.out.println( s.length());
        }

        String str=null;
       try{
           System.out.println(str.length());
       }catch (NullPointerException exception){
          System.out.println("string is null");
       }





    }
}
