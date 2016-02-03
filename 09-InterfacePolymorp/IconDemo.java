import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class IconDemo {

	public static void main(String[] args) {
		// Display message
		JOptionPane.showMessageDialog(null, "Hello world!");
		
		// Display message w/ icon
		Icon icon = new ImageIcon("src/bell.png");
//		Icon icon = new HappyIcon();
		JOptionPane.showMessageDialog(
				null,                  // Parent
				"Hello world!",        // Message
				"Greetings",           // Greetings
				JOptionPane.INFORMATION_MESSAGE,  // message type
				icon);                 // Icon
	}

}
