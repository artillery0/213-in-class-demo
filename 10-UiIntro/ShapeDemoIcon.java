import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;

/**
 * An Icon showing a number of different shapes.
 */
public class ShapeDemoIcon implements Icon{
	final static int SIZE = 350;

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
		
		// Take the basic "Graphics" context and convert to
		// more powerful Graphics2D context.
		Graphics2D g2d = (Graphics2D) g;
		
		// Play with fill and colour: 
		g2d.setColor(Color.BLUE);
		
		// Demo drawing shapes:
		drawLine(g2d);
		drawRectangle(g2d);
		drawEllipse(g2d);
		drawText(g2d);
		drawFilledRectangle(g2d);
		
		drawVortext(g2d);
	}



	private void drawLine(Graphics2D g2d) {
		// Create a line between two points.
		Point2D p1 = new Point2D.Double(15, 120);
		Point2D p2 = new Point2D.Double(120, 150);
		Shape line = new Line2D.Double(p1, p2);
		g2d.draw(line);
	}

	private void drawRectangle(Graphics2D g2d) {
		// Create a rectangle: x, y, width, height
		Shape rect = new Rectangle2D.Double(10, 10, 100, 100);
		g2d.draw(rect);
	}

	private void drawEllipse(Graphics2D g2d) {
		// Create an ellipse inside a rectangle: x, y, width, height
		Shape rect = new Ellipse2D.Double(150, 10, 120, 80);
		g2d.draw(rect);
	}

	private void drawText(Graphics2D g2d) {
		g2d.drawString("Hello world", 150, 150);
	}

	private void drawFilledRectangle(Graphics2D g2d) {
		// Create a rectangle: x, y, width, height
		Shape rect = new Rectangle2D.Double(270, 200, 50, 100);
		
		// Rather than calling draw(), call fill() to fill it.
		g2d.fill(rect);
	}

	private void drawVortext(Graphics2D g2d) {
		final double VORTEX_SIZE = 100;
		final int NUM_LINES = 15;
		final int MIDDLE_X = 110;
		final int MIDDLE_Y = 250;
		
		double stepSize = VORTEX_SIZE / NUM_LINES;
		
		for (int line = 0; line <= NUM_LINES; line++) { 
			double offset = stepSize * line;
			Point2D top    = new Point2D.Double(MIDDLE_X, MIDDLE_Y - offset);  
			Point2D bottom = new Point2D.Double(MIDDLE_X, MIDDLE_Y + offset);  
			Point2D left   = new Point2D.Double(MIDDLE_X - VORTEX_SIZE + offset, MIDDLE_Y);  
			Point2D right  = new Point2D.Double(MIDDLE_X + VORTEX_SIZE - offset, MIDDLE_Y);
			
			g2d.draw(new Line2D.Double(top, right));
			g2d.draw(new Line2D.Double(top, left));
			g2d.draw(new Line2D.Double(bottom, right));
			g2d.draw(new Line2D.Double(bottom, left));
		}
	}

}
