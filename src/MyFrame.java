import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements MouseListener {

	private MyContainer container;

	public MyFrame() {
		addMouseListener(this);
		container = new MyContainer();
	}

	public void setLayout() {

	}

	public void add(MyComponent c) {
		container.add(c);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (MyComponent it : container.getList()) {
			it.draw(g);
		}
	}

	private Point firstPos;

	@Override
	public void mouseClicked(MouseEvent e) {
		for (MyComponent it : container.getList()) {
			if(it.contains(e.getPoint())) {
			//	System.out.println("qweqweqweqwe");
				//it.actionPerformed();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		firstPos = new Point(e.getX(), e.getY());
	//	System.out.println(firstPos);
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
}
