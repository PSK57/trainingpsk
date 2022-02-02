package Basics;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String args[]) {
		ReverseOfString rev = new ReverseOfString();
		Scanner A = new Scanner(System.in);
		String a = A.next();
		System.out.println("The reverse of the input is " + rev.reverse(a) + ".");
		A.close();
	}

	public String reverse(String a) {
		int i = a.length();
		char ch;
		String b = "";
		for (int j = 0; j < i; j++) {
			ch = a.charAt(j);
			b = ch + b;
		}
		return b;
	}
}
