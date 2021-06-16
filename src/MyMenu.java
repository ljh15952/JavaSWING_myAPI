import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MyMenu extends MyContainer {

	int plusX = 1;
	int plusY = 1;

	public MyMenu(String string) {
		label = string;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(position.x, position.y, size.x, size.y);
		g.setColor(Color.WHITE);
		g.drawString(label, 15 + position.x, 20 + position.y);
		for (MyComponent it : compList) {
			it.draw(g);
		}
	}

	@Override
	public void add(MyComponent c) {
		super.add(c);
		c.setBounds(10, 33 + 30 + plusY ,70, 30);
		plusY += 20;
	}

	@Override
	public void ClickEvent() {
		for (MyComponent it : compList) {
			it.isVisible = !it.isVisible;
		}
	}
}
