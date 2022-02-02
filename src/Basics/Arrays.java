package Basics;

public class Arrays {
	public static void main(String args[]) {
		int[] a = { 4, 5, 6, 7, 8 };
		int a1[] = new int[30];
		a1[0] = 10;
		a1[1] = 20;

		System.out.println("Arrays operations " + a.length);
		System.out.println("Arrays operations " + a1.length);

		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1 elements " + a1[i]);
		}
	}
}
