
/**
 * Create a greeting for a given name. This is a demo class to show 
 * how to use Java classes.
 * @author student
 *
 */
public class HelloWorld {
	private String name;
	private static int countOfInstances = 0;
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public HelloWorld(String name) {
		this.name = name;
		countOfInstances++;
	}
	
	/**
	 * Sets the name.
	 * @param name New value for name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGreeting() {
		return "Hello Java World, from " + name;
	}
	
	public static int getCountOfInstances() {
		return countOfInstances;
	}
	

//	public static void main(String[] args) {
//		HelloWorld greeter = new HelloWorld("CMPT 213");
//		HelloWorld mySecondGreeter = null;
////		String msg = greeter.getGreeting();
//		displayMessageFromHelloWorld(mySecondGreeter);
//	
//	}
//
//	private static void displayMessageFromHelloWorld(HelloWorld mySecondGreeter) {
//		String msg = mySecondGreeter.getGreeting();
//		System.out.println(msg);		
//	}
}
