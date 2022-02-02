package Practice;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");

				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
				} // -128 to 127

				int c = (int) (Math.pow(2, 15));
				if (x >= -(c + 1) && x <= c) {
					System.out.println("* short");
				} // -33768 to 33767

				int b = (int) (Math.pow(2, 31));
				if (x >= -(b + 1) && x <= b) {
					System.out.println("* int");
				} // -2147483648 to 2147483647

				long a = (long) (Math.pow(2, 63));
				if (x >= -(a + 1) && x <= a) {
					System.out.println("* long");
				} // -9223372036854775808 to 9223372036854775807

				/*
				 * if(x >= -128 && x<=127) System.out.println("* byte"); 
				 * if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) System.out.println("* short");
				 * if(x >= -Math.pow(2, 31) && x <= Math.pow(2,31) - 1) System.out.println("* int");
				 * if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) System.out.println("* long");
				 */

			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
		sc.close();
	}
}