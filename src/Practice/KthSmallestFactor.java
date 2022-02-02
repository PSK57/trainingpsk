package Practice;

import java.io.*;

public class KthSmallestFactor {

	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			String S[] = read.readLine().split(" ");

			int N = Integer.parseInt(S[0]);
			int K = Integer.parseInt(S[1]);

			System.out.println(Solution.kThSmallestFactor(N, K));
		}
	}
}

class Solution {
	static int kThSmallestFactor(int N, int K) {
		int i;
		if (N > 1) {
			for (i = 1; 2 * i <= N; i++) {
				if (N % i == 0 && --K == 0) {
					return i;
				}
			}
			if (--K == 0) {
				return N;
			}
			return -1;
		} else {
			return 1;
		}
	}
}