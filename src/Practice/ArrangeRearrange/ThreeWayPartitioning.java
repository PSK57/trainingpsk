package Practice.ArrangeRearrange;

import java.util.Scanner;

public class ThreeWayPartitioning {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter low value :");
		int low = sc.nextInt();
		System.out.println("Enter high value :");
		int high = sc.nextInt();
		int arr1[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		int arr2[] = new int[arr1.length];
		int j = 0;
		if (low <= high) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] < low) {
					arr2[j] = arr1[i];
					j++;
				}
			}
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] >= low && arr1[i] <= high) {
					arr2[j] = arr1[i];
					j++;
				}
			}
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] > high) {
					arr2[j] = arr1[i];
					j++;
				}
			}
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i] + " ");
			}
		} else {
			System.out.println("Invalid low and high value.");
		}
		sc.close();
	}
}