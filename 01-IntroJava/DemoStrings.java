import java.util.Date;


public class DemoStrings {

	public static void main(String[] args) {
		demoStringLength();
		demoStringImmutable();
		demoStringConcat();
		demoStringToNumber();
	}
	
	private static void demoStringLength() {
		String hello = "Hello world";
		int lengthHello = hello.length();
		int myLength = "hello there".length();
	}

	private static void demoStringImmutable() {
		// Strings are immutable: once created, it cannot be changed.
		String msg = "h";
		msg = msg + "i";
		msg += "!";
		
		// Check for equality:
		if (msg == "hi!") {
			System.out.println("They are the same");
		} else {
			System.out.println("They are different: " + msg);
		}
	}
	
	static void demoStringConcat() {
		// String concatenation with numbers.
		String guess1 = "hello " + 42;
		String guess2 = "hello " + 4 + 2;
		String guess3 = 42 + "hello";
		String guess4 = 4 + 2 + "hello";
		String guess5 = new Integer(42).toString();
		
		System.out.println("Guess 1: " + guess1);
		System.out.println("Guess 2: " + guess2);
		System.out.println("Guess 3: " + guess3);
		System.out.println("Guess 4: " + guess4);
		System.out.println("Guess 5: " + guess5);
	}

	static void demoStringToNumber() {
		// Convert from string to int.
		String myInput = "42";
		int theValue = Integer.parseInt(myInput);
		
		// Demo time:
		Date now = new Date();
		String msg = "Currently " + now;
		System.out.println(msg);
		
		// Demo bad conversion
		int oops = Integer.parseInt("Oops");
	}
}
