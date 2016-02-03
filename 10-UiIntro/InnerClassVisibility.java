import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 * Demonstrate the visibility from within an inner class.
 */
public class InnerClassVisibility {
	
	private JTextPane txtPane;
	private int favNumber = 42;
	
	public InnerClassVisibility() {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		frame.add(makeButton(3.1415));		
		frame.add(makeTextPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private JButton makeButton(final double param) {
		final String local = "I'm local!";
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			
			private String innerClassField = "Inner field";
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// Access outer fields, inner fields, inner methods, parameters, locals.
				txtPane.setText(
						  "Outer field:  " + favNumber + "\n"
						+ "Final Local:  " + local + "\n"
						+ "Final Param:  " + param + "\n"
						+ "Inner filed:  " + innerClassField + "\n"
						+ "Inner method: " + getWhisdom() + "\n"
						);
			}
			
			private String getWhisdom() {
				return "Always in motion is the future.";
			}
		});
		return btnYes;
	}

	private JTextPane makeTextPane() {
		txtPane = new JTextPane();
		txtPane.setText("Click the button to show some text here!\n\n\n\n\n\n\n\n");
		return txtPane;
	}
	
	public static void main(String[] args) {
		new InnerClassVisibility();
	}

}
