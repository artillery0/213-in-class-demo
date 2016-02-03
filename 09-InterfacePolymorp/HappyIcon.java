import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;


public class HappyIcon implements Icon {
	private final int SIZE = 50;

	@Override
	public int getIconHeight() {
		return SIZE;
	}

	@Override
	public int getIconWidth() {
		return SIZE;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g;
		// Head
		g2d.setColor(Color.YELLOW);
		g2d.fill(new Ellipse2D.Double(x,y, SIZE, SIZE));
		
		// Eyes
		g2d.setColor(Color.BLACK);
		g2d.fill(new Ellipse2D.Double(x+15,y+15, 10, 10));
		g2d.fill(new Ellipse2D.Double(x+SIZE-15,y+15, 10, 10));
	}
}
