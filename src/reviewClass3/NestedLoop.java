package reviewClass3;

public class NestedLoop {
 
	public static void main(String[] args) {
		
		// create 4x4 square  patron  use * 
		
		
		for (int i=1; i<=4; i++) {// outer loop
			
			for (int j=1; j<=4; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		// create rectangle 
		
		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		
        for (int i=4; i>=1; i--) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		} 
        
        for (int i=1; i<=10; i++) {
        	
        	for (int j=1; j<=10; j++) {
        		
        		System.out.print(" "+j*i);
        	}
        	
           System.out.println();
        }
	}
}
