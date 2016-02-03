package ca.threads.racecase;

/**
 * A task which tries to compute zero a bunch of times.
 */
public class MathTask implements Runnable {
	private static final int NUM_TRIALS = 50;
	private int taskNumber;
	private ZeroComputer myComputer;

	public MathTask(int taskNumber, ZeroComputer computer) {
		this.taskNumber = taskNumber;
		this.myComputer = computer;
	}

	@Override
	public void run() {
		for (int i = 0; i < NUM_TRIALS; i++) {
			int result = myComputer.compute(taskNumber);
			if (result != 0) {
				System.out.printf("Task %3d answer = %10d%n",
						taskNumber, result);
			}
		}
	}
}