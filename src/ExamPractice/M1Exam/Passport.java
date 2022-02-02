package ExamPractice.M1Exam;

import java.util.Scanner;

/*App#5(on Strings)
------------------------
->Accept a Passport Number as String, 
-> And test the following things:
	a) size must be 9
                b) first 4 should Capital case Alphabet characters
                c) 5,6,7 should be digits 
	b) 8th One is Lower case Alphabet characters
	c) 9th one must be a Number between 1-5.

Eg:- sample Passport Number: ABCD761t4  => Valid Passport Number.
*/

import java.util.regex.*;

class Passport {
	public static void main(String[] args) {
		Pattern P = Pattern.compile("[A-Z]{4}[0-9]{3}[a-z]{1}[1-5]{1}");
		System.out.println("Enter the pan card number to validate");
		Scanner inp = new Scanner(System.in);
		String pn = inp.next();
		Matcher M = P.matcher(pn);
		if (M.matches()) {
			System.out.println("valid Passport ");
		} else {
			System.out.println("Invalid Passport ");
		}
		inp.close();
	}
}