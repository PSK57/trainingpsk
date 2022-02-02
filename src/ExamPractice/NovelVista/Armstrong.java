package ExamPractice.NovelVista;

import java.util.*;

public class Armstrong {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		input.close();
		int B = output(inp);
		if (B == inp) {
			System.out.println("Yes");
		} else if (B != inp) {
			System.out.println("No");
		}
	}

	public static int output(int n) {
		int a = 0, i, s;
		i = n;
		s = n / 10;
		if (s >= 1 && s < 10) {
			while (i != 0) {
				a = a + (int) (Math.pow(i % 10, 2));
				i = i / 10;
			}
		} else if (s < 1) {
			while (i != 0) {
				a = a + (int) (Math.pow(i % 10, 1));
				i = i / 10;
			}
		}
		return a;
	}
}