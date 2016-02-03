package ca.threads.primeui;
import java.util.Random;

/**
 * Exceptionally simplistic algorithm to check for prime number.
 * Picks a random number to check, and prints report to screen when done.
 */
public class FindPrimeTask implements Runnable {
	private static final long MAX_TEST = 1000000000;

	@Override
	public void run() {
		checkAndPrintIfPrime();
	}

	void checkAndPrintIfPrime() {
		long startTime = System.currentTimeMillis();
		
		Random rand = new Random();
		long testMe = Math.abs(rand.nextLong()) % MAX_TEST + MAX_TEST;
		//long testMe = 1234567890L;
		boolean isPrime = isPrime(testMe);

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		System.out.printf("%nIs %,15d prime? %-7b [Time: %,dms]%n", testMe, isPrime, duration);
	}

	boolean isPrime(long number) {
		boolean result = true;
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				result = false;
			}
			if (i % (MAX_TEST/50) == 0) {
				char symbol = (char) ('!' + (number % 25));
				System.out.print(symbol);
			}
			if (i % (MAX_TEST/10) == 0) {
				System.out.println();
			}
		}
		return result;		
	}
}
