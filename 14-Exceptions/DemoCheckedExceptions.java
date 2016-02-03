import java.io.FileNotFoundException;

/**
 * Demonstrate what code looks like with checked exceptions.
 */
public class DemoCheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		foo1();
	}

	private static void foo1() throws FileNotFoundException {
		foo2();
	}

	private static void foo2() throws FileNotFoundException {
		foo3();
	}

	private static void foo3() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}
