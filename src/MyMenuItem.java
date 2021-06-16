import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MyMenuItem extends MyComponent {

	

	public MyMenuItem(String string) {
		label = string;
		position = new Point(0, 0);
		size = new Point(0, 0);
	}

	@Override
	public void draw(Graphics g) {
		if (!isVisible)
			return;
		g.setColor(Color.MAGENTA);
		g.fillRect(position.x, position.y, size.x, size.y);
		g.setColor(Color.WHITE);
		g.drawString(label, 15 + position.x, 20 + position.y);
	}

	@Override
	public void ClickEvent() {
		super.ClickEvent();
	}
	@Override
	public void isClicked(Point point) {
		if(isVisible == false)
			return;
		if (contains(point))
			ClickEvent();
	}
}
