package class18;

public class Practice1 {


  /*  Create a method that will take 1 parameter as
    a String and return reversed String. Method
    should be visibly only within same package.*/

    String reveresString(String str){

        String str2="";
        for (int i=str.length()-1; i>=0; i--){
            str2+=str.charAt(i);
        }

        if (str.equals(str2)){
            System.out.println("Strings are palindrome");
        }else {
            System.out.println("Strings are not palindrome");
        }
        return str2;


    }


}
