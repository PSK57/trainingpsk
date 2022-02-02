package Basics;

public class Loops {
	public static void main(String args[]) {
		int k = 0;
		for (int n = 20; n > 10; --n) {
			System.out.println("Value of n :- " + n);
		}

		while (k < 20) {
			if (k < 10) {
				System.out.println("Value of k :- " + k);
				k++;
			} else {
				k++;
				System.out.println("Value of k is " + k);
			}
		}

		do {
			System.out.println("Final Value of k is " + k);
		} while (k < 20);
	}
}
