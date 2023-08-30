package class10;

public class LargeNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] number= {102, 15, 20, 100, 101};
		
		
		int large=0;
		
		for (int num: number) {
			
			if (large<num) {
				
				large=num;
			}
		}
      
		System.out.println("the largest element in array is "+ large);
		
		
		// find small number in array
		
		int small=number[0];
		
		for (int num: number) {
			
			if (small>num) {
				small=num;
			}
		}
		
		System.out.println("the smalest number in the array is "+ small);
		
		
	}

}
