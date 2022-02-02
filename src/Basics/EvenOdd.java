package Basics;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		EvenOdd eo = new EvenOdd();
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();
		eo.evenodd(a);
		A.close();
	}

	void evenodd(int a) {
		if (a % 2 == 0) {
			System.out.print("This is an Even Number.");
		} else {
			System.out.print("This is an Odd Number.");
		}
	}
}
