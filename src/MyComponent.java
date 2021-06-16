import java.awt.Graphics;
import java.awt.Point;

public abstract class MyComponent {
	protected String label;
	protected Point position;
	protected Point size;
	
	public void setBounds(int i, int j, int k, int l) {
		position = new Point(i, j);
		size = new Point(k, l);
	}

	public abstract void draw(Graphics g);

	public Boolean contains(Point p) {
		if (position.x <= p.x && position.y <= p.y && size.x + position.x >= p.x && size.y + position.y >= p.y) {
			return true;
		}
		return false;
	}
}
