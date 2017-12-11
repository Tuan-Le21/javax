package day1Exercises;

public class Exercises {

	public static void main(String[] args) {

		Exercises ex = new Exercises();

		ex.ex1();
		ex.ex2();
		ex.ex3("Hello World!");
		System.out.println(ex.ex4());
		System.out.println(ex.ex5(1, 8, true));
		ex.iteration(true);
		ex.ex6();
		ex.ex7();
		ex.ex8(15, 18);
	}

	public void ex1() {
		// Output hello world using system.out.println
		System.out.println("Hello World!");

	}

	public void ex2() {
		// Storing Hello world in a variable then calling out the variable using println
		String greeting = "Hello World!";
		System.out.println(greeting);
	}

	public void ex3(String greeting) {
		// This is using the parameter.
		System.out.println(greeting);
	}

	public String ex4() {
		// This is using the return type.
		return "hello World!";
	}

	public int ex5(int a, int b, boolean c) {
		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;

		} else if (c)
			return a + b;
		return a * b;
	}

	public void iteration(boolean c) {
		for (int i = 0; i < 10; i++) {
			System.out.println(ex5(i, i + 1, c));
		}
	}

	public void ex6() {

		int[] arrayOfInts = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		for (int i = 0; i < arrayOfInts.length; i++) {
			System.out.print(arrayOfInts[i] + " ");
		}

	}

	public void ex7() {
		int[] anArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < anArray.length; i++) {
			System.out.println(anArray[i] + " ");

		}
		for (int i = 0; i < anArray.length; i++) {
			System.out.println(anArray[i] * 10 + " ");
		}
	}

	public void ex8(int a, int b) {
		if (a > 21) {
			System.out.println("0");
		} else if (b > 21) {
			System.out.println("0");
		}

		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		}

	}

}
