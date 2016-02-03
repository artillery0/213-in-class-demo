import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Create a frame which helps the user make decisions (Yes/no).
 * Refactored to clean up the code.
 */
public class AdviceClean {
	final int TEXT_WIDTH = 20;
	private JTextField txtThought;
	
	public AdviceClean() {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());

		frame.add(makeButton("Yes", "Do it! You'll love it!"));
		frame.add(makeTextField());
		frame.add(makeButton("No", "Don't do it! You'll feel guilty!"));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private JTextField makeTextField() {
		txtThought = new JTextField(TEXT_WIDTH);
		txtThought.setText("What are you thinking?");
		return txtThought;
	}

	// Argument final to be accessed by inner class (anon-class)
	private JButton makeButton(String buttonText, final String displayText) {
		JButton btnYes = new JButton(buttonText);
		btnYes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				txtThought.setText(displayText);
			}
		});
		return btnYes;
	}

	
	public static void main(String[] args) {
		new AdviceClean();
	}
}
