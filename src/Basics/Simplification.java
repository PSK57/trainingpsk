package Basics;

public class Simplification {

	public static void main(String args[]) {
		int a = add(17, 4);
		System.out.println("Summation is " + a + ".");
		int b = subtract(17, 4);
		System.out.println("Subtraction is " + b + ".");
		int c = multiply(17, 4);
		System.out.println("Multiplication is " + c + ".");
		int d = quotient(17, 4);
		System.out.println("Quotient is " + d + ".");
		int e = remainder(17, 4);
		System.out.println("Remainder is " + e + ".");
	}

	public static int add(int i, int j) {
		return i + j;
	}

	public static int subtract(int i, int j) {
		return i - j;
	}

	public static int multiply(int i, int j) {
		return i * j;
	}

	public static int quotient(int i, int j) {
		return i / j;
	}

	public static int remainder(int i, int j) {
		return i % j;
	}
}