package ca.cmpt213.derivedconstructor;

/**
 * Base class which calls a method during its constructor.
 */
public class Base {
	private String baseMessage = "Hello!";
	
	public Base() {
		printMessage();
	}
	
	public void printMessage() {
		System.out.println(baseMessage.toString());
	}
}
