import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

public class MyToolBar extends MyContainer {

	MyLayout layout = new MyFlowLayout();

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(position.x, position.y, size.x, size.y);

		for (MyComponent it : compList) {
			layout.sortPosition(compList, position, new Dimension(size.x, size.y),50);
			it.draw(g);
		}
	}
}
