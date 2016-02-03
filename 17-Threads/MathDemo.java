package ca.threads.racecase;

/**
 * Program to demo thread interactions.
 */
public class MathDemo {
	final static int NUM_TASK = 10;

	public static void main(String[] args) {
		// Demo ZeroComputer:
//		System.out.println("Test 1: " + new ZeroComputer().compute(1));
		
		// Demo ZeroComputer with threads
		ZeroComputer zeroComputer = new ZeroComputer();
//		ZeroComputer zeroComputer = new SafeZeroComputer();
		
		for (int i = 1; i <= NUM_TASK; i ++) {
			Runnable myTask = new MathTask(i, zeroComputer);
			Thread myThread = new Thread(myTask);
			myThread.start();
		}
	}
}
