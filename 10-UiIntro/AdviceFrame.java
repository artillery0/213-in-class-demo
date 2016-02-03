import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Create a frame which helps the user make decisions (Yes/no).
 * Done as a JFrame:
 * - Don't have to refer to frame.add(...), just use add()
 * - Don't have to create a JFrame for us, we *are* one.
 * - More usable inside a larger application: encapsulation.
 */
public class AdviceFrame extends JFrame {
	final int TEXT_WIDTH = 20;
	private JTextField txtThought;
	
	public AdviceFrame() {
		setLayout(new FlowLayout());

		add(makeButton("Yes", "Do it! You'll love it!"));
		add(makeTextField());
		add(makeButton("No", "Don't do it! You'll feel guilty!"));

		pack();
	}

	private JTextField makeTextField() {
		txtThought = new JTextField(TEXT_WIDTH);
		txtThought.setText("What are you thinking?");
		return txtThought;
	}

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


	// Client code: This would often be in a containing GUI class.
	public static void main(String[] args) {
		AdviceFrame advice = new AdviceFrame();
		advice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		advice.setVisible(true);
	}
}
