package class3;

import java.util.function.ToDoubleBiFunction;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class ElseIfConditionStatments {
	
	public static void main(String [] args) {
		
		double num1 = 10.25;
		double num2 = 10.25;
		
		
	   if (num1>num2) {
		   System.out.println("Double value "+ num1 + " is bigger than "+ num2);
	   }else if(num1< num2) {
		   
		  System.out.println("Double value "+ num2 +" is bigger than "+ num1);
	   }else {
		   
		   System.out.println(num1+ " is equal to "+ num2);
		   
	   }
	   
	   
	   // we will create a program. if some one add number , the program will give back weekday.
	   
	   
	   int day =7;
	   
	   
	   if (day == 1) {
		   
		   System.out.println(" today is Monday");
	   }else if (day == 2) {
		   System.out.println("today is Teusday");
	   }else if (day == 3) {
		   System.out.println("Today is Wedensday");
		   
	   }else if (day ==4) {
		   System.out.println("Today is thursday");   
	   }else if (day == 5) {
		   System.out.println ("Today is Friday");
	   }else if (day == 6) {
		   System.out.println("Today is saturday");
	   }else if (day == 7) {
		   System.out.println ("Today us Sunday");
	   }else {
		   
		   System.out.println("The day is invalid");
	   }
	  
	   
	   
	     
	   
	}

}
