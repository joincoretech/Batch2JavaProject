package class10;

public class ForLoppGet2DElements {

	public static void main(String[] args) {
		
		
		int [][] numbers= {
				{10,5,7,15},
				{12,13,20},
				{2,3,4,5}
				
		};
		
		System.out.println("row numbers "+numbers.length);
		System.out.println("the row elements "+ numbers[2].length);
		
		
		for (int r=0; r<numbers.length; r++) {
			
			for (int c=0; c<numbers[r].length; c++) {
				
				if(numbers[r][c]%2==0) {
					System.out.print(numbers[r][c]+" ## ");
				}
			}
		}

		
		System.out.println();
		System.out.println("=== ufe for each loop to get odd lements =====");
		
		
		for (int [] number: numbers) {
			
			for (int n:number) {
			   
				if (n%2!=0) {
					System.out.print(n+ " && ");
				}
			}
		}
		
		
		System.out.println();
		System.out.println("=== sum of the 2d array elements =====");
		
		int sum=0;
		for (int [] num:numbers) {
			
			for (int n: num) {
				sum+=n;
			}
		}
		System.out.println("the sum of lements is "+ sum);
	}

}
