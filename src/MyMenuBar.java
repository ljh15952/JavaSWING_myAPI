import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;

public class MyMenuBar extends MyContainer {

	MyLayout layout = new MyFlowLayout();
	MyFrame frame = null;

	MyMenuBar() {
		position = new Point(10, 33);
		size = new Point(0, 0);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		size.x = frame.getWidth();
		g.fillRect(position.x, position.y, size.x, size.y);
		for (MyComponent it : compList) {
			it.draw(g);
		}
	}

	public void setFrame(MyFrame myFrame) {
		frame = myFrame;
		position = new Point(10, 33);
		size = new Point(frame.getWidth(), 30);
	}

	int plusX = 0;

	public void add(MyComponent c) {
		super.add(c);
		c.setBounds(position.x + plusX, position.y, 70, 30);
		plusX += 75;
	}

	
	@Override
	public void ClickEvent() {
		super.ClickEvent();
		System.out.println("Menubar Clicked!!");
	}
}
