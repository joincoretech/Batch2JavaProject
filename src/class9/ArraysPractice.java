package class9;

public class ArraysPractice {

	public static void main(String[] args) {
		
		
		int num=10;
		num=20;
		num=15;
		num+=5;
		System.out.println(num);
		
		int [] number=new int[5];
		
		number[0]=5;
		number[1]= 15;
		number[2]= 10;
		number[3]= 20;
		number[4]= 25;
		
		System.out.println(number[4]);
		System.out.println(number[1]);
		
		
		double [] num1=new double[3];
		
		num1[0]= 10.15;
		num1[1]= 5.25;
		num1[2]= 25.10;
		//num1[3]= 30.10; we will get out of bond error
		System.out.println("number3 "+ num1[2]+ " number1 "+ num1[0]+" number2 " +num1[1]);
		
		
		String [] arrayOfNames=new String [2];
		
		arrayOfNames[0]= "Masodi";
		arrayOfNames[1]= "Aslam";
		
		System.out.println(arrayOfNames[0] + " second student "+ arrayOfNames[1]);
		
       System.out.println(arrayOfNames.length);// length method will show us the size of array
       
       
       boolean [] b= new boolean[3];
       
       b[0]= true;
       b[1]= false;
       b[2]= true;
       
       System.out.println(b[1]);
       
       int size=b.length;
       System.out.println("size of array is "+size);
       
       // declaration
       int [] num2;
       
       // Initialization
       num2=new int[2];
       
       num2[0]=10;
       num2[1]= 5;
	}

}
