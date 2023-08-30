package class4;

import java.util.Scanner;

public class LogicalOperators {

	
	public static void main(String [] args) {
		
		/*
		 * output for and (&&) operator
		 *  false && false= false
		 *  false && true= false
		 *  true && false= false
		 *  true && true= true
		 *  
		 */
		
		
		/* 
		 * output for or (||) operators
		 * false || false= false
		 * false || true = true
		 * true || false = true
		 * true || true = true
		 * 
		 */
		
		/*
		 * WRITE A PROGRAM THAT WILL PRINT WHETHER IT IS A WEEKEND OR WEEKDAY. IF ANY 
		 * DAY FROM 1-5 → OUTPUT "IT IS A WEEKDAY", ANYDAY FROM 6-7 → OUTPUT "IT IS A
		 * WEEKEND", ANY OTHER DAY → OUTPUT "INVALID DAY"
		 */	
	
	   int day= 8;
	   
	   if(day>=1 && day<=5) {
		   System.out.println("It is weekday");
	   }else if (day>=6 && day<=7) {
		   
		   System.out.println("It is a weekend");
	   }else {
		   System.out.println("Invalid day");
	   }
	   
	   
	   
		/*
		 * Prompt the user to enter person heights in feet. Person should be classified
		 * as one of the following:  short (under 5 feet)  med i u m(5 to 6 feet) 
		 * tall (6 feet a n d over)
		 */
	   
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Please add you hight in feet");
	   
	   int hight=scan.nextInt();
	   if (hight<5) {
		   System.out.println("You are in short people category");
	   }else if (hight >=5  && hight <=6) {
		   System.out.println("You are in medium people category");
	   }else {
		   System.out.println("You are in tall people category");
	   }
	   
	   
}
}