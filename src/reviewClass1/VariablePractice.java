package reviewClass1;

public class VariablePractice {
	
	public static void main(String [] args) {
		
		// variable create from three parts 1. data type 2. variable name, 2. value
		
		 byte a12=10;  //  byte is data type // a12 is variable name // = is assigning operator // 10 is value
		 
		 System.out.println(10);
		 System.out.println(a12);
		 
		 // + we can concatenate string'
		 char b='B';
		 
		 String grade="grade";
		 // grade is B
		 
		System.out.println(grade + " is " +b);
		 
		System.out.println("I am studing in joincoretech");
		
		String info="I am studing in joincoretech";
		System.out.println(info);
		
		// create variable name= value your name,  school= value joincoretech
		//output: "my name is yourname and i am joincoretech student."
		
		String name="Azizullah";
		String school="joincoretech";
		
		System.out.println("My name is "+ name +" and i am "+ school +" student.");
		
		
		/*
		 *  create variable firstName= value yourFirstName, lastName= value yourLastName, 
		 *  fullName= value firstName+lastName, age= value your age
		 * 
		 * output: "My name is yourfullname and my age is yourage"
		 * 
		 */	
		
		String firstName="Azizullah";
		String lastName= "Ayoubi";
		String fullName= firstName+" "+lastName;
		int age=40;
		
	System.out.println("My name is "+ firstName +" and my age is "+age );
	
	
	  // declare variable 
	
	    int num;
	    num=5;
	    
	    int num2=num;// 5
	    
	    int num3=num2+num; // 5+5=10
	    
	    
	    // we can declare many variable in the same time
	    
	    int num4, num5, num6;
	    
	    num4=10;
	    num5=20;
	    num6=num4;// 10
	    System.out.println(num6);
	    num6=num5;// 20
	    System.out.println(num6);
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		 
	}

}
