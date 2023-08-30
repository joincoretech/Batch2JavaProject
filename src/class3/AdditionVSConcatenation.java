package class3;

public class AdditionVSConcatenation {
	
   public static void main(String [] args) {
	   
		// + we can do addition use numbers. 
	   // + we can do concatenation use string 
		
		int num1 = 15;
		int num2 =  5;
		
		
		System.out.println(num1 + num2); //
       
	   String str1= "10";
	   String str2 = "hello";
	   
	   System.out.println(num1 + num2 + str1);// 2010
	   
	   System.out.println(num1 + str1 + str2);// 1510hello
   }
}
