/**
 * Example to show how exceptions can propagate, or be caught and handled.
 * 
 * @author Lewis/Loftus, modified by B. Fraser.
 * 
 */
public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("Main Start");
		level1();
		System.out.println("Main End");
	}

	static void level1() {
		System.out.println("Level 1 Start");
		try {
			level2();
		} catch (ArithmeticException e) {
			System.out.println("Caught Exception: " + e.getMessage());
			System.out.println("Call Stack Trace:");
			e.printStackTrace(System.out);
		}
		// finally{
		// System.out.println("Finally!!");
		// }
		System.out.println();
		System.out.println("Level 1 End");
	}

	static void level2() {
		System.out.println("Level 2 Start");
		level3();
		System.out.println("Level 2 End");
	}

	static void level3() {
		System.out.println("Level 3 Start");
		int a = 1 / 0;
		System.out.println("Level 3 End, a = " + a);
	}
}
