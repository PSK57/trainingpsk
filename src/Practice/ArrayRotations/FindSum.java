package Practice.ArrayRotations;

import java.util.Scanner;

public class FindSum {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int ar[] = { 11, 15, 6, 8, 9, 10 };
		boolean b = false;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==inp) {
					b = true;
					break;
				} 
			}
		}
		System.out.println(b);
		sc.close();
	}
}