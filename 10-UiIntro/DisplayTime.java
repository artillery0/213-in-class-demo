import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


/**
 * Demonstrate creating a frame with text and a button.
 * Display the current time into the text filed when the button is pressed.
 */
public class DisplayTime {
	public static void main(String[] args) {
		final int TEXT_SIZE = 30;
		final JTextField text = new JTextField(TEXT_SIZE);
		
		JButton displayTime = new JButton("Display Time");
		displayTime.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Date now = new Date();
				text.setText(now.toString());
				System.out.println("Button!");
			}
		});
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.add(text);
		frame.add(displayTime);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
