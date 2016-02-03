
/**
 * Demonstrate how unchecked exceptions need not be listed explicity.
 */
public class DemoUncheckedException {

	public static void main(String[] args) {
		foo1();
	}
	
	private static void foo1() {
		foo2();
	}
	
	private static void foo2() {
		foo3();
	}
	
	private static void foo3() {
		throw new UnsupportedOperationException();
	}
}
