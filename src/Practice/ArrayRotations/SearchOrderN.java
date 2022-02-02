package Practice.ArrayRotations;

import java.util.Scanner;

public class SearchOrderN {

	public static void main(String args[]) {
		int ar[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int out = -1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==inp) {
				out = i;
			}
		}
		if(out>=0) {
			System.out.println("Found at index " + out);
		}
		else {
			System.out.println("Not found.");
		}
		sc.close();
	}
}