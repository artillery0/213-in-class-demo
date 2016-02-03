import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


/**
 * Demo how to handle arrow keys.
 */
@SuppressWarnings("serial")
public class ArrowKeyDemo extends JPanel {
	// Names of arrow key actions.
	private static final String[] KEYS = {"UP", "DOWN", "LEFT", "RIGHT"};
	
	JLabel label = new JLabel("Press an arrow key to see it displayed here!\n");
	
	public ArrowKeyDemo() {
		add(label);
		add(makeNewButton());
		registerKeyPresses();

	}
	private Component makeNewButton() {
		JButton btn = new JButton("Reset");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Reset... (does nothing)!");
			}
		});
		
		// Ensure button does not grab focus and eat up arrow keys!
		// (Try commenting this out, clicking the button, and then
		//  using the arrow keys!)
		btn.setFocusable(false);
		return btn;
	}
	public void registerKeyPresses() {
		for (int i = 0; i < KEYS.length; i++) {
			String key = KEYS[i];
			this.getInputMap().put(KeyStroke.getKeyStroke(key), key);
			this.getActionMap().put(key, getKeyListener(key));
		}
	}

	public AbstractAction getKeyListener(final String move) {
		return new AbstractAction() {
			public void actionPerformed(ActionEvent evt) {
				// Do your work here...
				label.setText("You pressed " + move);
			}
		};
	}

	
	
	public static void main(String[] args) {
		// Create the frame for it to be in.
		JFrame frame = new JFrame();                            // Make the frame
		frame.setLayout(new FlowLayout());                      // How items fit in frame.
		frame.add(new ArrowKeyDemo());
		frame.pack();                                           // Resize to fit contents.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // When frame closes, end program.		
		frame.setVisible(true);                                 // Show the frame.
	}
}
