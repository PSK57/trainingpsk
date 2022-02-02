package Basics.Lambdas;

import java.util.*;

public class Timer {

	public static int inp, min1, min2;
	Runnable pause = () -> {
		for (int i = 1; i <= inp; i++) {
			int j = i % 10, k = i / 10;
			if (k == 6) {
				inp = inp - 60;
				i = -1;
				++min1;
				if (min1 == 10) {
					min1 = 0;
					++min2;
				}
				continue;
			}
			System.out.println("Time : " + min2 + min1 + ":" + k + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get Up Champ!!! Time's up...");
		System.out.println(
				(System.currentTimeMillis() / 1000 / 3600 / 24 / 365) + " Years have passed since 1 Jan, 1970.");
		System.out.println("GET UP NOW!!!");
	};

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Timer for (in seconds) : ");
		inp = input.nextInt();
		input.close();
		Timer T = new Timer();
		Thread th = new Thread(T.pause);
		th.start();
	}
}