package class9;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create an array on integers and calculate the s u m of all elements in an
		 * array.
		 */
		
		int [] numbers= {10,5,6,12,20,25};
		
		int sum=0;
		for (int num : numbers) {
			 sum+=num;
			System.out.print(num+ " ");
		}
		
		System.out.println();
		System.out.println("sum of the array elements is "+ sum);
	}

}
