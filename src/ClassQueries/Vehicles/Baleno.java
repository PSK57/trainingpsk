package ClassQueries.Vehicles;

import java.util.Scanner;

interface BalenoI {
	public abstract void BEngine();

	public abstract void BModel();

	public abstract void BColor();
}

class Baleno implements BalenoI {

	public String BMODEL, BCOLOR;

	public String BENGINE = "Engine of Design X";

	public int BYN, BTOT;

	public void BEngine() {
		System.out.println("This vehicle has " + BENGINE + ".");
	}

	public void BModel() {
		Scanner BModel = new Scanner(System.in);
		System.out.println("Chhose your Model :- " + "\nFor Baleno Model 1.7 (Rs. 1,50,000), type 1."
				+ "\nFor Baleno Model 1.8 (Rs. 2,00,000), type 2.");
		int Bmodel = BModel.nextInt();
		if (Bmodel == 1) {
			System.out.println("You chose Model 1.7.\n");
			BMODEL = "Model 1.7";
			BTOT = 150000;
			BColor();
		} else if (Bmodel == 2) {
			System.out.println("You chose Model 1.8.\n");
			BMODEL = "Model 1.8";
			BTOT = 200000;
			BColor();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			BModel();
		}
		BModel.close();
	}

	public void BColor() {
		Scanner BColor = new Scanner(System.in);
		System.out.println("Chhose Color for your Baleno :- " + "\nFor Red, type 1." + "\nFor Blue, type 2.");
		int Bcolor = BColor.nextInt();
		if (Bcolor == 1) {
			System.out.println("You chose Red Color.\n");
			BCOLOR = "Red Colored";
			BEngine();
		} else if (Bcolor == 2) {
			System.out.println("You chose Blue Color.\n");
			BCOLOR = "Blue Colored";
			BEngine();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			BColor();
		}
		BColor.close();
	}
}