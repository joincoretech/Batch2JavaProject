package class10;

public class ArrayLengthPractice {

	
	public static void main(String[] args) {
		
		String [] names= {"Muhammad Gul", " Samiullah", "Aslam", "Masodi"};
		
		System.out.println(names[1]);
		
		String [] names1= new String [4];
		
		names1[0]="Muhammad Gul";
		names1[1]="Samiullah";
		names1[2]="Aslam";
		names1[3]="Masodi";
		
		System.out.println(names1[0]);
		
		for (int i=0; i<names1.length; i++) {
			
			System.out.print(names1[i]+", ");
		}
		
		System.out.println();
		for (String name: names) {
			
			if (name.equalsIgnoreCase("aslam")){
				System.out.println(name);
			}
		}
		
	}
}
