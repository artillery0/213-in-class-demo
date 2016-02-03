
/**
 * Test the HelloWorld class as a unit test and demonstrate
 * some basic Java.
 *
 */
public class HelloWorldTest {
	
	private static final int WIDTH = 10;
	private static final int HEIGHT = 20;

	
	// Static Functions
	public static void main(String[] args) {
		System.out.println("Num instances of HW: " 
				+ HelloWorld.getCountOfInstances());
		
		HelloWorld greeter = new HelloWorld("CMPT 213");
		String message = greeter.getGreeting();
		System.out.println(message);

		System.out.println("Num instances of HW: " 
				+ HelloWorld.getCountOfInstances());

//		System.out.println("Name is: " + greeter.name);
		
		demoPrimitivePromotion();
		demoPromotion();
		demoMultipleReferences();
//		demoExceptions();
		demoControlStructures();
		demoGuessOutput();
	}





	
	private static void demoPrimitivePromotion() {
		boolean x = false;

		if (x = false) {
			System.out.println("HEllo");
		}
	}

	private static void demoPromotion() {
		double area = WIDTH * HEIGHT;
		System.out.println("Area is: " + area);
	}

	private static void demoMultipleReferences() {
		HelloWorld world1 = new HelloWorld("multiple");
		HelloWorld world2 = world1;
		world1 = new HelloWorld("Second");
		world2 = world1;
	}

	private static void demoExceptions() {
		HelloWorld nullWorld = null;
//		nullWorld.getGreeting();
		throw new RuntimeException("Uh dude! It didn't work!");
	}
	
	private static void demoControlStructures() {
		boolean hasSeenElvis = true;
		int age = 15;
		
		// Use explanatory variable
		boolean isSenior = age > 65;
		if (hasSeenElvis || isSenior) {
			System.out.println("You are wise.");
		}
		long complexCounter = 10;
		for (int i = 0; i < 5; i++) {
			System.out.println("Current number: " + i );
			
			// BAD IDEA! Has a side effect, and mixes process with display.
//			System.out.println("  Counter is  : " + complexCounter--);
			System.out.println("  Counter is  : " + --complexCounter);
		}
	}
	
	private static void demoGuessOutput() {
		int count = 10;
		while (count > 0) {
			count--;
			if (count == 5) {
				continue;
			}
			System.out.println(count);
			if (count % 3 == 0 && count < 5) {
				break;
			}
		}
	}
}
