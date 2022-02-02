package Practice.ArrayRotations;

public class MinElement {

	public static void main(String args[]) {
		int ar[] = { 5, 6, 1, 2, 3, 4 };
		int t = ar[0];
		for(int i=1;i<ar.length;i++) {
			if(t>ar[i]) {
				t = ar[i];
			}
		}
		System.out.println(t);
	}
}