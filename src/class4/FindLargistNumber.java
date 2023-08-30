package class4;

public class FindLargistNumber {
	
	public static void main(String []args) {
		
		/*
		 * Write a program to ﬁnd  largest of three double values using if-else.. if and
         * logical operators provided by a user (numbers must be distinct)
		 */		
		
		
		double num1=25;
		double num2= 150;
		double num3= 20;
		 
		if(num1>num2  && num1> num3) {
			System.out.println ("The largist number is "+ num1);
		}else if (num2>num3) {
			System.out.println("The largist number is "+num2);
		}else {
			System.out.println("The largist number is "+ num3);
		}
	}

}
