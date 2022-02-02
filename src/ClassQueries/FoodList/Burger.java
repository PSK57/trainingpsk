package ClassQueries.FoodList;

import java.util.Scanner;

interface BurgerI {
	void BYesNo();

	void BSize();

	void BVeg();

	void BToppings();

	void BQuantity();
}

public class Burger implements BurgerI {

	Coffee C = new Coffee();

	public String BSIZE, BVEG, BTOP;

	public int BYN, BTOT, BQUAN;

	public void BYesNo() {
		Scanner BYesNo = new Scanner(System.in);
		System.out.println("Do you want to buy a Burger :- " + "\nFor Yes, type 1." + "\nFor No, type 0.");
		int Byesno = BYesNo.nextInt();
		if (Byesno == 1) {
			BSize();
			BYN = 1;
		} else if (Byesno == 0) {
			C.CYesNo();
			BYN = 0;
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			BYesNo();
		}
		BYesNo.close();
	}

	public void BSize() {
		Scanner BSize = new Scanner(System.in);
		System.out.println("Chhose your Burger Size :- " + "\nFor Small Size (Rs. 50), type 1."
				+ "\nFor Medium Size (Rs. 80), type 2." + "\nFor Large Size (Rs. 100), type 3.");
		int Bsize = BSize.nextInt();
		if (Bsize == 1) {
			System.out.println("You chose Small Sized Burger.\n");
			BSIZE = "Small Sized";
			BTOT = 50;
			BVeg();
		} else if (Bsize == 2) {
			System.out.println("You chose Medium Sized Burger.\n");
			BSIZE = "Medium Sized";
			BTOT = 80;
			BVeg();
		} else if (Bsize == 3) {
			System.out.println("You chose Large Sized Burger.\n");
			BSIZE = "Large Sized";
			BTOT = 100;
			BVeg();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			BSize();
		}
		BSize.close();
	}

	public void BVeg() {
		Scanner BVeg = new Scanner(System.in);
		System.out.println("Chhose your Burger Patty :- " + "\nFor Veg Patty (Rs. 10), type 1."
				+ "\nFor Non-Veg Patty (Rs. 20), type 2.");
		int Bveg = BVeg.nextInt();
		if (Bveg == 1) {
			System.out.println("You chose Veg Patty.\n");
			BVEG = "Veg Burger";
			BTOT = BTOT + 10;
			BToppings();
		} else if (Bveg == 2) {
			System.out.println("You chose Non-Veg Patty.\n");
			BVEG = "Non-Veg Burger";
			BTOT = BTOT + 20;
			BToppings();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			BVeg();
		}
		BVeg.close();
	}

	public void BToppings() {
		Scanner BTop = new Scanner(System.in);
		System.out
				.println("Chhose your Topping :- " + "\nFor Oregano (Rs. 5), type 1." + "\nFor Ketchup (Rs. 3), type 2."
						+ "\nFor Mayonnaise (Rs. 7), type 3." + "\nFor Chilly Flakes (Rs. 5), type 4.");
		int Btop = BTop.nextInt();
		if (Btop == 1) {
			System.out.println("You chose Oregano as your Topping.\n");
			BTOP = "Oregano as your Topping";
			BTOT = BTOT + 5;
			BQuantity();
		} else if (Btop == 2) {
			System.out.println("You chose Ketchup as your Topping.\n");
			BTOP = "Ketchup as your Topping";
			BTOT = BTOT + 3;
			BQuantity();
		} else if (Btop == 3) {
			System.out.println("You chose Mayonnaise as your Topping.\n");
			BTOP = "Mayonnaise as your Topping";
			BTOT = BTOT + 7;
			BQuantity();
		} else if (Btop == 4) {
			System.out.println("You chose Chilly Flakes as your Topping.\n");
			BTOP = "Chilly Flakes as your Topping";
			BTOT = BTOT + 5;
			BQuantity();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			BToppings();
		}
		BTop.close();
	}

	public void BQuantity() {
		Scanner BQuantity = new Scanner(System.in);
		System.out.println("How many Burgers you want? :- ");
		int Bquantity = BQuantity.nextInt();
		if (Bquantity < 1) {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			BQuantity();
		} else {
			BTOT = BTOT * Bquantity;
			BQUAN = Bquantity;
		}
		BQuantity.close();
	}
}