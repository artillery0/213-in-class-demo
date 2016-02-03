package ca.cmpt213.derivedconstructor;

/**
 * Derived class which overrides a method which is called
 * in the base class' constructor.
 * Demonstrates how an object can be called before it is initialized. 
 */
public class Derived extends Base {
	private String derivedMessage = "World!";
	
	public Derived () {
		super();
		
	}
	
	@Override
	public void printMessage() {
		super.printMessage();
		System.out.println(derivedMessage.toString());
	}
	
	
	public static void main(String[] args) {
//		new Base();
		new Derived();
	}
}
