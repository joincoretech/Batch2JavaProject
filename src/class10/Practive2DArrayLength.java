package class10;

public class Practive2DArrayLength {

	public static void main(String[] args) {
		
		
		String [][] countries= {
				{"Afghanistan", "Iran", "Japan"},
				{"German", "England", "France", "Itly"},
				{"USA", "Canada", "Maxico", "Brazil", "West indies"}		
				
		};
		
		System.out.println("the row numbers "+ countries.length);
		System.out.println("First row elements "+countries[0].length);
		System.out.println("second row elements "+countries[1].length);
		System.out.println("third row elements "+countries[2].length);
		
		
		for (int r=0; r<countries.length; r++) {
			
			for (int c=0; c<countries[r].length; c++ ) {
				
				System.out.print(countries[r][c]+" ");
			}
		}
		
		
		System.out.println();
		
		System.out.println(" ===== print sd array element use fro each looop ======");
		
		for (String [] country:countries) {
			
			for (String c: country) {
				
				System.out.print(c+ " ** ");
			}
		}
		
	}

}
