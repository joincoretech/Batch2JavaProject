package class7;

public class BreakPractice {
	
	public static void main(String [] args) {
		
		// loop from 1 - 20 if you find the number 8 then stop looping
		
		for (int i=1; i<=20; i++) {
			
			System.out.println("i am out side block");
			
			if (i==8) {
				
			System.out.println(i);
			break;
			}
		}
		
		int num=1;
		while(num<=20) {
			System.out.println("i am out side block");
			
			if(num==2) {
				System.out.println(num);
				break;
			}
			num++;
		}
		
		
		for (int i=1; i<=10; i++) {
			
			if (i==5) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		
	}

}
