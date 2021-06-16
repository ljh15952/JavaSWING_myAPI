import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements MouseListener {

	private MyContainer container;
	private MyLayout nowLayout;

	public MyFrame() {
		addMouseListener(this);
		container = new MyContainer();
	}

	public MyContainer getContainer() {
		return container;
	}

	public void add(MyComponent c) {
		container.add(c);
	}

	public void setLayout(Object l) {
		nowLayout = (MyLayout) l;
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (nowLayout != null) {
			nowLayout.sortPosition(container, new Dimension(getWidth(), getHeight()));
		}
		for (MyComponent it : container.getList()) {
			it.draw(g);
		}
	}

	public Point clickPoint;

	@Override
	public void mouseClicked(MouseEvent e) {
		clickPoint = e.getPoint();
		for (MyComponent it : container.getList()) {
			it.isClicked(e.getPoint());
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	public void setMyMenuBar(MyMenuBar menuBar) {
		menuBar.setFrame(this);
		container.add(menuBar);
		repaint();
	}

}
