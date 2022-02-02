package Basics;

public class IfElseIf {

	public static void main(String args[]) {
		int a;
		float b;
		for (a = 0; a < 3; a++) {
			if (a == 1) {
				b = aggregate(85);
				System.out.println("This school provided an average aggregate marking of :- " + b + " GPA");
			} else if (a == 2) {
				b = percent(85);
				System.out.println("This school provided an average percentage marking of :- " + b + "%");
			} else {
				System.out.println("This school hasn't provided any sort of marking.");
			}
		}
	}

	public static float aggregate(float i) {
		float j = (i * 96) / 1000;
		return j;
	}

	public static int percent(int i) {
		return i;
	}
}