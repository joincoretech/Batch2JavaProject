package reviewClass6;

public class AccessModifiersDemo {


    private static  String privateString;// accessible in this class
    public static String publicString;//  accessible in all classes in this project
    protected static String protectedString;// accessible in same package classes
    // can be access in other packages by inheritance
      String defaultString; // default accessible in same package classes
    public static String []  countWords(String str){

        String [] array;
        array=str.split(" ");
        for (String s:array){
            System.out.println(s);

        }
        System.out.println(array.length);
        return array;
    }

    public static void main(String[] args) {
        countWords("this is java review class 20");
    }

}
