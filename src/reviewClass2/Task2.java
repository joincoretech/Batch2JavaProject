package reviewClass2;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String [] args) {
		
		// lets create a program to collect first and last name from costumer
		// ctrl+v
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("Please add your first name");
				
			     String firstName= scanner.nextLine();
			     
			     System.out.println("Please add your last name");
			     String lastName=scanner.next();
			     
			     System.out.println("Hello! your fist name is "+ firstName+" and your last name is "+lastName);
	}
	
}
