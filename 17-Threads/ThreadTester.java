package ca.threads.boundedqueue;

/**
   This program runs two threads in parallel.
   By Cay Horstmann, OOD&P 2nd ed.
 */
public class ThreadTester
{
	public static void main(String[] args)
	{
		BoundedQueue<String> queue = new BoundedQueue<String>(10);
		final int GREETING_COUNT = 40;
		
		Runnable producer1 = new Producer("Hello, World!", queue, GREETING_COUNT);
		Runnable producer2 = new Producer("Goodbye, World!", queue, GREETING_COUNT);
		Runnable consumer = new Consumer(queue, 2 * GREETING_COUNT);

		Thread thread1 = new Thread(producer1);
		Thread thread2 = new Thread(producer2);
		Thread thread3 = new Thread(consumer);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}

