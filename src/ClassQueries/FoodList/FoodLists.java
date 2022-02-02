package ClassQueries.FoodList;

public class FoodLists {
	public static void main(String args[]) {
		Burger B = new Burger();
		Coffee C = new Coffee();
		Drinks D = new Drinks();
		B.BYesNo();
		C.CYesNo();
		D.DYesNo();
		int TOT = 0;
		if (B.BYN == 1) {
			System.out.println("You ordered " + B.BQUAN + " " + B.BSIZE + " " + B.BVEG + " with " + B.BTOP
					+ " which costs Rs. " + B.BTOT + ".");
			TOT = (B.BTOT + TOT);
		}
		if (B.BYN == 1 && C.CYN == 1) {
			System.out.println("Also,");
		}
		if (C.CYN == 1) {
			System.out.println(
					"You ordered " + C.CQUAN + " " + C.CSIZE + " " + C.CNAME + " which costs Rs. " + C.CTOT + ".");
			TOT = (C.CTOT + TOT);
		}
		if (D.DYN == 1 && C.CYN == 1) {
			System.out.println("And in addition,");
		}
		if (D.DYN == 1) {
			System.out.println(
					"You have " + D.DQUAN + " " + D.DSIZE + " " + D.DNAME + " which costs Rs. " + D.DTOT + ".");
			TOT = (D.DTOT + TOT);
		}
		if (C.CYN == 0 && B.BYN == 0 && D.DYN == 0) {
			System.out.println("Choose something bro.. Don't stay hungry..");
		}
		System.out.println("\nYour Total Amount is Rs. " + TOT + ".");
	}
}