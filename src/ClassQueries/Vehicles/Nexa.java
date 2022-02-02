package ClassQueries.Vehicles;

import java.util.Scanner;

interface NexaI {
	public abstract void NModel();

	public abstract void NColor();
}

class Nexa implements NexaI {

	Baleno B = new Baleno();

	public String NMODEL, NCOLOR;

	public String NENGINE = B.BENGINE;

	public int NYN, NTOT;

	public void NModel() {
		Scanner NModel = new Scanner(System.in);
		System.out.println("Chhose your Model :- " + "\nFor Nexa Model 3.5 (Rs. 3,40,000), type 1."
				+ "\nFor Nexa Model 3.7 (Rs. 2,80,000), type 2.");
		int Nmodel = NModel.nextInt();
		if (Nmodel == 1) {
			System.out.println("You chose Model 3.5.\n");
			NMODEL = "Model 3.5";
			NTOT = 340000;
			NColor();
		} else if (Nmodel == 2) {
			System.out.println("You chose Model 3.7.\n");
			NMODEL = "Model 3.7";
			NTOT = 280000;
			NColor();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			NModel();
		}
		NModel.close();
	}

	public void NColor() {
		Scanner NColor = new Scanner(System.in);
		System.out.println("Chhose Color for your Baleno :- " + "\nFor White, type 1." + "\nFor Black, type 2.");
		int Ncolor = NColor.nextInt();
		if (Ncolor == 1) {
			System.out.println("You chose White Color.\n");
			NCOLOR = "White Colored";
			B.BEngine();
		} else if (Ncolor == 2) {
			System.out.println("You chose Black Color.\n");
			NCOLOR = "Black Colored";
			B.BEngine();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			NColor();
		}
		NColor.close();
	}
}