package Basics.Threading;

public class Data2 implements Runnable {

	public void run() {
		System.out.println("Inside run2");
		CalculateSalary cal = new CalculateSalary();
		try {
			cal.salarycalculation();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cal.leavecalculation();
		cal.calculateBonus();
	}
}
