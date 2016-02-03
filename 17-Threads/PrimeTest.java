package ca.threads.primeui;
/**
 * Text-based demo of running a task with threads.
 */
public class PrimeTest {
	public static void main(String[] args) {
		System.out.println("Starting running main()!");

		spawnBackgroundThread();
		//spawnSomeBackgroundThreads();
		
		System.out.println("Done running main()!");
	}

	private static void spawnBackgroundThread() {
		// Task to run
		Runnable myTask = new FindPrimeTask();
		
		// Spawn a thread		
		Thread myThread = new Thread(myTask);
		myThread.start();
	}		
	
	private static void spawnSomeBackgroundThreads() {
		for (int i = 0; i < 4; i ++) {
			spawnBackgroundThread();
		}	
	}		
}
