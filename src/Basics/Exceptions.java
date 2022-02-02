package Basics;

public class Exceptions {
	public static void main(String args[]) {
		int arr[] = { 5, 7, 8, 6, 3, 1, 4, 9, 2 };
		int arr2[] = new int[arr.length + 1];
		try {
			for (int i = 0; i <= arr.length; i++) {
				arr2[i] = arr[i];
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("\n" + e);
			System.out.println("Next Output exceeded its array length, be careful...");
		} finally {
			arr2[arr2.length - 1] = 10;
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr2[i] + " ");
			}
		}
	}
}
