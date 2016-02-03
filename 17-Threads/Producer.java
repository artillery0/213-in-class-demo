package ca.threads.boundedqueue;

/**
 * An action that repeatedly inserts a greeting into a queue. By Cay Horstmann,
 * OOD&P 2nd ed.
 */
public class Producer implements Runnable {
	private static final int DELAY = 10;
	private String greeting;
	private BoundedQueue<String> queue;
	private int greetingCount;

	public Producer(String aGreeting, BoundedQueue<String> aQueue, int count) {
		greeting = aGreeting;
		queue = aQueue;
		greetingCount = count;
	}

	public void run() {
		try {
			int i = 1;
			while (i <= greetingCount) {
				if (!queue.isFull()) {
					queue.add(i + ": " + greeting);
					i++;
				}
				Thread.sleep((int) (Math.random() * DELAY));
			}
		} catch (InterruptedException exception) {
		}
	}
}
