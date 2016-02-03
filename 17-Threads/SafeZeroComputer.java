package ca.threads.racecase;

import java.util.concurrent.locks.ReentrantLock;

/**
 * THREAD SAFE Computer zero by starting from 0, adding to it, and then subtracting from it.
 */
public class SafeZeroComputer extends ZeroComputer{
	ReentrantLock computeLock = new ReentrantLock();

	@Override
	public int compute(int newValue) {

		computeLock.lock();
		try {
			// Protected critical section
			// Do any work you like here accessing the protected resources.
			return super.compute(newValue);
		} finally {
			computeLock.unlock();
		}
	}
}
