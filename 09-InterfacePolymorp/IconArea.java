import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 * Display the area of two icons using polymorphism.
 */
public class IconArea {
	public static void main(String[] args) {
		int areaImage = getIconArea(new ImageIcon("src/bell.png"));
		int areaHappy = getIconArea(new HappyIcon());
		
		System.out.printf("Areas are %d (image) and %d (happy).%n",
				areaImage, areaHappy);		
	}
	
	public static int getIconArea(Icon icon) {
		int width = icon.getIconWidth();
		int height = icon.getIconHeight();
		return width * height;
	}
}
