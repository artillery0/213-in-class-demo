package ca.threads.interrupting;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InterruptUI {
	private static Thread jokeThread;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Interrupting Thread Demo");
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

		frame.add(makeStartJokeButton());
		frame.add(makeInterruptButton());

		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private static Component makeStartJokeButton() {
		JButton button = new JButton("Start telling joke");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Launch task on background thread.
				Runnable jokeTask = new JokeTask();
				jokeThread = new Thread(jokeTask);
				jokeThread.start();
			}
		});
		return button;
	}

	private static Component makeInterruptButton() {
		JButton button = new JButton("Interrupt");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Interrupt the joke
				jokeThread.interrupt();
			}
		});
		return button;
	}

}

