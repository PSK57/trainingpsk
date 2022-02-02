package Basics;

import java.util.Scanner;

public class BODMASOperations {
	public static void main(String args[]) {
		Scanner A = new Scanner(System.in);
		Scanner B = new Scanner(System.in);
		System.out.print("Enter First Input :- ");
		int a = A.nextInt();
		System.out.print("Enter Second Input :- ");
		int b = B.nextInt();
		if (a > b) {
			int c = add(a, b);
			System.out.println("First Input is greater, so, the Summation is :- " + c);
		} else if (a < b) {
			int c = subtract(a, b);
			System.out.println("Second Input is greater, so, the Subtraction is :- " + c);
		} else {
			System.out.println("Both values are the same");
		}
		A.close();
		B.close();
	}

	public static int add(int i, int j) {
		return i + j;
	}

	public static int subtract(int i, int j) {
		return j - i;
	}
}
