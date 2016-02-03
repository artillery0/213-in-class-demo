package ca.threads.interrupting;

public class JokeTask implements Runnable {
	private static final long DELAY = 1000;
	private static final String[] jokeText = {
			"Knock knock.",
			"Who's there?",
			"Interrupting cow.",
			"Interrupting cow who?",
			"um... er.. ahh....."
	};

	@Override
	public void run() {
		try {
			tellJokeForever();
		} catch (InterruptedException e) {
			System.out.println("MOOOOOO");
			e.printStackTrace();
		}
	}

	private void tellJokeForever() throws InterruptedException {
		int i = 0;
		while (true) {
			System.out.println(jokeText[i]);
			i = (i + 1) % jokeText.length;
			Thread.sleep(DELAY);
		}
	}
	

}
