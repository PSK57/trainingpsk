package Basics.Threading;

public class ThreadwithRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Inside run");
		checkprice();
		CalculateSalary cal = new CalculateSalary();
		try {
			cal.salarycalculation();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cal.leavecalculation();
		cal.calculateBonus();
	}

	public static void main(String args[]) throws InterruptedException {
		ThreadwithRunnable obj = new ThreadwithRunnable();
		for (int i = 0; i < 2; i++) {
			Thread T = new Thread(obj);
			T.start();
		}
	}

	public void checkprice() {
		System.out.println("Inside checkprice");
	}
}