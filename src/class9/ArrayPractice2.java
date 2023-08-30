package class9;

public class ArrayPractice2 {

	public static void main(String[] args) {

		
		int [] numbers={10,25,30,24,30};// size of array 5
		           //     0, 1, 2, 3, 4
		
		
		System.out.println(numbers[2]);
		
	    System.out.println("The size of array is "+ numbers.length);
	    
	    for (int i=0; i<numbers.length; i++ ) {
	    	
	    	System.out.print(numbers[i]+ " ");
	    }
	    
	     System.out.println();
	    for (int i=numbers.length-1; i>=0; i--) {
	    	
	    	System.out.print(numbers[i]+ " ");
	    }
	    
		
	}

}
