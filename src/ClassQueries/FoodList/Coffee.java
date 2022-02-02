package ClassQueries.FoodList;

import java.util.Scanner;

interface CoffeeI {
	void CYesNo();

	void CSize();

	void CName();

	void CQuantity();
}

public class Coffee implements CoffeeI {

	Drinks D = new Drinks();
	public int CYN, CTOT, CQUAN;

	public String CSIZE, CNAME;

	public void CYesNo() {
		Scanner CYesNo = new Scanner(System.in);
		System.out.println("Do you want to buy a Coffee :- " + "\nFor Yes, type 1." + "\nFor No, type 0.");
		int Cyesno = CYesNo.nextInt();
		if (Cyesno == 1) {
			CSize();
			CYN = 1;
		} else if (Cyesno == 0) {
			D.DYesNo();
			CYN = 0;
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			CYesNo();
		}
		CYesNo.close();
	}

	public void CSize() {
		Scanner CSize = new Scanner(System.in);
		System.out.println("Chhose your Coffee Size :- " + "\nFor Small Size (Rs. 50), type 1."
				+ "\nFor Medium Size (Rs. 80), type 2." + "\nFor Large Size (Rs. 100), type 3.");
		int Csize = CSize.nextInt();
		if (Csize == 1) {
			System.out.println("You chose Small Sized Coffee.\n");
			CSIZE = "Small Sized";
			CTOT = 50;
			CName();
		} else if (Csize == 2) {
			System.out.println("You chose Medium Sized Coffee.\n");
			CSIZE = "Medium Sized";
			CTOT = 80;
			CName();
		} else if (Csize == 3) {
			System.out.println("You chose Large Sized Coffee.\n");
			CSIZE = "Large Sized";
			CTOT = 100;
			CName();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			CSize();
		}
		CSize.close();
	}

	public void CName() {
		Scanner CName = new Scanner(System.in);
		System.out.println("Chhose your Coffee :- " + "\nFor Cappuccino (Rs. 40), type 1."
				+ "\nFor Frappuccino (Rs. 30), type 2.");
		int Cname = CName.nextInt();
		if (Cname == 1) {
			System.out.println("You chose Cappuccino.\n");
			CNAME = "Cappuccino";
			CTOT = CTOT + 40;
			CQuantity();
		} else if (Cname == 2) {
			System.out.println("You chose Frappuccino.\n");
			CNAME = "Frappuccino";
			CTOT = CTOT + 30;
			CQuantity();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			CName();
		}
		CName.close();
	}

	public void CQuantity() {
		Scanner CQuantity = new Scanner(System.in);
		System.out.println("How many Coffee you want? :- ");
		int Cquantity = CQuantity.nextInt();
		if (Cquantity < 1) {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			CQuantity();
		} else {
			CTOT = CTOT * Cquantity;
			CQUAN = Cquantity;
		}
		CQuantity.close();
	}
}