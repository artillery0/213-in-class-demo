import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;


public class SimpleGridBag extends JFrame {
	
	private static final int SIZE = 5;
	private static final int INTERNAL_SPACING = 90;
	
	public static void main(String[] args) {
		new SimpleGridBag();
	}
	
	public SimpleGridBag() {
		addContents();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();	
		setVisible(true);
	}

	private void addContents() {
		setLayout(new GridBagLayout());

		for (int i = SIZE - 1; i >= 0; i--) {
			GridBagConstraints c = new GridBagConstraints();
			
			// Position
			c.gridx = i;
			c.gridy = i;
			
			// Spacing 
			c.ipadx = INTERNAL_SPACING;
			c.ipady = INTERNAL_SPACING;
			
			// Stretch cells
			c.weightx = i % 2;
			c.weighty = 1;
			
			// Expand contest to fill cell
			c.fill = GridBagConstraints.BOTH;
			
			// Which corner to put the content in:
			// Only works when content does not expand to fill cell 
			// (i.e., when does not work when .fill is set to stretch).
//			c.anchor = GridBagConstraints.CENTER;
//			c.anchor = GridBagConstraints.NORTHWEST;
//			c.anchor = GridBagConstraints.SOUTHEAST;
			
			JLabel label = new JLabel("Item " + i);
			label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			
			add(label, c);
		}
		
	}

}
