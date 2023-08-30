package class9;

public class GetElementByAdvancedLoop {

	public static void main(String[] args) {


		int [] num= {10,20,30,25,5,15};
		
		// lets print all the array element by using the enhanced loop
		
		
		for (int n: num ) {
			
			System.out.print(n+ " ");
		}
		
		System.out.println();
		for (int n: num) {
			
			if (n%2==0) {
			System.out.print(n+ " ");
			}
		}
		
		System.out.println();
		String [] names= {"Aslam", "Iqbal", "Samiullah", "Mosodi", "Nasratullah", "Meraj"};
		
		for (int i=0; i<names.length; i++) {
			
			System.out.print(names[i]+ " ");
		}
		
		
		System.out.println();
		for (String name: names) {
			
			System.out.print(name+" ");
		}
		
	}

}
