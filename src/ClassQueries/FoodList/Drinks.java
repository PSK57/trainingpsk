package ClassQueries.FoodList;

import java.util.Scanner;

interface DrinksI {
	void DYesNo();

	void DSize();

	void DName();

	void DQuantity();
}

public class Drinks implements DrinksI {

	public int BYN, CYN, DYN, BTOT, CTOT, DTOT, BQUAN, CQUAN, DQUAN;

	public String DSIZE, DNAME;

	public void DYesNo() {
		Scanner DYesNo = new Scanner(System.in);
		System.out.println("Do you want to buy a Drink :- " + "\nFor Yes, type 1." + "\nFor No, type 0.");
		int Dyesno = DYesNo.nextInt();
		if (Dyesno == 1) {
			DSize();
			DYN = 1;
		} else if (Dyesno == 0) {
			DYN = 0;
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			DYesNo();
		}
		DYesNo.close();
	}

	public void DSize() {
		Scanner DSize = new Scanner(System.in);
		System.out.println("Chhose your Drink Size :- " + "\nFor Small Size (Rs. 50), type 1."
				+ "\nFor Medium Size (Rs. 80), type 2." + "\nFor Large Size (Rs. 100), type 3.");
		int Dsize = DSize.nextInt();
		if (Dsize == 1) {
			System.out.println("You chose Small Sized Drink.\n");
			DSIZE = "Small Sized";
			DTOT = 50;
			DName();
		} else if (Dsize == 2) {
			System.out.println("You chose Medium Sized Drink.\n");
			DSIZE = "Medium Sized";
			DTOT = 80;
			DName();
		} else if (Dsize == 3) {
			System.out.println("You chose Large Sized Drink.\n");
			DSIZE = "Large Sized";
			DTOT = 100;
			DName();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			DSize();
		}
		DSize.close();
	}

	public void DName() {
		Scanner DName = new Scanner(System.in);
		System.out.println(
				"Chhose your Drink :- " + "\nFor Diet Coke (Rs. 40), type 1." + "\nFor Pepsi (Rs. 20), type 2.");
		int Dname = DName.nextInt();
		if (Dname == 1) {
			System.out.println("You chose Diet Coke.\n");
			DNAME = "Diet Coke";
			DTOT = DTOT + 40;
			DQuantity();
		} else if (Dname == 2) {
			System.out.println("You chose Pepsi.\n");
			DNAME = "Pepsi";
			DTOT = DTOT + 20;
			DQuantity();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			DName();
		}
		DName.close();
	}

	public void DQuantity() {
		Scanner DQuantity = new Scanner(System.in);
		System.out.println("How many Drinks you want? :- ");
		int Dquantity = DQuantity.nextInt();
		if (Dquantity < 1) {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			DQuantity();
		} else {
			DTOT = DTOT * Dquantity;
			DQUAN = Dquantity;
		}
		DQuantity.close();
	}
}