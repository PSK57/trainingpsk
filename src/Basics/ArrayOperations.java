package Basics;

import java.util.Scanner;

public class ArrayOperations {

	ArrayOperations() {
		count = 10;
		System.out.println(" Inside constructor ");
	}

	ArrayOperations(int i, int k) {
		count = 10;
		System.out.println(" Inside constructor " + i + " " + k);
	}

	public int count = 5;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("input " + input);
		int a[] = { 4, 5, 6, 7, 8 };
		int a1[] = new int[30];
		a1[0] = 10;
		a1[1] = 20;
		System.out.println("Arrays operations " + a.length);
		System.out.println("Arrays operations " + a1.length);
		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1 elements " + a1[i]);
		}
		ArrayOperations obj1 = new ArrayOperations();
		int res = obj1.add(5, 7);
		System.out.println(" res " + res);
		System.out.println(" values of count " + obj1.count);
		sc.close();
	}

	public int add(int i, int j) {
		return i + j + count;
	}
}