package class7;

public class ForLoopPractice {
	
	public static void main(String [] args) {
		
		// I wan to say 3 time Hello to aslam
		
		//System.out.println("Hello Aslam");
		//System.out.println("Hello Aslam");
		//System.out.println("Hello Aslam");
		
		for(int i=1; i<=3; i++) {
			System.out.print("Hello Nastrullah, ");
		}
		System.out.println();
		System.out.println("=======================");
		
		// print number from 1-50 in one line
		
		for (int i=1; i<=50; i++) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		System.out.println("========= print number from 20 - 1");
		
		
		for (int i=20; i>=1; i--){
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("===== print thr num from 10 -1 in one line");
		
		for(int a=10; a>=1; a--) {
			System.out.print(a+ " ");
		}
		
		System.out.println();
		System.out.println("========= print number from 1 -20 increment by 2");
		
		for (int i=1; i<=20; i+=2) {
		
		System.out.print(i+ " ");
		
		}
	}

}
