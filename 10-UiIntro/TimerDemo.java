import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;


/**
 * Disply the current time, update via a timer.
 */
public class TimerDemo {
	public static void main(String[] args) {
		final int TEXT_SIZE = 30;
		final JTextField text = new JTextField(TEXT_SIZE);
		
		final int DELAY_MS = 2000; 
		ActionListener updateText = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Date now = new Date();
				text.setText(now.toString());
				System.out.println("Updating time...");
			}
		};
		Timer timer = new Timer(DELAY_MS, updateText);
		timer.start();
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.add(text);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
