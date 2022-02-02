package ExamPractice.M1Exam;

import java.util.*;

public class Testapp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(num);
		if (n >= 0 && n <= 9) {
			System.out.println("single digit number:" + n);
		} else {
			while (n != 0) {
				int r = n % 10;
				if (n >= 0 && n <= 9) {
					sb.append(r);
					break;
				}
				sb.append(r);
				sb.append("*");
				n = n / 10;
			}
			sb.reverse();
			System.out.println("Multiple digits:" + sb.toString());
		}
		sc.close();
	}
}