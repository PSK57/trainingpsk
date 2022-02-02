package Basics;

import java.util.Scanner;

public class Ternary {
	public static void main(String args[]) {
		Scanner A = new Scanner(System.in);
		Scanner B = new Scanner(System.in);
		System.out.print("Enter First Input :- ");
		int a = A.nextInt();
		System.out.print("Enter Second Input :- ");
		int b = B.nextInt();
		int c = (a > b ? add(a, b) : subtract(a, b));
		System.out.println(c);
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
