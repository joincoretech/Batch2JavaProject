package class10;

public class Practice2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// create 2D array that should hold the price and name of the fruits.
		
		String [][] fruits=new  String [2][3];
		
		// row 1
		fruits[0][0]= "$5";
		fruits[0][1]= "$10";
		fruits[0][2]= "$15";
		
		// row 2
		fruits[1][0]= "Apple";
		fruits[1][1]= "Orange";
		fruits[1][2]= "StrawBerry";
		
		System.out.println(fruits[1][0]+ ": "+ fruits[0][0]+ ", "+ fruits[1][1]+": "+ fruits[0][2]+ ", "+ 
		fruits[1][2]+ ": "+fruits[0][1]);
		
		
		// create 2D array that has 2 rows and 4 columns. 
		//one row will hold students name and other row will hold the students grade.
		
		String [][] grade= new String [2] [4];
		
		grade[0][0]= "Aslam";
		grade[0][1]= "Iqbal";
		grade[0][2]= "Mohammad Gul";
		grade[0][3]= "meraj";
		grade[1][0]="A";
		grade[1][1]="B";
		grade[1][2]="C";
		grade[1][3]="D";
		
		System.out.println(grade[0][0]+": "+ grade[1][0]+ ", "+ grade[0][1]+ ": "+ grade[1][1]+ ", "+grade[0][2]+ ": "+ grade[1][1] );
		
		
		
		}

}
