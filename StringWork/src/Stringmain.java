
public class Stringmain {

	public static void main(String[] args) {
		System.out.println(DoubleChar("The"));
		System.out.println(getSandwich("breadjambread"));
		System.out.println(evenlySpaced(4, 6, 3));
		System.out.println(evenlySpaced(2, 4, 6));
		System.out.println(evenlySpaced(4, 6, 2));
		System.out.println(nTwice("Hello", 2));
		System.out.println(nTwice("Chocolate", 3));
		System.out.println(nTwice("Chocolate", 1));
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
		System.out.println(stringClean("yyzzza"));
		System.out.println(stringClean("abbbcdd"));
		System.out.println(stringClean("Hello"));

		int ans = fibonacci(13);
		System.out.println(ans);

		System.out.println(bunnyEars(0));
		System.out.println(bunnyEars(1));
		System.out.println(bunnyEars(2));
	}

	// The
	public static String DoubleChar(String input) {
		String tmp = "";

		for (int i = 0; i < input.length(); i++) {
			tmp += input.charAt(i);
			tmp += input.charAt(i);
		}

		return tmp;

	}

	public static String getSandwich(String input) {
		int firstBread = input.indexOf("bread");
		int secondBread = input.lastIndexOf("bread");
		if (firstBread == -1 || secondBread == -1) {
			return "";
		}
		return input.substring(firstBread + 5, secondBread);

	}

	public static boolean evenlySpaced(int a, int b, int c) {
		int large = Math.max(a, Math.max(b, c));
		int small = Math.min(a, Math.min(b, c));
		int medium = (a + b + c) - (large + small);

		return ((large - medium) == (medium - small));
	}

	public static String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n, str.length());

	}

	public static boolean endsLy(String str) {

		if (str.length() < 2) {
			return false;
		}
		if (str.substring(str.length() - 2).equals("ly"))
			return true;
		else
			return false;

	}

	public static String stringClean(String str) {

		if (str.length() < 2)
			return str;

		if (str.charAt(0) == str.charAt(1)) {

			return stringClean(str.substring(1));
		} else {
			return str.charAt(0) + stringClean(str.substring(1));
		}
	}

	public static int fibonacci(int n) {
		// fibonacci = x = x-1 + x-2

		int[] fib = new int[n + 1];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			System.out.print(fib[i]);

		}

		return fib[n];

	}

	public static int bunnyEars(int bunnies) {

		if (bunnies == 0) {
			return 0;

		}
		return 2 + bunnyEars(bunnies - 1);

	}

}
