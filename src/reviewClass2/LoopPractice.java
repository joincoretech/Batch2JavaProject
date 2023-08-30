package reviewClass2;

public class LoopPractice {
	public static void main(String [] args) {
		
		
		// while and do while loop
		
		int number=1;
		
		while(number>1) {// while loop check the condition first then run the code
			System.out.println("I am while loop");
			number--;
		}
		 
		
		do{ // do while loop run the code first then check the condition
			System.out.println("I am do while loop");
			number--;
		}while(number>1);
		
		
		int num=1;// print only even number till 20
		
		while (num<20) {
			if (num%2==0) {
				System.out.print(num+ " ");
			}
			num++;
		}
		
		System.out.println("=======================");
		
		// print number from 1-20 in one line
		int num1=1;
		while (num1<=20) {
			System.out.print(num1+ " ");
			num1++;
		}
		
		
	}

}
