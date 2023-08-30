package class3;

public class ArithmaticOperators {
	
	public static void main(String [] args) {
		
		// Arithmatic opertors:  +, -, /, *, % 
		
		// Addition(+), Subtraction(-), Division(/), Multiplication(*), Modulus(%)
		
		
		int num1 = 10;
		int num2 = 5;
	
		
		System.out.println(num1 + num2);// output: 15 
		System.out.println(num1 - num2);// 5 
		System.out.println( num1 /num2); // 2
		System.out.println(num1 * num2); // 50
		System.out.println(num1 % num2); // 0
		
		
		// we can use variables to initialize other variables 
		
		int sum = num1+num2;
		int sub = num1-num2;
		int multi = num1*num2;
		int div = num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		
	
		System.out.println("Sum of number "+ num1+" and "+ num2+ " is = "+ sum );
		
		double number1 = 10.5;
		double number2 = 100.25;
		
		double sumOfTwoNum=number1+number2;
		
		System.out.println(sumOfTwoNum);
		
		
	 int result= 10 + 5 * 3; // 25
	 System.out.println(result);
		
	 
	 int mod1= 10 % 3; // 1
	 
	 System.out.println(10 % 3);
	 
	 int result2=(20 % 7)* 3; //18
	 System.out.println(result2);
	 
	 
	 
	 
	 
		
		
		
		
	}

}
