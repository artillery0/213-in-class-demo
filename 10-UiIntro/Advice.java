import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Create a frame which helps the user make decisions (Yes/no).
 */
public class Advice {
	public static void main(String[] args) {
		final int TEXT_WIDTH = 20;
		final JTextField txtThought = new JTextField(TEXT_WIDTH);
		txtThought.setText("What are you thinking?");
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				txtThought.setText("Do it! You'll love it!");
			}
		});

		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				txtThought.setText("Don't do it! You'll feel guilty!");
			}
		});

		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		frame.add(btnYes);		
		frame.add(txtThought);
		frame.add(btnNo);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		

	}

}
