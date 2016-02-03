package ca.threads.racecase;
/**
 * Computer zero by starting from 0, adding to it, and then subtracting from it.
 */
public class ZeroComputer {
	final static int NUM_STEPS = 100;
	volatile private int number;
	
	public int compute(int newValue) {
		number = newValue;
		
		int result = 0;
		for (int i = 0; i < NUM_STEPS; i++) {
			result += number;
		}
		for (int i = 0; i < NUM_STEPS; i++) {
			result -= number;
		}
		return result;
	}
}
