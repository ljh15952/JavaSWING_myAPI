import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener {

	private MyContainer container;
	private MyLayout nowLayout;

	public MyPanel() {
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

	@Override
	public void mouseClicked(MouseEvent e) {
		for (MyComponent it : container.getList()) {
			if (it.contains(e.getPoint())) {
				it.ClickEvent();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
