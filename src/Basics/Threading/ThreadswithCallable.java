package Basics.Threading;

import java.util.concurrent.Callable;

public class ThreadswithCallable implements Callable<String> {

	public String call() throws Exception {
		System.out.println("INSIDE CALL");
		return "Completed";
	}
}