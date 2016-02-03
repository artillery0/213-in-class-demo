package ca.threads.primeui;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * UI to demo how threads work.
 * Allow user to launch task on main thread, or on background thread.
 * Allow user to interact with UI (change colours) to show UI thread responsiveness.
 */
public class ThreadDemoUI {
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("Thread Demo");
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		
		frame.add(new JLabel("Task Starting:"));
		frame.add(makeDoTaskButton());
		frame.add(makeThreadButton());
		
		frame.add(new JLabel("Colour Changing Buttons:"));
		frame.add(makeColourButton("Green", Color.GREEN));
		frame.add(makeColourButton("White", Color.WHITE));
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private static Component makeDoTaskButton() {
		JButton button = new JButton("Find Primes on UI Thread");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Run the task on the UI thread.
				Runnable myTask = new FindPrimeTask();
				myTask.run();
			}
		});
		return button;
	}

	private static Component makeThreadButton() {
		JButton button = new JButton("Find Primes on Background Thread");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Launch task on background thread.
				Runnable myTask = new FindPrimeTask();
				Thread myThread = new Thread(myTask);
				myThread.start();
			}
		});
		return button;
	}

	private static Component makeColourButton(String buttonText, final Color colour) {
		JButton button = new JButton(buttonText);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(colour);
			}
		});
		return button;
	}

}

