package reviewClass3;

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
	
		// loops : in java loop is helping us to avoid code repetition and print a block of code as many time as we want
      
		// while loop: check condition first then run
		// do While loop: run first hen check condition
		
		// for loop: it is better to use for loop if we know the number of repetition
		// advance/enhanced loop: we use advance loop to get array elements.
		
		
	int temp=74;
	
   boolean status= true;
   
   while(status) {
	   System.out.println("Weather is not warm enough to go out");
	   if (temp==75) {
		   System.out.println("Weather is nice i will go out for walking");
		   status=false;
	   }
	   temp++;
   }
	
   
   
   int day=1;
   boolean dayStatus=true;
   do {
	   if (day==5) {
		   System.out.println(day+ "th day is friday we will not have a class");
		   dayStatus=false;
	   }
	   day++;
   }while(dayStatus);
	
	}

}
