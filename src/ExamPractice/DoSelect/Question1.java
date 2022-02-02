package ExamPractice.DoSelect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ArrayListOps {

	public static ArrayList<Integer> makeArrayListInt(int inp) {
		ArrayList<Integer> req = new ArrayList<>();
		for (int i = 0; i < inp; i++) {
			req.add(0);
		}
		return req;
	}

	public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		ArrayList<Integer> rev = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			rev.add(list.get(i));
		}
		return rev;
	}

	public static ArrayList<Integer> changeList(ArrayList<Integer> rev, int m, int n) {
		int a = rev.indexOf(m);
		rev.set(a, n);
		return rev;
	}
}

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(ArrayListOps.makeArrayListInt(inp));
		System.out.println(ArrayListOps.reverseList(list));
		System.out.println(ArrayListOps.changeList(ArrayListOps.reverseList(list), m, n));
		sc.close();
	}
}