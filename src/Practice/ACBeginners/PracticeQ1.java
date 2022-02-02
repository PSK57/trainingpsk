package Practice.ACBeginners;

public class PracticeQ1 {

	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		for (int i = 0; i < 10; i++) {
			c = fibseries(a, b);
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public static int fibseries(int a, int b) {
		return a + b;
	}
}