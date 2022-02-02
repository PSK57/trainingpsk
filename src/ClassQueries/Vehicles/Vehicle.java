package ClassQueries.Vehicles;

import java.util.Scanner;

interface VehicleI {
	public abstract void VOptions();
}

class Vehicle2 implements VehicleI {

	public int VSELECT;

	public void VOptions() {
		Baleno B = new Baleno();
		Nexa N = new Nexa();
		Maruti M = new Maruti();
		Scanner VOptions = new Scanner(System.in);
		System.out.println("Which Car do you want to buy :- " + "\nFor a Baleno, type 1." + "\nFor a Nexa, type 2."
				+ "\nFor a Maruti, type 3.");
		int Voption = VOptions.nextInt();
		if (Voption == 1) {
			VSELECT = Voption;
			B.BModel();
		} else if (Voption == 2) {
			VSELECT = Voption;
			N.NModel();
		} else if (Voption == 3) {
			VSELECT = Voption;
			M.MModel();
		} else {
			System.out.println("INVALID INPUT, please put a valid Input.\n");
			VOptions();
		}

		if (VSELECT == 1) {
			System.out.println("So, you want a " + B.BCOLOR + " Baleno " + B.BMODEL + " having an " + B.BENGINE + ".");
			System.out.println("The cost of the Baleno that you like will be Rs. " + B.BTOT + "/- only.");
		} else if (VSELECT == 2) {
			System.out.println("So, you want a " + N.NCOLOR + " Nexa " + N.NMODEL + " having an " + N.NENGINE + ".");
			System.out.println("The cost of the Nexa that you like will be Rs. " + N.NTOT + "/- only.");
		} else if (VSELECT == 3) {
			System.out.println("So, you want a " + M.MCOLOR + " Maruti " + M.MMODEL + " having an " + M.MENGINE + ".");
			System.out.println("The cost of the Maruti that you like will be Rs. " + M.MTOT + "/- only.");
		}
		VOptions.close();
	}
}

public class Vehicle {

	public static void main(String args[]) {
		Vehicle2 V = new Vehicle2();
		V.VOptions();
	}
}