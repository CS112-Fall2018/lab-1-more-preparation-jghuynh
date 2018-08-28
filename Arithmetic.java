public class Arithmetic {
	public static void main(String[] args) {
		// // private int a;
		// private int b;
		// private float x;
		// private float y;

		int a = 17;
		int b = 5;
		float x = 3.14f;
		float y = 2.77f;

		// Introduction
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("");

		//Addition
		System.out.println("Addition");
		System.out.println("a + b = " + (a + b));
		System.out.println("a + x = " + (a + x));
		System.out.println("a + y = " + (a + y));

			// Adding b to everything
		System.out.println("b + x = " + (b + x));
		System.out.println("b + y = " + (b + y));

			// Adding x to everything
		System.out.println("x + y = " + (x + y));
		System.out.println("");

		// Division
		System.out.println("Division");
			// Dividing a with everything
		System.out.println("a / b = " + (a / b));
		System.out.println("a / x = " + (a / x));
		System.out.println("a / y = " + (a / y));

			// Dividing b to everything
		System.out.println("b / a = " + (b / a));
		System.out.println("b / x = " + (b / x));
		System.out.println("b / y = " + (b / y));

			// Dividing x to everything
		System.out.println("x / a = " + (x / a));
		System.out.println("x / b = " + (x / b));
		System.out.println("x / y = " + (x / y));
	}
}