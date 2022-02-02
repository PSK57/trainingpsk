package ExamPractice.MCQs;

public class MCQ3 {

	public void myMethod() {
		System.out.println("Method");
	}

	{
		System.out.println(" Instance Block");
	}

	public void First_C() {
		System.out.println("Constructor ");
	}

	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		MCQ3 c = new MCQ3();
		c.First_C();
		c.myMethod();
	}
}