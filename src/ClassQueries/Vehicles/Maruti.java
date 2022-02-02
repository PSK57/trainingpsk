package ClassQueries.Vehicles;

import java.util.Scanner;

interface MarutiI {
	public abstract void MModel();

	public abstract void MColor();
}

class Maruti implements MarutiI {

	Baleno B = new Baleno();

	public String MMODEL, MCOLOR;

	public String MENGINE = B.BENGINE;

	public int MYN, MTOT;

	public void MModel() {
		Scanner MModel = new Scanner(System.in);
		System.out.println("Chhose your Model :- " + "\nFor Maruti Model 9 (Rs. 1,40,000), type 1."
				+ "\nFor Maruti Model 10 (Rs. 1,80,000), type 2.");
		int Mmodel = MModel.nextInt();
		if (Mmodel == 1) {
			System.out.println("You chose Model 9.\n");
			MMODEL = "Model 9";
			MTOT = 140000;
			MColor();
		} else if (Mmodel == 2) {
			System.out.println("You chose Model 10.\n");
			MMODEL = "Model 10";
			MTOT = 180000;
			MColor();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			MModel();
		}
		MModel.close();
	}

	public void MColor() {
		Scanner MColor = new Scanner(System.in);
		System.out.println("Chhose Color for your Baleno :- " + "\nFor White, type 1." + "\nFor Black, type 2.");
		int Mcolor = MColor.nextInt();
		if (Mcolor == 1) {
			System.out.println("You chose White Color.\n");
			MCOLOR = "White Colored";
			B.BEngine();
		} else if (Mcolor == 2) {
			System.out.println("You chose Black Color.\n");
			MCOLOR = "Black Colored";
			B.BEngine();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			MColor();
		}
		MColor.close();
	}
}