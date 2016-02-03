package ca.threads.boundedqueue;

/**
 * An action that repeatedly removes a greeting from a queue. By Cay Horstmann,
 * OOD&P 2nd ed.
 */
public class Consumer implements Runnable {
	private static final int DELAY = 10;

	private BoundedQueue<String> queue;
	private int greetingCount;

	public Consumer(BoundedQueue<String> aQueue, int count) {
		queue = aQueue;
		greetingCount = count;
	}

	public void run() {
		try {
			int i = 1;
			while (i <= greetingCount) {
				i += consumeIfAble();
				Thread.sleep((int) (Math.random() * DELAY));
			}
		} catch (InterruptedException exception) {
		}
		System.out.println("Consumer done.");
	}

	// Return the count of elements consumed: 0 or 1.
	private int consumeIfAble() {
		if (queue.isEmpty()) {
			return 0;
		}

		String greeting = queue.remove();
		System.out.println(greeting);
		return 1;
	}

}
