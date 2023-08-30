package class4;

import javax.swing.tree.AbstractLayoutCache;

public class NestedIfConditions {
	public static void main(String [] args) {
		
		int age= 65;
		
		
		if (age < 18) {
			System.out.println("You sould have your father permission to work");
		}else {
			
			System.out.println("congratulation! you are 18 or older ");
			if (age<64) {
				System.out.println("you are eligible for work");
			}else {
				 System.out.println("Ejoy your life. this is your rest time");
			}
		}
		
		
		boolean deplomma= false;
		
	   double gpa= 3.5;
	   
	   if (deplomma) {
		   
		  System.out.println("Congratulation! you have deplomma");
		  if (gpa>=3.5) {
			  System.out.println("You are eligible for scolership");
		  }else {
			  System.out.println("Sorry, your gpa is less then 3.5");
		  }
		  
	   }else{
		  System.out.println("Sorry, First you need to get your degree");
	   }
		
	}

}
