import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Demo showing a number of different shapes inside an icon.
 */
public class ShapeDemo {
	public static void main(String[] args) {
		
		Icon icon = new ShapeDemoIcon();
		JLabel label = new JLabel(icon);
	
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
