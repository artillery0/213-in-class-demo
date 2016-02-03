import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Put a single label in a frame (Hello world!)
 */
public class HelloWorld {
	public static void main(String[] args) {
		// Create the label:
		JLabel label = new JLabel("Hello world!");
		
		// Create the frame for it to be in.
		JFrame frame = new JFrame();                            // Make the frame
		frame.setLayout(new FlowLayout());                      // How items fit in frame.
		frame.add(label);                                       // Put label in frame.
		frame.pack();                                           // Resize to fit contents.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // When frame closes, end program.
		frame.setVisible(true);                                 // Show the frame.
	}

}
