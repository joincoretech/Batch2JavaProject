package class17;

public class MethodWithParamAndReturn {

    public static void main(String[] args) {
        MethodWithParamAndReturn obj=new MethodWithParamAndReturn();
        int num=10;
        int num1=20;
        int result=obj.add(num,num1);
        System.out.println(num+" + "+num1+" = "+result);

        String str="good";
        String reveres=obj.reverseString(str);
        System.out.println(str+" reveres is "+reveres);
    }

    int add (int a, int b){
        int c;
        c=a+b;
        return c;
    }


    String reverseString(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        str=stringBuilder.toString();
        return str;
    }



}
