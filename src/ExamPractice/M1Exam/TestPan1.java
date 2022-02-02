package ExamPractice.M1Exam;

import java.util.*;
import java.util.regex.*;
import java.util.Scanner;

class TestPan1 {
	public static void main(String[] Args) {
		ArrayList<String> pcard = new ArrayList<String>();

		Pattern p = Pattern.compile("[A-Z]{5}[0-9]{4}([A-Z]|[a-z]{1})");

		pcard.add("ABCDE1370F"); // Valid
		pcard.add("GHIj1390k"); // Invalid bcz only first 3 are capital letters 4th is small alphabet
		pcard.add("BDQPK6899L"); // valid
		pcard.add("MNOP1660Q"); // Invalid bcz 4 are capital letters
		pcard.add("UVWXY3289y"); // Valid
		pcard.add("opqR6789S"); // Invalid bcz first 3 are capital letters
		pcard.add("BDQPK7931L"); // Valid
		pcard.add("BDQPK6m66L"); // InValid

		Scanner scan = new Scanner(System.in);

		System.out.println("Validating PAN Card Numbers");
		// String Pan = scan.next();
		for (String Pan : pcard) {
			Matcher M = p.matcher(Pan);
			if (M.matches()) {
				System.out.println("Valid PAN Card\n");
			} else {
				System.out.println("Invalid PAN Card\n");
			}
			scan.close();
		}
	}
}