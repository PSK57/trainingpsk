package Basics.Threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuteOperations {

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Future<String> future = executorService.submit(new ThreadswithCallable());
		System.out.println(future.get());

		executorService.execute(new ThreadwithRunnable());// free
		executorService.execute(new ThreadwithRunnable());// free2
		executorService.execute(new ThreadwithRunnable());// free
		executorService.execute(new Data2());// free2
		executorService.shutdown();

	}
}