package class5;

public class NotOperator {

	public static void main (String [] args) {
		
		//NotOperator (!) it will change true value to false
		
		boolean isRain= !true;
		System.out.println(isRain);
		
		boolean good = true ; // true
		
		if (!good) {
			System.out.println("it is not good");
		}else {
			System.out.println("it is good");
		}
	}
}
