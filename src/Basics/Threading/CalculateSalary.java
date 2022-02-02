package Basics.Threading;

public class CalculateSalary {
	public synchronized void salarycalculation() throws InterruptedException {
		System.out.println("Inside salarycalculation ");
	}

	public synchronized void leavecalculation() {
		System.out.println("Inside leavecalculation ");
	}

	public void calculateBonus() {
		System.out.println("calculateBonus before synchronized ");
		synchronized (this) {
			System.out.println("calculateBonus ");
		}
	}
}