package Basics;

public class DataTypes {
	// All variables declared at class level are global or class level variable
	// It will be accessible through out the class
	// Static methods can use only static variables and can call only static methods
	static int code;
	static boolean status;
	int empno = 70;

	public static void main(String args[]) {
		// All variables declared inside method are local variables
		// It will be accessible inside method only
		int a = 5;
		int k = 6;
		boolean flag = false;
		double amount = 123.50;
		int result = a + k;
		char c = 'c';
		byte t = 1;
		long account = 500;
		short xx = 200;
		System.out.println(result);
		System.out.println(flag);
		System.out.println(amount * a);
		System.out.println(amount + a);
		System.out.println(amount - a);
		System.out.println(c);
		System.out.println(t);
		System.out.println(account);
		System.out.println(xx);
		int x = add(5, 6);
		multiply();
		System.out.println(x);
	}

	public static int add(int i, int j) {
		System.out.println(code);
		System.out.println(status);
		int result = i + j;
		return result;
	}

	public static void multiply() {
		int count = 10;
		double code = 123.43;
		short calculation = 100;
		double res = count * code;
		int ress = count * calculation;
		System.out.println(res);
		System.out.println(ress);
	}
}