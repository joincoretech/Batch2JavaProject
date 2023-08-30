package class4;

public class Practice2 {
 
	public static void main(String [] args) {
		
		/*
		 * Create a Java p ro g ra m a n d store va l u e s of m o r t g a g e rate a n
		 * d m o r t g a g e price. First, pro gram s h o u l d c h e c k if rate i s h
		 * i g h e r t h a n 4.5 user w i l l n o t buy a house, other wise user w i l l
		 * co nsider buying. Once user d e c i d e s to buy a ho use, if price of t h e
		 * h o u s e i s l arger t h a n 200000 t h a n user w i l l take a loan, o ther
		 * w ise us er w i l l p ay cash.
		 */
		// ctr+shift+/
		
		double rate= 4.4;
		
		int price= 2000005;
		
		if (rate > 4.5) {
			System.out.println("Rate is too hign customer will not buy a house");
		}else {
			System.out.println("Rate is lower enough customer will buy a house");
			if (price>200000) {
				System.out.println("customer will take loan");
			}else {
				System.out.println("Customer has enough money to buy a house");
			}
		}
	}
}
